####创建数据库####
CREATE DATABASE IF NOT EXISTS j2ee DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
####进入数据库####
USE j2ee;
####创建用户表####
DROP TABLE user;
CREATE TABLE user(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(32) NOT NULL,
  password VARCHAR(32) NOT NULL,
  mobile VARCHAR(16) NOT NULL,
  sex BOOLEAN,
  email VARCHAR(32),
  city VARCHAR(10),
  photoUrl VARCHAR(64),
  description TEXT,
  createTime DATE NOT NULL,
  status TINYINT NOT NULL
)DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
####创建角色表####
CREATE TABLE IF NOT EXISTS role(
  id TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  description TEXT
)DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
####创建权限表####
CREATE TABLE IF NOT EXISTS permission (
  id TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  description TEXT
)DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
####角色与用户对应表####
CREATE TABLE IF NOT EXISTS user_role(
  user_id INT NOT NULL,
  role_id INT NOT NULL
);

####角色与权限对应表####
CREATE TABLE IF NOT EXISTS role_permission(
  role_id INT NOT NULL,
  permission_id INT NOT NULL
);
####数据准备####
INSERT INTO user(username, password, mobile, createTime, status)
VALUES('admin', 'admin', '18888888888', NOW(), 1),
  ('editor', 'editor', '13000000000', NOW(), 1),
  ('sale', 'sale', '13111111111', NOW(), 1);
INSERT INTO role(name, description)
VALUES('超级管理员', '拥有所有权限'),
  ('主编', '拥有编辑咨询的权限'),
  ('销售经理', '拥有查看产品的权限');
INSERT INTO permission(name, description)
VALUES('咨询管理', ''),
  ('图片管理', ''),
  ('产品管理', ''),
  ('评论管理', ''),
  ('会员管理', ''),
  ('管理员管理', ''),
  ('系统管理', '');
INSERT INTO user_role
VALUES(1, 1),
  (2, 2),
  (3, 3);
INSERT INTO role_permission
VALUES(1, 1),
  (1, 2),
  (1, 3),
  (1, 4),
  (1, 5),
  (1, 6),
  (1, 7),
  (2, 1),
  (2, 2),
  (2, 4),
  (3, 3),
  (3, 2);




