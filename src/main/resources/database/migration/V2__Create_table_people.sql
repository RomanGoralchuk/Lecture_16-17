CREATE TABLE `people` (
	`people_id` INT(11) NOT NULL AUTO_INCREMENT,
	`people_name` CHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`people_surname` CHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`pet_id` INT(11) NOT NULL,
	PRIMARY KEY (`people_id`) USING BTREE,
	INDEX `FK_people_pet` (`pet_id`) USING BTREE,
	CONSTRAINT `FK_people_pet`
	FOREIGN KEY (`pet_id`)
	REFERENCES `hibernateTest`.`pet` (`pet_id`)
	ON UPDATE NO ACTION ON DELETE NO ACTION
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
;