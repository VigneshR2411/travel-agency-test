create database pointer_db;
use pointer_db;

create table student(
id int PRIMARY KEY,
name varchar(100),
age int,
domain varchar(30)
);

INSERT INTO STUDENT VALUES
(1,'VIGNESH',21,'Java'),
(2,'RAMESH',21,'Python'),
(3,'HUGG',42,'Spy');

select * from student;
department

SELECT NAME,domain FROM STUDENT 
WHERE AGE IN (
select age from student 
WHERE AGE < 40);

