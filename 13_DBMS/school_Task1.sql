
CREATE DATABASE school;


USE school;



CREATE TABLE teachers(
teacher_id INT,
teacher_name VARCHAR(255) NOT NULL,
teacher_email VARCHAR(255),
teacher_salary DECIMAL(10,2),
CONSTRAINT pk_teachers PRIMARY KEY(teacher_id)

);


CREATE TABLE students(
student_id INT ,
student_name VARCHAR(255) NOT NULL,
student_enrollment_date DATE NOT NULL,
CONSTRAINT pk_students PRIMARY KEY(student_id)

);


CREATE TABLE disciplines(
discipline_id INT PRIMARY KEY,
discipline_name VARCHAR(255) NOT NULL
);
CREATE TABLE addresses(
address_id INT UNIQUE NOT NULL,
address_country VARCHAR(255) NOT NULL,
address_city VARCHAR(255) NOT NULL,
address_street VARCHAR(255) NOT NULL,
address_number VARCHAR(255) NOT NULL,
address_floor INT,
address_apartment_no INT
);
ALTER TABLE addresses
ADD CONSTRAINT fk_addresses_students FOREIGN KEY(address_id) 
    REFERENCES students(student_id);

ALTER TABLE addresses
ADD CONSTRAINT fk_addresses_teachers FOREIGN KEY(address_id) 
    REFERENCES teachers(teacher_id);
    
INSERT INTO teachers(teacher_id,teacher_name,teacher_email,teacher_salary)
VALUES
(1,'Peter Ivanov' , 'pivanov@gmail.com' ,1921.50),
(2,'Georgi Stoimenov', 'stoimenov@gmail.com', 1787.25),
(3,'Nataliya Yordanova', 'nyyoo@abv.bg', 1888.21),
(4,'Simeon Prodanov', 'sprod@yahoo.com', 1341.60);

INSERT INTO students(student_id,student_name,student_enrollment_date)
VALUES
(1,'Georgi Georgiev','2000-10-22'),
(2,'Stoyan Ivanov', '2010-11-18'),
(3,'Mariya Grozdanova','2008-05-27'),
(4,'Stefaniya Petkova', '2007-01-12');


INSERT INTO disciplines(discipline_id,discipline_name)
VALUES
(1,'Mathematics'),
(2,'Geography'),
(3,'Physics'),
(4,'Informatics');








