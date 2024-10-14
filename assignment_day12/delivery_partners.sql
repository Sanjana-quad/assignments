CREATE TABLE customers(
	customer_id VARCHAR(10) PRIMARY KEY,
	customer_name VARCHAR(20),
	address VARCHAR(20),
	phone_no BIGINT,
	email_id VARCHAR(20)
);

INSERT INTO customers (customer_id, customer_name, address, phone_no, email_id) VALUES
('CUST1001', 'THOMAS', 'KOCHI', 9856325486, 'thomas@gmail.com'),
('CUST1002', 'CHARLES', 'ALLEPY', 9856367486, 'charles@gmail.com'),
('CUST1003', 'SUDHAKAR', 'KOCHI', 9856323869, 'sudhakar@gmail.com'),
('CUST1004', 'JAGADISH', 'ERNAKULAM', 9856326666, 'jagadish@gmail.com'),
('CUST1005', 'ALBERT', 'ALLEPY', 9856328659, 'albert@gmail.com'),
('CUST1006', 'ASHWIN DAS', 'KANNUR', 9856325659, 'ashwin@gmail.com');

CREATE TABLE delivery_partners(
	partner_id VARCHAR(10) PRIMARY KEY,
	partner_name VARCHAR(20),
	phone_no BIGINT,
	rating INT
);

INSERT INTO delivery_partners(partner_id, partner_name, phone_no, rating) VALUES
('PART001', 'Delhivery', 9876543210, 5),
('PART002', 'Shiprocket', 8765432109, 4),
('PART003', 'DHL', 7654321098, 3),
('PART004', 'Xpressbees', 6543210987, 2),
('PART005', 'ekartLogistics', 5432109876, 5),
('PART006', 'ShadowFax', 4321098765, 1),
('PART007', 'ZaitoonLogistics', 3210987654, 2),
('PART008', 'HiLog', 5537829173, 1);

CREATE TABLE hotel_details(
	hotel_id VARCHAR(10) PRIMARY KEY,
	hotel_name VARCHAR(20),
	hotel_type VARCHAR(20),
	rating INT
);

INSERT INTO hotel_details(hotel_id, hotel_name, hotel_type, rating) VALUES
('HOTEL01', 'Novotel Chennai Sipcot', 'Premium Hotel', 5),
('HOTEL02', 'Radisson Blu Hotel', 'Continental Hotel', 4),
('HOTEL03', 'Leela Palace', 'Hotel cum Event Venue', 5),
('HOTEL04', 'Fortune Beach Resort', 'Resort', 5),
('HOTEL05', 'Park Hyatt', 'BeachSide Hotel', 4),
('HOTEL06', 'Coral Drive Villa', 'Beach side Cottage', 4);

CREATE TABLE Orders(
	order_id VARCHAR(10),
	customer_id VARCHAR(10) REFERENCES customers(customer_id),
	hotel_id VARCHAR(10) REFERENCES hotel_details(hotel_id),
	partner_id VARCHAR(10) REFERENCES delivery_partners(partner_id),
	order_date DATE,
	order_amount INT
);

INSERT INTO Orders (order_id, customer_id, hotel_id, partner_id, order_date, order_amount) VALUES
('ORD001', 'CUST1001','HOTEL01','PART001','2024-10-01',150), 
('ORD002','CUST1002','HOTEL02','PART002','2024-10-02',200), 
('ORD003','CUST1003','HOTEL03','PART003','2024-10-03',250), 
('ORD004','CUST1004','HOTEL04','PART004','2024-10-04',300), 
('ORD005','CUST1005','HOTEL05','PART005','2024-10-05',350), 
('ORD006','CUST1006','HOTEL06','PART007','2024-10-06',400); 

SELECT * FROM Orders;
SELECT * FROM hotel_details;
SELECT * FROM delivery_partners;
SELECT * FROM customers;

------
SELECT delivery_partners, partner_name, phone_no FROM delivery_partners WHERE rating BETWEEN 3 and 5 ORDER BY partner_id;
------
UPDATE Customers SET Phone_no = '9876543210' WHERE Customer_id = 'CUST1004';
------
SELECT Customer_id, Customer_name, Address, Phone_no FROM Customers WHERE Email_id LIKE '%@gmail.com' ORDER BY Customer_id;
----
ALTER TABLE Customers
ADD COLUMN customer_idnum INT;
ALTER TABLE Orders
ADD COLUMN customer_idnum INT;

UPDATE Customers SET customer_idnum = CAST(REGEXP_REPLACE(customer_id, '[^0-9]', '', 'g') AS INT);
UPDATE Orders SET customer_idnum = (SELECT customer_idnum FROM customers 
WHERE customers.customer_id = orders.customer_id);

ALTER TABLE orders DROP CONSTRAINT orders_customer_id_fkey;
ALTER TABLE Customers DROP COLUMN customer_id;
ALTER TABLE Orders DROP COLUMN customer_id;
ALTER TABLE Customers RENAME COLUMN customer_idnum TO customer_id;
ALTER TABLE Orders RENAME COLUMN customer_idnum TO customer_id;

SELECT * FROM customers;
----
ALTER TABLE Hotel_Details RENAME COLUMN Rating TO Hotel_Rating;
------
SELECT CONCAT(Hotel_name, ' is a ', Hotel_type, ' hotel') AS HOTEL_INFO FROM Hotel_details ORDER BY HOTEL_INFO DESC;
------
SELECT H.Hotel_id, H.Hotel_name, COUNT(O.Order_id) AS NO_OF_ORDERS FROM Hotel_details H JOIN Orders O ON H.Hotel_id = O.Hotel_id
GROUP BY H.Hotel_id, H.Hotel_name HAVING COUNT(O.Order_id) > 5 ORDER BY H.Hotel_id ASC;
------
SELECT H.Hotel_id, H.Hotel_name, H.Hotel_type FROM Hotel_details H LEFT JOIN Orders O ON H.Hotel_id = O.Hotel_id 
AND O.Order_date BETWEEN '2019-05-01' AND '2019-05-31' WHERE O.Order_id IS NULL ORDER BY H.Hotel_id ASC;
------
SELECT O.Order_id, C.Customer_name, H.Hotel_name, O.Order_amount FROM Orders O JOIN Customers C ON O.Customer_id = C.Customer_id
JOIN Hotel_details H ON O.Hotel_id = H.Hotel_id ORDER BY O.Order_id ASC;