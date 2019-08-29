-- 数据库初始化脚本

-- 创建数据库
SHOW DATABASES;
-- 使用数据库
use seckill;
-- 创建秒杀库存表
CREATE TABLE seckill
(
    `seckill_id`  bigint       NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
    `name`        varchar(120) NOT NULL COMMENT '商品名称',
    `number`      int          NOT NULL COMMENT '库存数量',
    `start_time`  timestamp    NOT NULL COMMENT '秒杀开始时间',
    `end_time`    timestamp    NOT NULL COMMENT '秒杀结束时间',
    `create_time` timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (seckill_id),
    key idx_start_time (start_time),
    key idx_end_time (end_time),
    key idx_create_time (create_time)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1000
  DEFAULT CHARSET utf8 COMMENT '秒杀库存表 ';

-- 初始化数据
INSERT INTO `seckill`.`seckill` (`name`, `number`, `start_time`, `end_time`)
VALUES ('1000元秒杀iPhoneXSMax', 100, '2019-08-21 00:00:00', '2019-08-22 00:00:00'),
       ('888元秒杀iPad', 200, '2019-08-21 00:00:00', '2019-08-22 00:00:00'),
       ('777元秒杀1+7Pro', 300, '2019-08-21 00:00:00', '2019-08-22 00:00:00'),
       ('1234元秒杀华为P30Pro', 1000, '2019-08-21 00:00:00', '2019-08-22 00:00:00'),
       ('666元秒杀小米mix3', 666, '2019-08-21 00:00:00', '2019-08-22 00:00:00'),
       ('999秒杀三星s10+', 10000, '2019-08-21 00:00:00', '2019-08-21 00:00:00');

-- 秒杀成功明细表
-- 用户登录认证相关信息

CREATE TABLE success_killed
(
    `seckill_id`  bigint    NOT NULL COMMENT '秒杀商品id',
    `user_phone`  bigint    NOT NULL COMMENT '用户手机号',
    `state`       tinyint   NOT NULL DEFAULT -1 COMMENT '状态标示：-1：无效 0：秒杀成功 1：已付款',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (seckill_id, user_phone),/*联合主键*/
    key idx_creatime_time (create_time)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT '秒杀成功明细表'

