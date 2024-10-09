
CREATE TABLE tblCustomers (
    CustomerID INT PRIMARY KEY,
    CustomerName VARCHAR(100),
    Country VARCHAR(50) DEFAULT 'Canada'
);

CREATE TABLE tblSuppliers (
    SupplierID INT PRIMARY KEY,
    SupplierName VARCHAR(100)
);

CREATE TABLE tblShippers (
    ShipperID INT PRIMARY KEY,
    CompanyName VARCHAR(100) UNIQUE 
);


CREATE TABLE tblProducts (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(100),
    SupplierID INT,
    FOREIGN KEY (SupplierID) REFERENCES tblSuppliers(SupplierID)
);


CREATE TABLE tblOrders (
    OrderID INT PRIMARY KEY,
    CustomerID INT,
    OrderDate DATE,
    ShippedDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES tblCustomers(CustomerID),
    CHECK (ShippedDate > OrderDate)
);


CREATE TABLE tblOrderDetails (
    OrderDetailID INT PRIMARY KEY,
    OrderID INT,
    ProductID INT,
    Quantity INT CHECK (Quantity > 0),
    FOREIGN KEY (OrderID) REFERENCES tblOrders(OrderID),
    FOREIGN KEY (ProductID) REFERENCES tblProducts(ProductID)
);




INSERT INTO tblCustomers (CustomerID, CustomerName, Country)
VALUES 
(1, 'John Doe', 'USA'),
(2, 'Alice Smith', 'Canada'),
(3, 'Emma Brown', DEFAULT);  


INSERT INTO tblSuppliers (SupplierID, SupplierName)
VALUES 
(1, 'Global Supplies'),
(2, 'Local Distributors'),
(3, 'Mega Corp');


INSERT INTO tblShippers (ShipperID, CompanyName)
VALUES 
(1, 'Fast Delivery'),
(2, 'Express Logistics'),
(3, 'Safe Shippers');


INSERT INTO tblProducts (ProductID, ProductName, SupplierID)
VALUES 
(1, 'Laptop', 1),
(2, 'Smartphone', 2),
(3, 'Tablet', 3);


INSERT INTO tblOrders (OrderID, CustomerID, OrderDate, ShippedDate)
VALUES 
(1, 1, '2024-10-01', '2024-10-05'),
(2, 2, '2024-10-03', '2024-10-06'),
(3, 3, '2024-10-02', '2024-10-07');


INSERT INTO tblOrderDetails (OrderDetailID, OrderID, ProductID, Quantity)
VALUES 
(1, 1, 1, 5),  -- 5 Laptops
(2, 2, 2, 10), -- 10 Smartphones
(3, 3, 3, 2);  -- 2 Tablets

SELECT * FROM tblCustomers;
SELECT * FROM tblSuppliers;
SELECT * FROM tblShippers;
SELECT * FROM tblProducts;
SELECT * FROM tblOrders;
SELECT * FROM tblOrderDetails;
