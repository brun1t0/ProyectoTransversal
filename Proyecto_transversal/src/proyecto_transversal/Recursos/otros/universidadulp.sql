-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-09-2023 a las 22:52:03
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `universidadulp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `idAlumno` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`idAlumno`, `dni`, `nombre`, `apellido`, `fechaNacimiento`, `estado`) VALUES
(18, 12345678, 'María Laura', 'Mendez', '1999-07-26', 1),
(19, 23456789, 'Antonio Jose', 'Jimenez', '1999-06-24', 1),
(20, 34567891, 'Julio', 'Hernandez', '2000-12-02', 1),
(21, 84875895, 'Miguel', 'Ramirez', '2002-09-01', 1),
(24, 60069875, 'Lisandra', 'Rodriguez', '1998-10-25', 1),
(25, 65478932, 'Keila', 'Quijada', '2002-12-17', 1),
(26, 59634867, 'Hilda', 'Gallardo', '2000-05-19', 1),
(27, 87546213, 'Yoel', 'Alvarez', '2003-07-09', 1),
(28, 98765432, 'Flor', 'Cuicas', '1997-03-11', 0),
(29, 87546217, 'Aaron', 'Lopez', '1999-06-24', 1),
(30, 98765412, 'Luisina', 'Velazquez', '2000-10-30', 0),
(31, 23456733, 'Luis', 'Velero', '1997-06-10', 1),
(32, 98765466, 'Jose Antonio', 'Chirinos', '1998-11-03', 0),
(33, 87546289, 'Juanita', 'Henriquez', '1999-04-13', 0),
(34, 98765480, 'Beatriz', 'Gonzalez', '2003-02-26', 1),
(35, 65478930, 'Yazmin', 'Carrasco', '2003-05-28', 1),
(36, 12345500, 'Julio', 'Mendoza', '2000-04-19', 1),
(37, 87546565, 'Hernan', 'Villalobos', '1995-10-18', 0),
(38, 98765488, 'Jorgelis', 'Martinez', '1999-12-22', 0),
(39, 45645678, 'Jhoan', 'Garcia', '1995-11-25', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `idInscripto` int(11) NOT NULL,
  `nota` int(11) NOT NULL,
  `idAlumno` int(11) NOT NULL,
  `idMateria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `idMateria` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `año` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`idMateria`, `nombre`, `año`, `estado`) VALUES
(5, 'Matematica1', 1, 1),
(6, 'Matematica2', 2, 1),
(7, 'Lenguaje1', 1, 1),
(8, 'Lenguaje2', 2, 1),
(9, 'Historia Universal', 1, 1),
(10, 'Geografia', 2, 1),
(11, 'Biologia1', 1, 1),
(12, 'Biologia2', 2, 1),
(13, 'Contabilidad', 1, 1),
(14, 'Comercio', 2, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`idAlumno`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`idInscripto`),
  ADD KEY `idAlumno` (`idAlumno`),
  ADD KEY `idMateria` (`idMateria`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`idMateria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `idAlumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  MODIFY `idInscripto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `idMateria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`),
  ADD CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`idMateria`) REFERENCES `materia` (`idMateria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
