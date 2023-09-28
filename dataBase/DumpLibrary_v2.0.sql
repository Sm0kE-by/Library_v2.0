-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               8.0.30 - MySQL Community Server - GPL
-- Операционная система:         Win64
-- HeidiSQL Версия:              12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Дамп структуры базы данных library
CREATE DATABASE IF NOT EXISTS `library` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `library`;

-- Дамп структуры для таблица library.author
CREATE TABLE IF NOT EXISTS `author` (
  `id_author` int NOT NULL AUTO_INCREMENT,
  `first_name` char(20) NOT NULL,
  `second_name` char(20) NOT NULL,
  `last_name` char(20) NOT NULL,
  PRIMARY KEY (`id_author`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Дамп данных таблицы library.author: ~4 rows (приблизительно)
INSERT INTO `author` (`id_author`, `first_name`, `second_name`, `last_name`) VALUES
	(1, 'Vasiliy', 'Igorevich', 'Rakovets'),
	(2, 'Kirill', 'Vladimirovich', 'Yuranov'),
	(3, 'Denis', 'Yusufovich', 'Kuznecov'),
	(4, 'Andrey', 'Nikolaevich', 'Melnikov');

-- Дамп структуры для таблица library.product_name
CREATE TABLE IF NOT EXISTS `product_name` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type_of_printed_matter` int NOT NULL,
  `themes` int NOT NULL,
  `name` char(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '',
  `author` int DEFAULT NULL,
  `publishing_house` int NOT NULL,
  `publication_date` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `type_of_printed_matter` (`type_of_printed_matter`),
  KEY `themes` (`themes`),
  KEY `author` (`author`),
  KEY `publishing_house` (`publishing_house`),
  CONSTRAINT `product_name_ibfk_1` FOREIGN KEY (`type_of_printed_matter`) REFERENCES `type_of_printed_matter` (`id`),
  CONSTRAINT `product_name_ibfk_2` FOREIGN KEY (`themes`) REFERENCES `themes` (`id`),
  CONSTRAINT `product_name_ibfk_3` FOREIGN KEY (`author`) REFERENCES `author` (`id_author`),
  CONSTRAINT `product_name_ibfk_4` FOREIGN KEY (`publishing_house`) REFERENCES `publishing_house` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Дамп данных таблицы library.product_name: ~30 rows (приблизительно)
INSERT INTO `product_name` (`id`, `type_of_printed_matter`, `themes`, `name`, `author`, `publishing_house`, `publication_date`) VALUES
	(1, 1, 1, 'From dirt to Kings', 2, 3, 2022),
	(2, 1, 2, 'Impact of senile dementia on political views', 2, 3, 2021),
	(3, 2, 4, 'Programming algorithms for microcontrollers of the family PIC', 2, 2, 2012),
	(4, 1, 4, 'Fundamentals of the World Economy', 1, 1, 2014),
	(5, 1, 1, 'Tiered world', 4, 1, 2014),
	(6, 1, 1, 'The Hitchhiker\'s Guide to the Galaxy', 3, 1, 2017),
	(7, 1, 1, 'Faceless Hero', 3, 1, 2021),
	(8, 1, 1, 'Secret materials', 4, 1, 2017),
	(9, 1, 1, 'Galaxy news', 3, 1, 2020),
	(10, 1, 4, 'How to become a millionaire', 4, 2, 2022),
	(11, 1, 1, 'Galactic patrol', 2, 1, 2016),
	(12, 1, 1, 'Lord of the Rings', 2, 1, 2013),
	(13, 1, 3, 'Book of recipes', 4, 3, 2021),
	(14, 1, 3, 'Women\'s beauty secrets', 1, 4, 2020),
	(15, 1, 4, 'Business analytics', 1, 5, 2021),
	(16, 1, 3, 'All about winter fishing', 1, 3, 2020),
	(17, 2, 3, 'Young needleworker', NULL, 3, 2011),
	(18, 2, 3, 'Rich and beautiful', NULL, 4, 2007),
	(19, 3, 5, 'Moscow time', NULL, 1, 2010),
	(20, 3, 5, 'Chronicles of a metallurgist', NULL, 2, 2020),
	(21, 3, 5, 'Gomel truth', NULL, 3, 2014),
	(22, 2, 3, 'Healthy sleep', NULL, 4, 2018),
	(23, 3, 3, 'Health in every home', NULL, 4, 2019),
	(24, 2, 4, 'Programming for beginners', NULL, 5, 2014),
	(25, 3, 3, 'Hunting and fishing', NULL, 3, 2014),
	(26, 2, 3, 'Miss Universe', NULL, 4, 2014),
	(27, 3, 3, 'my Garden', NULL, 5, 2014),
	(28, 2, 4, 'Labor market analytics', NULL, 2, 2020),
	(29, 3, 5, 'Student News Portal', NULL, 3, 2014),
	(30, 2, 4, 'Young radio technician', NULL, 2, 2014);

-- Дамп структуры для таблица library.publishing_house
CREATE TABLE IF NOT EXISTS `publishing_house` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` char(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `country` char(20) NOT NULL,
  `city` char(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Дамп данных таблицы library.publishing_house: ~5 rows (приблизительно)
INSERT INTO `publishing_house` (`id`, `name`, `country`, `city`) VALUES
	(1, 'Eksmo', 'Russia', 'Moscow'),
	(2, 'New house', 'Russia', 'Irkutsk'),
	(3, 'Thieves and beggars', 'Belarus', 'Gomel'),
	(4, 'Cosmopolitan', 'USA', 'NY'),
	(5, 'Think', 'Romania', 'Bucharest');

-- Дамп структуры для таблица library.themes
CREATE TABLE IF NOT EXISTS `themes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `themes` char(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Дамп данных таблицы library.themes: ~6 rows (приблизительно)
INSERT INTO `themes` (`id`, `themes`) VALUES
	(1, 'fantasy'),
	(2, 'politics and business'),
	(3, 'beauty and health'),
	(4, 'scientific literature'),
	(5, 'news'),
	(6, 'leisure');

-- Дамп структуры для таблица library.type_of_printed_matter
CREATE TABLE IF NOT EXISTS `type_of_printed_matter` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name_of_printed_matter` char(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Дамп данных таблицы library.type_of_printed_matter: ~2 rows (приблизительно)
INSERT INTO `type_of_printed_matter` (`id`, `name_of_printed_matter`) VALUES
	(1, 'book'),
	(2, 'magazine'),
	(3, 'newspaper');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
