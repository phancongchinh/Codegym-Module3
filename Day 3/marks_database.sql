create database marks_database;

create table marks_database.Students (
	id varchar(20),
    name varchar(45),
    dateOfBirth date,
    classId varchar(20),
    examiner varchar(20),
    primary key (id)
);

create table marks_database.Subjects (
	id varchar(20),
    name varchar(20),
    primary key (id)
);

create table marks_database.Marks (
	studentId varchar (20),
	subjectId varchar (20),
    mark int,
    dateOfexamination date,
    foreign key (studentId) references marks_database.Students(id),
    foreign key (subjectId) references marks_database.Subjects(id)
);

create table marks_database.Teachers (
	id varchar(20),
    name varchar(45),
    tel varchar(10),
    primary key (id)
);

alter table marks_database.Subjects
	add teacherId varchar(20) after subjectId;

alter table marks_database.Subjects
	add constraint foreign_key foreign key (teacherId) references teachers (id);

