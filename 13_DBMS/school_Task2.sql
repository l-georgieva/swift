CREATE TABLE disciplines_studied(
student_id INT,
discipline_id INT,
CONSTRAINT pk_disciplines_studied PRIMARY KEY(student_id, discipline_id),
CONSTRAINT fk_disciplines_studied_students FOREIGN KEY(student_id)
REFERENCES students(student_id),
CONSTRAINT fk_disciplines_studied_disciplines FOREIGN KEY(discipline_id)
REFERENCES disciplines(discipline_id)
);

CREATE TABLE disciplines_taught(
teacher_id INT,
discipline_id INT,
CONSTRAINT pk_disciplines_taught PRIMARY KEY(teacher_id, discipline_id),
CONSTRAINT fk_disciplines_taught_teachers FOREIGN KEY(teacher_id)
REFERENCES teachers(teacher_id),
CONSTRAINT fk_disciplines_taught_disciplines FOREIGN KEY(discipline_id)
REFERENCES disciplines(discipline_id)
);