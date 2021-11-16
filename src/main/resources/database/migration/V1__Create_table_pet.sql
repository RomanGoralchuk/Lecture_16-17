CREATE TABLE `pet` (
	`pet_id` INT(11) NOT NULL AUTO_INCREMENT,
	`pet_name` CHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`pet_type` CHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`pet_birthday` DATE NULL DEFAULT NULL,
	PRIMARY KEY (`pet_id`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
;