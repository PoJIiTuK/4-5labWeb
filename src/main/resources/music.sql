CREATE DATABASE IF NOT EXISTS chaykovskiy_db;
USE chaykovskiy_db ;

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS sing;
DROP TABLE IF EXISTS user_profile;
DROP TABLE IF EXISTS information;
DROP TABLE IF EXISTS albom;
DROP TABLE IF EXISTS performer;
DROP TABLE IF EXISTS music_lable;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE IF NOT EXISTS sing(
	id INT NOT NULL AUTO_INCREMENT,
	dcbl VARCHAR(45) NOT NULL,
	singname VARCHAR(45) NOT NULL,
PRIMARY KEY (id))
ENGINE = InnoDB;




CREATE TABLE IF NOT EXISTS user_profile (
  id INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) NOT NULL,
  surname VARCHAR(45) NOT NULL,
  PRIMARY KEY (id))
ENGINE = InnoDB;

SELECT * FROM user WHERE id BETWEEN 1 AND 3;



CREATE TABLE IF NOT EXISTS information (
  id INT NOT NULL AUTO_INCREMENT,
  year INT NOT NULL,
  time_code VARCHAR(45) NOT NULL,
  PRIMARY KEY (id))
ENGINE = InnoDB;

SELECT * FROM information WHERE year > 2000;



CREATE TABLE IF NOT EXISTS albom (
 id INT NOT NULL AUTO_INCREMENT,
 number_sings VARCHAR(45) NOT NULL,
 all_time_code VARCHAR(45) NOT NULL,
  PRIMARY KEY (id)
 )
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS performer (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  surname VARCHAR(45) NOT NULL,
  country VARCHAR(45) NOT NULL,
  PRIMARY KEY (id)
  )
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS music_lable (
  id INT NOT NULL AUTO_INCREMENT,
  director VARCHAR(45) NOT NULL,
  performer VARCHAR(45) NOT NULL,
  budget VARCHAR(45) NOT NULL,
  PRIMARY KEY (id)
)
ENGINE = InnoDB;


REPLACE INTO sing (id, dcbl, singname) VALUES
(1,'64','WD');
REPLACE INTO sing (id, dcbl, singname) VALUES
(2,'256','Rolls');
REPLACE INTO sing (id, dcbl, singname) VALUES
(3,'256','The Best');
REPLACE INTO sing (id, dcbl, singname) VALUES
(4,'256','wtff');
REPLACE INTO sing (id, dcbl, singname) VALUES
(5,'256','sunny');
REPLACE INTO sing (id, dcbl, singname) VALUES
(6,'256','Bit');
REPLACE INTO sing (id, dcbl, singname) VALUES
(7,'256','Sunday');
REPLACE INTO sing (id, dcbl, singname) VALUES
(8,'256','Summer');
REPLACE INTO sing (id, dcbl, singname) VALUES
(9,'128','Dance up');
REPLACE INTO sing (id, dcbl, singname) VALUES
(10,'256','Colibry');

REPLACE INTO user_profile (id, username, surname) VALUES
(1,'Ivan','Paymanow');
REPLACE INTO user_profile (id, username, surname) VALUES
(2,'Oleg','Paymanow');
REPLACE INTO user_profile (id, username, surname) VALUES
(3,'Vasa','Paymanow');
REPLACE INTO user_profile (id, username, surname) VALUES
(4,'Olga','Paymanow');
REPLACE INTO user_profile (id, username, surname) VALUES
(5,'Egor','Creed');
REPLACE INTO user_profile (id, username, surname) VALUES
(6,'Coma','Paymanow');
REPLACE INTO user_profile (id, username, surname) VALUES
(7,'Andriy','Paymanow');
REPLACE INTO user_profile (id, username, surname) VALUES
(8,'Nikita','Paymanow');
REPLACE INTO user_profile (id, username, surname) VALUES
(9,'Vsaya','Paymanow');
REPLACE INTO user_profile (id, username, surname) VALUES
(10,'Ivan','Paymanow');

INSERT INTO information (id, year,time_code) VALUES
(1,'2000','3-45');
INSERT INTO information (id, year,time_code) VALUES
(2,'2010','3-45');
INSERT INTO information (id, year,time_code) VALUES
(3,'2020','3-45');
INSERT INTO information (id, year,time_code) VALUES
(4,'2012','3-45');
INSERT INTO information (id, year,time_code) VALUES
(5,'2003','3-45');
INSERT INTO information (id, year,time_code) VALUES
(6,'1995','3-45');
INSERT INTO information (id, year,time_code) VALUES
(7,'2014','3-45');
INSERT INTO information (id, year,time_code) VALUES
(8,'2017','3-45');
INSERT INTO information (id, year,time_code) VALUES
(9,'2019','3-45');
INSERT INTO information (id, year,time_code) VALUES
(10,'2011','3-45');




REPLACE INTO performer (id, name, surname, country) VALUES
(1,'Андрій','Садовий','Україна');
REPLACE INTO performer (id, name, surname, country) VALUES
(2,'Іван','Наві','Україна');
REPLACE INTO performer (id, name, surname, country) VALUES
(3,'Ані','Вишня','Україна');
REPLACE INTO performer (id, name, surname, country) VALUES
(4,'Lil','Pump','usa');
REPLACE INTO performer (id, name, surname, country) VALUES
(5,'Ева','Бенгер','Польща');
REPLACE INTO performer (id, name, surname, country) VALUES
(6,'Андрій','Каваров','Україна');
REPLACE INTO performer (id, name, surname, country) VALUES
(7,'Ван','Гог','Італія');
REPLACE INTO performer (id, name, surname, country) VALUES
(8,'Мама','Ріка','Україна');
REPLACE INTO performer (id, name, surname, country) VALUES
(9,'Антон','Шталов','Україна');
REPLACE INTO performer (id, name, surname, country) VALUES
(10,'Міша','Круг','Україна');

REPLACE INTO music_lable (id,director,performer,budget) VALUES
(1,'Пономарев','Дядя Толік',10000);
REPLACE INTO music_lable (id,director,performer,budget) VALUES
(2,'Пономарев','Гоголь',10000);
REPLACE INTO music_lable (id,director,performer,budget) VALUES
(3,'Пономарев','Вашинхтон',10000);
REPLACE INTO music_lable (id,director,performer,budget) VALUES
(4,'Пономарев','Вандердекен',10000);
REPLACE INTO music_lable (id,director,performer,budget) VALUES
(5,'Пономарев','Пайманов',10000);
REPLACE INTO music_lable (id,director,performer,budget) VALUES
(6,'Пономарев','Нави',10000);
REPLACE INTO music_lable (id,director,performer,budget) VALUES
(7,'Пономарев','Мозги',10000);
REPLACE INTO music_lable (id,director,performer,budget) VALUES
(8,'Пономарев','Чайковський',10000);
REPLACE INTO music_lable (id,director,performer,budget) VALUES
(9,'Пономарев','Няша',10000);
REPLACE INTO music_lable (id,director,performer,budget) VALUES
(10,'Пономарев','Кіт',10000);

