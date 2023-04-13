CREATE DATABASE IF NOT EXISTS friends_of_people;
USE friends_of_people;

CREATE TABLE cat
(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_animal VARCHAR(45),
    data_of_buthey DATE,
    comands TEXT
);
CREATE TABLE dog
(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_animal VARCHAR(45),
    data_of_buthey DATE,
    comands TEXT
);
CREATE TABLE hamster
(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_animal VARCHAR(45),
    data_of_buthey DATE,
    comands TEXT
);
CREATE TABLE horse
(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_animal VARCHAR(45),
    data_of_buthey DATE,
    comands TEXT
);
CREATE TABLE donkey
(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_animal VARCHAR(45),
    data_of_buthey DATE,
    comands TEXT
);
CREATE TABLE camel
(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_animal VARCHAR(45),
    data_of_buthey DATE,
    comands TEXT
);

INSERT cat(name_animal, data_of_buthey, comands)
VALUES
	("Чуча",  "2012-4-15", "GO, STOP, RUN_AWAY, COME_UP, LIE, JUMP, STAND_UP");

INSERT dog(name_animal, data_of_buthey, comands)
VALUES
    ("Агамма", "2022-08-02", "GO, STOP, RUN_AWAY, COME_UP, LIE, JUMP, STAND_UP");
    
INSERT hamster(name_animal, data_of_buthey, comands)
VALUES
    ("Малыш", "2022-03-12", "GO, STOP, RUN_AWAY, COME_UP, LIE, JUMP, STAND_UP");
    
INSERT horse(name_animal, data_of_buthey, comands)
VALUES
    ("Мультик", "2015-01-30", "GO, STOP, RUN_AWAY, COME_UP, LIE, JUMP, STAND_UP");
    
INSERT camel(name_animal, data_of_buthey, comands)
VALUES
    ("Жора", "2021-11-20", "GO, STOP, RUN_AWAY, COME_UP, LIE, JUMP, STAND_UP");
    
INSERT donkey(name_animal, data_of_buthey, comands)
VALUES
    ("Иа", "2017-04-05", "GO, STOP, RUN_AWAY, COME_UP, LIE, JUMP, STAND_UP");
    
DROP TABLE camel;

CREATE TABLE pack_animal
(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_animal VARCHAR(45),
    data_of_buthey DATE,
    comands TEXT
);

SELECT * FROM horse 
UNION SELECT * FROM donkey;

-- не успеваю доделать

