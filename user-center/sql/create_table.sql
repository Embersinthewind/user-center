-- auto-generated definition
create table user
(
    id           bigint auto_increment
        primary key,
    username     varchar(512)                        null,
    avatarUrl    varchar(1024)                       null comment '用户头像',
    gender       tinyint                             null comment '性别',
    userAccount  varchar(256)                        null comment '账号',
    userPassword varchar(512)                        not null comment '密码',
    phone        varchar(128)                        null comment '电话',
    email        varchar(512)                        null comment '邮箱',
    userStatus   int       default 0                 not null comment '状态 0 - 正常',
    createTime   datetime  default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime   timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete     tinyint   default 0                 not null,
    userRole     int       default 0                 not null comment '用户角色：0 - 普通用户 1 - 管理员',
    playerCode   varchar(512)                        null comment '玩家编号'
);

