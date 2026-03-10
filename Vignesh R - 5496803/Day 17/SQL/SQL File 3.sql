-- Create employees table
CREATE TABLE employees (
    emp_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    department VARCHAR(50),
    join_date DATE,
    salary DECIMAL(10,2)
);

-- Insert sample data
INSERT INTO employees (name, department, join_date, salary) VALUES
('Vignesh', 'IT', '2024-01-15', 45000),
('Rahul', 'HR', '2024-03-10', 40000),
('Anita', 'Finance', '2024-06-05', 50000),
('Kumar', 'IT', '2024-09-20', 55000),
('Sita', 'Marketing', '2024-11-12', 42000),
('Arjun', 'IT', '2023-08-18', 47000);

-- Query: Employees who joined in 2024 (latest first, limit 5)
SELECT *
FROM employees
WHERE YEAR(join_date) = 2026
ORDER BY join_date DESC
LIMIT 5;
