SELECT name, salary
FROM employees
WHERE salary > (
       SELECT AVG(salary)
       FROM employees
	)
    ORDER BY salary DESC
    LIMIT 3;