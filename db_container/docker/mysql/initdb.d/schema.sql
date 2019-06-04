DROP DATABASE IF EXISTS spark_db;
CREATE DATABASE spark_db;
USE spark_db;
DROP TABLE IF EXISTS user_information;

CREATE TABLE user_information (
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name TEXT NOT NULL,
tag INT NOT NULL,
year INT NOT NULL,
description VARCHAR(200),
url VARCHAR(200)
)DEFAULT CHARACTER SET=utf8;
