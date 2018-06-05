-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 05 Juin 2018 à 15:36
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `jpublankproject`
--

DELIMITER $$
--
-- Procédures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `ActualScore`(IN `points` INT(15), IN `p_nickname` VARCHAR(15), IN `w_nickname` VARCHAR(15))
    NO SQL
BEGIN
    CALL UpdateScoreNickname(points, p_nickname);
    CALL ShowActualUserScore(w_nickname);
  END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `AddShowScore`(IN `points` INT(15), IN `p_nickname` VARCHAR(15))
    NO SQL
BEGIN
    CALL UpdateScoreNickname(points, p_nickname);
    CALL Show5BestUsers;
  END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `loadmapById`(IN `p_id` INT)
    NO SQL
SELECT * FROM map WHERE map_id = p_id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `loadmapByKey`(IN `p_key` VARCHAR(50))
    NO SQL
SELECT * FROM jpublankproject.map where `map_name`=p_key$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Show5BestUsers`()
    NO SQL
SELECT SUM(score), nickname FROM score GROUP BY nickname ORDER BY score DESC LIMIT 5$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ShowActualUserScore`(IN `w_nickname` VARCHAR(15))
    NO SQL
SELECT SUM(score), nickname AS Score FROM score WHERE nickname = w_nickname$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ShowNicknamesScores`()
    NO SQL
SELECT nickname, score
  FROM score
  ORDER BY score DESC LIMIT 5$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ShowScores`()
    NO SQL
SELECT nickname, score
  FROM score
  GROUP BY score ORDER BY score DESC LIMIT 5$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `UpdateScoreNickname`(IN `points` INT(15), IN `p_nickname` VARCHAR(15))
    NO SQL
INSERT INTO score (score, nickname) VALUES(points, p_nickname)$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `map`
--

CREATE TABLE IF NOT EXISTS `map` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `map_name` varchar(50) CHARACTER SET latin1 NOT NULL,
  `map` text CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=19 ;

--
-- Contenu de la table `map`
--

INSERT INTO `map` (`id`, `map_name`, `map`) VALUES
(1, 'MAP1', 'BHHHHHHHHHHHHHHHHHHB\nV    V             V\nV    V             V\nV    V     P       V\nV  P BHHHHHB       V\nV P P1     K  L   CV\nV  P BHHHHHB       V\nV    V     P       V\nV    V             V\nV    V             V\nV    V             V\nBHHHHHHHHHHHHHHHHHHB'),
(2, 'MAP2', '  BBHHHHHHHHHHHHHHHB\n BB                V\nBB               L V\nB C BHHHHHHHB B BHHB\nV   V    2    V    V\nV   V BHHHHHHHBHHB V\nV   V    4    V    V\nV   BHHHHHHHB V BHHB\nV   V    3    V    V\nB   V BHHHHHHBBHHB V\nVK  V    1   V     V\nBHHHBHHHHHHHHBHHHHHB'),
(3, 'MAP3', 'BHHHHHBHHHHHHHHBHHB \nV     B       BB  VB\nV L   BB     BB   VB\nV      BB  1 B    VB\nV   BB  BB  BB    VB\nV BBB      BB     VB\nBBB   2  K  3  BB VB\nV      B        BBVB\nV    BBB  4  BB  BBB\nV   BB        BB   B\nBHHHBHHHHHHHHHHBB CB\n BBBBBBBBBBBBBBBBBBB'),
(4, 'MAP4', '  BHHBHHHHHHHHHHHB  \n BB  B           BB \nBB     B BPBPB B  BB\nV  BBB BHBHBHBHBB  V\nV  BVV         V   V\nV   VBHB BHHHB VB  V\nV  BVV   BHB   V   V\nV   BBL  BHB  CVB  V\nV  BHHH BHHHHHHBB  V\nBB  B B B B B BB3KBB\n BB      4  1  2 BB \n  BHHHHHHHHHHHHHHB  '),
(5, 'MAP5', ' BHHHHHBB           \nB      KBHHB        \nV BHHHB   PBHHB     \nV1       B   PBHHB  \nV BHHB B   B    PBHB\nV2       B V   L  PV\nV BHHB B   B    PBHB\nV3       B   PBHHB  \nV BHHHB   PBHHB     \nBC      BHHB        \n BHHHHHBB           '),
(17, 'MENU', 'BHHHHHHHHHHHHHHHHHHB\nV         L        V\nV  BHBHHHHHHHHBHB  V\nV    V  T     V    V\nBHHB V        V BHHB\nO  B VS       V B  O\nBB   VS       V   BB\nBBHHHBS       BHHHBB\nV    VS       V    V\nBHHHHBHHHHHHHHBHHHHB\nV         1        V\nBHHHHHHHHHHHHHHHHHHB');

-- --------------------------------------------------------

--
-- Structure de la table `score`
--

CREATE TABLE IF NOT EXISTS `score` (
  `score_id` int(11) NOT NULL AUTO_INCREMENT,
  `score` int(11) NOT NULL,
  `nickname` varchar(11) NOT NULL,
  PRIMARY KEY (`score_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=47 ;

--
-- Contenu de la table `score`
--

INSERT INTO `score` (`score_id`, `score`, `nickname`) VALUES
(2, 600, 'Rayan'),
(4, 600, 'LOL'),
(5, 100, 'LOL'),
(6, 600, 'bilel'),
(7, 3200, 'bilel'),
(8, 1700, 'bilel'),
(9, 3100, 'bilel'),
(10, 1300, 'bilel'),
(11, 600, 'bilel'),
(12, 3200, 'bilel'),
(13, 3200, 'bilel'),
(14, 2600, 'srsr'),
(15, 450, 'Walim'),
(16, 700, 'Walim'),
(17, 800, 'Walim'),
(18, 4300, 'Walim'),
(19, 2100, 'Zorglub'),
(20, 100, 'Walim2'),
(21, 100, 'TEST'),
(22, 800, 'TEST'),
(23, 3550, 'therealwali'),
(24, 1700, 'test'),
(25, 350, 'mpmp'),
(26, 100, 'mpmp'),
(27, 2700, 'test6'),
(28, 2600, 'ryhhd'),
(29, 350, 'ryhhd'),
(30, 1600, 'ryhhd'),
(31, 1600, 'ryhhd'),
(32, 3200, 'ryhhd'),
(33, 1600, 'ryhhd'),
(34, 100, 'ryhhd'),
(35, 700, 'ryhhd'),
(36, 100, 'ryhhd'),
(37, 2100, 'ryhhd'),
(38, 3200, 'ryhhd'),
(39, 4300, 'ryhhd'),
(40, 0, ''),
(41, 100, '84585485854'),
(42, 100, '84585485854'),
(43, 600, '84585485854'),
(44, 100, 'TEST'),
(45, 1600, 'STRESSEDOUT'),
(46, 1450, '25');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
