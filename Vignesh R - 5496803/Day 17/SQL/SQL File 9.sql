CREATE DATABASE shop_db;

USE shop_db;

CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    email VARCHAR(100)
);

CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    order_date DATE,
    customer_id INT
);

INSERT INTO customers (customer_id, customer_name, email) VALUES
(1, 'John Doe', 'john@example.com'),
(2, 'Jane Smith', 'jane@example.com'),
(3, 'Alice Brown', 'alice@example.com');

INSERT INTO orders (order_id, order_date, customer_id) VALUES
(101, '2024-01-10', 1),
(102, '2024-01-12', 2),
(103, '2024-01-15', 4),   
(104, '2024-01-18', 5);  

SELECT o.order_id
FROM orders o
LEFT JOIN customers c
    ON o.customer_id = c.customer_id
WHERE c.customer_id IS NULL;
