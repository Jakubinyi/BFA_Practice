SET NAMES 'utf8' COLLATE 'utf8_general_ci';

DROP DATABASE IF EXISTS `bfa`;

CREATE DATABASE `bfa` CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE `bfa`;

CREATE TABLE University (
    id INT AUTO_INCREMENT PRIMARY KEY ,
    name VARCHAR(50),
    city VARCHAR(50)
);

CREATE TABLE Student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    uid INT,
    FOREIGN KEY (uid) REFERENCES University(id)
);

INSERT INTO University(name, city) VALUES ('Miskolci Egyetem', 'Miskolc');
INSERT INTO University(name, city) VALUES ('Szegedi Tudományegyetem', 'Szeged');
INSERT INTO University(name, city) VALUES ('Debreceni Egyetem', 'Debrecen');

INSERT INTO Student(name, department, uid) VALUES ('János', 'jogász', 1);
INSERT INTO Student(name, department, uid) VALUES ('Ferenc', 'prog.terv', 1);
INSERT INTO Student(name, department, uid) VALUES ('Miklós', 'bölcsész', 1);

