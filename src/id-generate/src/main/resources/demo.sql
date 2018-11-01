/*==============================================================*/
/* Table: id_generate                                         */
/*==============================================================*/
drop table if exists id_generate;
create table id_generate
(
   id                   bigint(20) not null auto_increment,
   stub                 varchar(20) default NULL comment '服务器IP',
   currentMaxId         bigint(20) default NULL comment '服务器重启或者注销时更新此ID值',
   primary key (id),
  UNIQUE (stub)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT 'id生成器'
