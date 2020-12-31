CREATE TABLE `product` (
  `product_id` INT NOT NULL,
  `product_name` VARCHAR(100) DEFAULT NULL,
  `product_desc` VARCHAR(100) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci