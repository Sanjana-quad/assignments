CREATE TABLE salesman
(
    salesman_id numeric(5) PRIMARY KEY,
    Name varchar(30),
    City varchar(15),
    Commission decimal(5,2)
);
GO

CREATE TABLE orders
(
    Ord_no numeric(5) PRIMARY KEY,
    Purch_amt decimal(8,2),
    Ord_date DATE,
    customer_id numeric(5),
    Salesman_id numeric(5),
    FOREIGN KEY (Salesman_id) REFERENCES salesman(salesman_id)
);
GO

SELECT * FROM salesman, orders;