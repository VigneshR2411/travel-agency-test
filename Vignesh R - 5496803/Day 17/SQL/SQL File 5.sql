CREATE DATABASE IF NOT EXISTS school;
USE school;
-- Create a simple students table
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT,
    grade VARCHAR(10),
    marks DECIMAL(5,2),
    city VARCHAR(50)
);
-- Insert 5 sample records
INSERT INTO students (name, age, grade, marks, city) VALUES
('Alice Johnson', 18, 'A', 92.5, 'New York'),
('Bob Smith', 17, 'B', 78.0, 'Boston'),
('Charlie Brown', 19, 'A', 95.0, 'Chicago'),
('Diana Miller', 18, 'C', 65.5, 'Miami'),
('Ethan Davis', 17, 'B', 82.0, 'New York');
-- Fetch all students
SELECT * FROM students;