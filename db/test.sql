CREATE
database if NOT EXISTS `from-source` default character set utf8mb4 collate utf8mb4_unicode_ci;
CREATE
database if NOT EXISTS `to-source` default character set utf8mb4 collate utf8mb4_unicode_ci;

CREATE TABLE `from-source`.`t_user`
(
    `id`       int(0) NOT NULL AUTO_INCREMENT,
    `name`     varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `to-target`.`t_order`
(
    `id`      int(0) NOT NULL AUTO_INCREMENT,
    `number`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `user_id` int(0) NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

INSERT INTO `from-source`.t_user (id, name, password)
VALUES (1, 'zhangsan', '123456');
INSERT INTO `from-source`.t_user (id, name, password)
VALUES (2, 'lisi', 'abcdefg');
INSERT INTO `from-source`.t_user (id, name, password)
VALUES (3, 'tom', 'dfshkjadhkasjfh');
INSERT INTO `from-source`.t_user (id, name, password)
VALUES (4, 'jerry', 'oweu23');
INSERT INTO `from-source`.t_user (id, name, password)
VALUES (5, 'wangwu', '123456');
INSERT INTO `from-source`.t_user (id, name, password)
VALUES (6, 'miss', '9234802');

commit;