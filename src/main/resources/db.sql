
create database `qrcode` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

CREATE TABLE `qr_code` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `qrcode` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `style_json` text,
  `is_deleted` bigint(255) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;
