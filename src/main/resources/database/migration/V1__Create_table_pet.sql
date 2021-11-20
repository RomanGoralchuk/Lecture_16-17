CREATE TABLE `pet` (
	`pet_id` INT(11) NOT NULL AUTO_INCREMENT,
	`name` CHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`type` CHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`birthday` DATE NULL DEFAULT NULL,
	PRIMARY KEY (`pet_id`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
;