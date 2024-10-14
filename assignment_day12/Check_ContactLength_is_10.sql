CREATE TABLE Supplier
(
    Supplier_id numeric(5) PRIMARY KEY,
    Supplier_name varchar(150),
    Address varchar(150),
    City varchar(50),
    State varchar(15),
    Country varchar(15),
    Contact varchar(10)
);

ALTER TABLE Supplier
ADD CONSTRAINT chk_contact_length 
CHECK (LENGTH(Contact) = 10);

SELECT * FROM Supplier;
