SELECT D.Dept_Name, COUNT(E.Employee_ID) AS Total_Employees
FROM Employee E
JOIN Department D
ON E.Dept = D.Dept_ID
GROUP BY D.Dept_Name;

SELECT D.Dept_ID, COUNT(E.Emp_ID) AS Total_Employees
FROM Employees E
JOIN Department D
ON E.Dept = D.Dept_ID
GROUP BY D.Dept_ID
HAVING COUNT(E.Emp_ID) > 1;