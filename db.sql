CREATE TABLE `url` (
  `id` Integer NOT NULL auto_increment,
  `longurl` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user` (
  `id` Integer NOT NULL auto_increment,
  `email` varchar(128) DEFAULT NULL,
  `password` varchar(128) DEFAULT NULL,
  `nickname` varchar(128) DEFAULT NULL,
  `username` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_idx_unique_email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
