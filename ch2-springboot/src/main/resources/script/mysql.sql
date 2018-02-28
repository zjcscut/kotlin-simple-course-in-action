CREATE DATABASE IF NOT EXISTS `kotlin` CHARSET utf8mb4 COLLATE utf8mb4_unicode_520_ci;

CREATE TABLE IF NOT EXISTS `people`(
  id BIGINT UNSIGNED,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  gender VARCHAR(10),
  age TINYINT,
  gmt_created DATETIME,
  gmt_modified DATETIME
)COMMENT 'people';


INSERT INTO `people` (`id`, `first_name`, `last_name`, `gender`, `age`, `gmt_created`, `gmt_modified`)
VALUES ('1', 'doge', 'zhang', 'male', '24', '2018-02-28 12:15:33', '2018-02-28 12:15:35');
