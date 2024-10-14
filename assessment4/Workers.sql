CREATE TABLE worker(
worker_id SERIAL PRIMARY KEY,
first_name VARCHAR(10),
last_name VARCHAR(10),
salary INT,
join_date DATE,
dept VARCHAR(10)
);

INSERT INTO worker(first_name,last_name,salary,join_date,dept) VALUES
('Monika','Aurora',100000,'2020-02-14','HR'),
('Niharika','verma',80000,'2011-02-14','Admin'),
('Vishal','Singhal',300000,'2020-02-14','HR'),
('Amitabh','Singh',500000,'2020-02-14','Admin'),
('Vivek','Bhati',500000,'2011-06-14','Admin'),
('Vipul', 'Diwan',200000,'2011-06-14','Account'),
('Satish','Kumar',75000,'2020-01-14','Account'),
('Geethika','Chauhan',90000,'2011-04-14','Admin');

CREATE TABLE bonus(
worker_ref_id INT,
bonus_amt INT,
bonus_date DATE,
FOREIGN KEY (worker_ref_id) REFERENCES worker(worker_id)
);

CREATE TABLE title(
worker_ref_id INT,
worker_title varchar(20),
affected_from DATE,
FOREIGN KEY (worker_ref_id) REFERENCES worker(worker_id)
);

INSERT INTO bonus(worker_ref_id,bonus_amt,bonus_date) VALUES
(1,5000,'2020-02-16'),(2,3000,'2011-06-16'),(3,4000,'2020-02-16'),
(1,4500,'2020-02-16'),(2,3500,'2011-02-16'),(4,4500,'2020-02-16'),(5,3500,'2011-02-16');

INSERT INTO title(worker_ref_id,worker_title,affected_from) VALUES
(1,'Manager','2016-02-20'),
(2,'Executive','2016-06-11'),
(8,'Executive','2016-06-11'),
(5,'Manager','2016-06-11'),
(4,'Asst. Manager','2016-06-11'),
(7,'Executive','2016-06-11'),
(6,'Lead','2016-06-11'),
(3,'Lead','2016-06-11');

SELECT * FROM worker,bonus,title;

SELECT worker.first_name, worker.salary,title.worker_title FROM worker JOIN title ON worker.worker_id = title.worker_ref_id;

CREATE OR REPLACE FUNCTION count_worker_nth_highest_salary(nth INT)
RETURNS INT AS $$
DECLARE
    nth_salary INT;
    worker_count INT;
BEGIN
    WITH ranked_salaries AS (
        SELECT DISTINCT salary
        FROM worker
        ORDER BY salary DESC
        OFFSET nth - 1 LIMIT 1
    )
    SELECT INTO nth_salary salary FROM ranked_salaries;

    -- If nth_salary is NULL, return 0 (no such salary)
    IF nth_salary IS NULL THEN
        RETURN 0;
    END IF;

    SELECT COUNT(*) INTO worker_count 
    FROM worker 
    WHERE salary = nth_salary;

    RETURN worker_count;
END;
$$
 LANGUAGE plpgsql;

 SELECT count_worker_nth_highest_salary(4);