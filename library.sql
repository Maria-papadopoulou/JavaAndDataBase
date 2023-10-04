-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Εξυπηρετητής: 127.0.0.1
-- Χρόνος δημιουργίας: 04 Οκτ 2023 στις 11:49:55
-- Έκδοση διακομιστή: 10.4.28-MariaDB
-- Έκδοση PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Βάση δεδομένων: `library`
--

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `book`
--

CREATE TABLE `book` (
  `bid` int(4) NOT NULL,
  `title` varchar(35) DEFAULT NULL,
  `pub_year` int(4) DEFAULT NULL,
  `author` varchar(35) DEFAULT NULL,
  `available_books` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Άδειασμα δεδομένων του πίνακα `book`
--

INSERT INTO `book` (`bid`, `title`, `pub_year`, `author`, `available_books`) VALUES
(1, 'JAVA ', 2015, 'Liakeas', 5),
(2, 'Electronics', 2021, 'tsortas', 14),
(3, 'Web Application Programming', 2016, 'Author', 4),
(4, 'Artificial Intelligence', 2021, 'Peter Norvig', 9),
(5, 'Digital signal processing', 2018, 'Veloni', 10),
(6, 'Algorithm design and analysis', 2017, 'Thomas H. Cormen', 4),
(7, 'Circuit Theory', 2020, 'Alexander C', 3),
(8, 'Differential Equations ', 2015, 'Mylonas N.', 13);

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `user`
--

CREATE TABLE `user` (
  `uid` int(2) NOT NULL,
  `name` varchar(150) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `address` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `category` varchar(100) NOT NULL,
  `sex` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Άδειασμα δεδομένων του πίνακα `user`
--

INSERT INTO `user` (`uid`, `name`, `phone`, `address`, `username`, `password`, `category`, `sex`, `email`) VALUES
(1, 'Admin', '210586907', 'Athens', 'admin1', 'admin2', 'administrator', 'female', 'admin1@library.com'),
(2, 'Maria Papadopoulou', '2105783946', 'Athens', 'ice20390178', 'mariap2385763', 'student', 'female', 'ice20390178@uniwa.gr'),
(3, 'Sofia Papadopoulou', '2105763845', 'Ioannina', 'sofiap', 'sofiap1234567', 'student', 'female', 'sofia_papadopoulou@hotmail.com'),
(4, 'Γιώργος Ιωάννου', '2107859634', 'Κυψέλης 190', 'giwrgos_iwannou', 'giwrgosiwannou09876', 'student', 'male', 'giwrgos_iwannou@uniwa.gr'),
(5, 'Maria Papadopoulou', '2104587213', 'Athens 52B', 'maria_papadopoulou', 'mariap123', 'student', 'female', 'ice12345678@uniwa.gr');

--
-- Ευρετήρια για άχρηστους πίνακες
--

--
-- Ευρετήρια για πίνακα `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`bid`);

--
-- Ευρετήρια για πίνακα `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`uid`);

--
-- AUTO_INCREMENT για άχρηστους πίνακες
--

--
-- AUTO_INCREMENT για πίνακα `book`
--
ALTER TABLE `book`
  MODIFY `bid` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT για πίνακα `user`
--
ALTER TABLE `user`
  MODIFY `uid` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
