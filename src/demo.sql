CREATE TABLE students(
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50),
    dept_id INT
);

CREATE TABLE courses(
    id SERIAL PRIMARY KEY,
    course_name VARCHAR(50),
    faculty_id INT
);

CREATE TABLE faculty(
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50)
);

CREATE TABLE departments(
    id SERIAL PRIMARY KEY,
    dept_name VARCHAR(50)
);

CREATE TABLE attendance(
    id SERIAL PRIMARY KEY,
    student_id INT,
    status VARCHAR(10)
);
--insert queries
INSERT INTO students(name, email, dept_id) VALUES
('Ruman', 'ruman@gmail.com', 1),
('Mariyam', 'mariyam@gmail.com', 2),
('Rimsha', 'rimsha@gmail.com', 1),
('Neha', 'neha@gmail.com', 3),
('Samina', 'samina@gmail.com', 2),
('Aman', 'aman@gmail.com', 1),
('Iqra', 'iqra@gmail.com', 3),
('Rahul', 'rahul@gmail.com', 2),
('Pooja', 'pooja@gmail.com', 3),
('Sumit', 'sumit@gmail.com', 1);

INSERT INTO departments(dept_name) VALUES
('IT'),
('Computer Science'),
('Electronics'),
('Mechanical'),
('Civil'),
('AI'),
('HR'),
('Finance'),
('Marketing'),
('Operations');

INSERT INTO faculty(name, department) VALUES
('Dr. Sharma', 'IT'),
('Prof. Khan', 'CS'),
('Dr. Mehta', 'Electronics'),
('Dr. Singh', 'Mechanical'),
('Prof. Das', 'Civil'),
('Dr. Rao', 'AI'),
('Prof. Jain', 'HR'),
('Dr. Patel', 'Finance'),
('Prof. Bose', 'Marketing'),
('Dr. Verma', 'Operations');

INSERT INTO courses(course_name, faculty_id) VALUES
('Java', 1),
('SQL', 2),
('AI Basics', 6),
('Electronics I', 3),
('Thermodynamics', 4),
('AutoCAD', 5),
('HR Skills', 7),
('Finance 101', 8),
('Marketing Basics', 9),
('Management', 10);

INSERT INTO attendance(student_id, status) VALUES
(1, 'Present'),
(2, 'Absent'),
(3, 'Present'),
(4, 'Present'),
(5, 'Absent'),
(6, 'Present'),
(7, 'Present'),
(8, 'Absent'),
(9, 'Present'),
(10,'Present');

--select queries
SELECT * FROM students;
SELECT * FROM students WHERE dept_id = 1;
SELECT * FROM students WHERE name LIKE 'A%';
SELECT * FROM students WHERE id BETWEEN 3 AND 7;

--order by
SELECT * FROM students ORDER BY name;
SELECT * FROM attendance ORDER BY id DESC;

 --group by
SELECT department, COUNT(*) 
FROM faculty 
GROUP BY department;
SELECT course_name, COUNT(*) 
FROM course 
GROUP BY course_name 
HAVING COUNT(*) > 0;

-- join queries
SELECT s.name, d.dept_name 
FROM students s
INNER JOIN departments d ON s.dept_id = d.id;

SELECT s.name, f.name AS faculty_name, f.department
FROM students s
INNER JOIN faculty f
ON s.dept_id = (
    SELECT id FROM departments WHERE dept_name = f.department
);

SELECT c.course_name, f.name 
FROM course c
LEFT JOIN faculty f ON c.faculty_id = f.id;

SELECT s.name, a.status
FROM students s
LEFT JOIN attendance a ON s.id = a.student_id;

SELECT f.name, c.course_name
FROM faculty f
LEFT JOIN course c ON f.id = c.faculty_id;

SELECT d.dept_name, f.name
FROM departments d
LEFT JOIN faculty f ON d.dept_name = f.department;

SELECT c.course_name, d.dept_name
FROM course c
LEFT JOIN departments d
ON c.faculty_id = d.id;

SELECT d.dept_name, s.name AS student_name
FROM students s
RIGHT JOIN departments d
ON s.dept_id = d.id;

SELECT a.status, s.name 
FROM attendance a
RIGHT JOIN students s ON a.student_id = s.id;

SELECT s.name, a.status
FROM students s
RIGHT JOIN attendance a ON a.student_id = s.id;


