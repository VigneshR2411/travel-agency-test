use employee_db;

select column_name, Aggregate_Function
from table_name
group by column_name
having condition
 
select * from employees;
 
alter table employees add salary int;
SET SQL_SAFE_UPDATES = 0;
UPDATE employees SET salary = 50000 WHERE Emp_ID = 1;
UPDATE employees SET salary = 45000 WHERE emp_id = 2;
UPDATE employees SET salary = 60000 WHERE emp_id = 3;
 
select *from Department;
 
SELECT D.Dept_Name, AVG(E.Salary) AS Avg_Salary
FROM Employees E
JOIN Department D
ON E.Dept_ID = D.Dept_ID
GROUP BY D.Dept_Name
HAVING AVG(E.Salary) > 45000;
 
 
SELECT emp_id, name, salary, COUNT(*) 
FROM employees
GROUP BY emp_id, name, salary
HAVING salary > 50000;
 
SELECT D.Dept_ID, COUNT(E.Emp_ID) AS Total_Employees
FROM Employees E
JOIN Department D
ON E.Dept = D.Dept_ID
GROUP BY D.Dept_ID
HAVING COUNT(E.Emp_ID) > 1;
 
SELECT D.Dept_Name, COUNT(E.Employee_ID) AS Total_Employees
FROM Employee E
JOIN Department D
ON E.Dept = D.Dept_ID
GROUP BY D.Dept_Name;
 
select * from employees;
select * from department;
 
select D.Dept_Name, count(E.Emp_ID) as Total_Employees
from Employees E 
join Department D 
on E.Dept_ID=D.Dept_ID
GROUP BY D.Dept_Name
HAVING COUNT(E.Emp_ID)>0;
 

CREATE table Department
(
Dept_ID int,
Dept_Name varchar(100)
);
insert into Department values(101, 'HR'), (102, 'IT'), (104, 'Finance');

CREATE table EMPLOYEES(
Emp_ID int,
Name varchar(80),
Dept_ID int
);
insert into Employees values(1, 'Vinay', 101), (2, 'Sonali', 102), (3, 'Radhya', 103);