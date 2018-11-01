/*
Navicat MySQL Data Transfer

Source Server         : 120.79.189.147
Source Server Version : 50723
Source Host           : 120.79.189.147:30000
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2018-10-11 16:20:14
*/
CREATE Database demo;

USE demo;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户表',
  `name` varchar(8) COLLATE utf8_bin DEFAULT NULL COMMENT '用户姓名',
  `sex` int(4) DEFAULT NULL COMMENT '用户性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'a', '12');
INSERT INTO `user` VALUES ('2', 'b', '13');
INSERT INTO `user` VALUES ('3', 'c', '14');
INSERT INTO `user` VALUES ('4', 'd', '15');
