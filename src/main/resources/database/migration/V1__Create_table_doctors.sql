CREATE TABLE IF NOT EXISTS `doctors` (
  `doc_id` int(11) NOT NULL AUTO_INCREMENT,
  `doc_name` char(50) NOT NULL,
  `doc_surname` char(50) NOT NULL,
  `doc_specialization` char(50) NOT NULL,
  PRIMARY KEY (`doc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;