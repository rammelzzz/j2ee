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
  description TEXT,
  createTime DATE NOT NULL,
  status TINYINT NOT NULL
)DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
alter table user add index `chkuser` (`username`);
alter table user add index `login` (`username`, `password`);
####数据准备####
INSERT INTO user(username, password, mobile, createTime, status)
VALUES('admin', 'admin', '18888888888', NOW(), 1);
####创建咨询表####
create table article(
id int not null auto_increment primary key,
title varchar(32) not null,
classify varchar(10) default '无',
editor varchar(32) default '佚名',
date Date,
times int default 0,
status tinyint not null default 1
)default charset utf8;
####数据准备####
insert into article(title, classify, editor, date, times, status)
values ('第一篇咨询', '无', 'admin', NOW(), 0, 1);

####图片表#####
create table picture(
id int not null auto_increment primary key,
classify varchar(10) default '无',
name varchar(64) not null default '一组图片',
tag varchar(32),
time date not null,
status int not null default 1
)default charset utf8;

create table picLoction(
id int not null auto_increment primary key,
pic_id int not null,
url varchar(32) not null,
foreign key (pic_id) references picture(id)
)default charset utf8;
####数据准备####


####品牌表####
create table brand(
id int not null auto_increment primary key,
logo varchar(64) not null default '/',
name varchar(64) not null,
description text
)default charset utf8;

####会员表#####
CREATE TABLE member(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(32) NOT NULL,
  password VARCHAR(32) NOT NULL,
  mobile VARCHAR(16) NOT NULL,
  description TEXT,
  createTime DATE NOT NULL,
  status TINYINT NOT NULL
)DEFAULT CHARSET utf8 COLLATE utf8_general_ci;