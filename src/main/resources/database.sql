-- DROP DATABASE IF EXISTS "StudentsDB";

CREATE DATABASE "StudentsDB"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_United States.1252'
    LC_CTYPE = 'English_United States.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;


-- Створення таблиці студентів
-- DROP TABLE IF EXISTS public."Students";

CREATE TABLE IF NOT EXISTS public."Students"
(
    "ID" integer NOT NULL DEFAULT nextval('"Students_ID_seq"'::regclass),
    "LastName" character varying(255) COLLATE pg_catalog."default" NOT NULL,
    "FirstName" character varying(255) COLLATE pg_catalog."default" NOT NULL,
    "Patronymic" character varying(255) COLLATE pg_catalog."default" NOT NULL,
    "BirthDate" date NOT NULL,
    "RecordBookNumber" character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT "Students_pkey" PRIMARY KEY ("ID")
    )


-- Заповення таблиці даними
    INSERT INTO public."Students" ("LastName", "FirstName", "Patronymic", "BirthDate", "RecordBookNumber")
    VALUES
('Lastname1', 'Firstname1', 'Patronymic1', '1990-01-01', '12345'),
('Lastname2', 'Firstname2', 'Patronymic2', '1991-02-02', '23456'),
('Lastname3', 'Firstname3', 'Patronymic3', '1992-03-03', '34567'),
('Lastname4', 'Firstname4', 'Patronymic4', '1993-04-04', '45678'),
('Lastname5', 'Firstname5', 'Patronymic5', '1994-05-05', '56789'),
('Lastname6', 'Firstname6', 'Patronymic6', '1995-06-08', '67890'),
('Lastname7', 'Firstname7', 'Patronymic7', '1996-07-07', '78901'),
('Lastname8', 'Firstname8', 'Patronymic8', '1997-08-08', '89012'),
('Lastname9', 'Firstname9', 'Patronymic9', '1998-09-09', '90123'),
('Lastname10', 'Firstname10', 'Patronymic10', '1999-10-10', '01234'),
('Lastname11', 'Firstname11', 'Patronymic11', '2000-11-11', '12340'),
('Lastname12', 'Firstname12', 'Patronymic12', '2001-12-12', '23451'),
('Lastname13', 'Firstname13', 'Patronymic13', '2002-01-13', '34562'),
('Lastname14', 'Firstname14', 'Patronymic14', '2003-02-14', '45673'),
('Lastname15', 'Firstname15', 'Patronymic15', '2004-03-15', '56784'),
('Lastname16', 'Firstname16', 'Patronymic16', '2005-04-16', '67895'),
('Lastname17', 'Firstname17', 'Patronymic17', '2006-05-17', '78906'),
('Lastname18', 'Firstname18', 'Patronymic18', '2007-07-18', '89017'),
('Lastname19', 'Firstname19', 'Patronymic19', '2008-07-19', '90128'),
('Lastname20', 'Firstname20', 'Patronymic20', '2009-08-20', '01239'),
('Lastname21', 'Firstname21', 'Patronymic21', '2010-09-21', '12349'),
('Lastname22', 'Firstname22', 'Patronymic22', '2011-10-22', '23459'),
('Lastname23', 'Firstname23', 'Patronymic23', '2012-11-23', '34569'),
('Lastname24', 'Firstname24', 'Patronymic24', '2013-12-24', '45679'),
('Lastname25', 'Firstname25', 'Patronymic25', '2014-01-25', '56789'),
('Lastname26', 'Firstname26', 'Patronymic26', '2015-02-26', '67890'),
('Lastname27', 'Firstname27', 'Patronymic27', '2016-03-27', '78901'),
('Lastname28', 'Firstname28', 'Patronymic28', '2017-04-28', '89012'),
('Lastname29', 'Firstname29', 'Patronymic29', '2018-05-29', '90123'),
('Lastname30', 'Firstname30', 'Patronymic30', '2019-09-30', '01234');