/*==============================================================*/
/* Table: user                                         */
/*==============================================================*/
drop table if exists user;
create table user
(
   id                   bigint(20) not null auto_increment,
   name                 varchar(8) default NULL comment '用户姓名',
   sex                  int(4) default NULL comment '用户性别',
   primary key (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
