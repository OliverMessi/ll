/*
Navicat MySQL Data Transfer

Source Server         : lifestyle
Source Server Version : 50730
Source Host           : localhost:3306
Source Database       : ll

Target Server Type    : MYSQL
Target Server Version : 50730
File Encoding         : 65001

Date: 2020-07-03 16:12:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for update_records
-- ----------------------------
DROP TABLE IF EXISTS `update_records`;
CREATE TABLE `update_records` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `time_stamp` varchar(255) DEFAULT NULL COMMENT '时间',
  `content` varchar(255) DEFAULT NULL COMMENT '更新内容',
  `create_time` varchar(255) DEFAULT NULL COMMENT '更新时间',
  `commit_persion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of update_records
-- ----------------------------
INSERT INTO `update_records` VALUES ('1', '2019/4/13', '实现上传至服务器和输入 URL 两种方式添加封面', '2019/4/11 09:02', 'wdm');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `pass_word` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '123');
