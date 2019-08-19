create database shares character set utf8mb4 collate utf8mb4_general_ci;

create table  if not exists `user` (
    uid bigint unsigned primary key auto_increment,
    account varchar(60) not null comment '账号',
    nick_name varchar(60) default null comment '昵称',
    address varchar(200) default null comment '地址',
    phone varchar(20) default null comment '手机号码',
    email varchar(60) default null comment '邮箱',
    sex varchar(1) default null comment '性别',
    pwd varchar(200) not null comment '密码',
    birthday varchar(10) default null comment '出生年月日',
    header_img varchar(100) default null comment '头像',
    create_time datetime default null comment '创建时间',
    update_time datetime default null comment '修改时间',
    last_login_time datetime default null comment '最后登陆时间',
    delflg tinyint default 0 comment '删除标志 0 未删除 1 已经删除'
) character set utf8mb4 collate utf8mb4_general_ci engine innodb;



create table if not exists category (
    category_id int primary key  auto_increment,
    category_name varchar(100) comment '',
    create_time datetime comment '创建时间',
    update_time datetime comment '修改时间',
    delflg tinyint default 0 comment '删除标志 0未删除 1 已经删除'
)character set utf8mb4 collate utf8mb4_general_ci engine innodb;