# 简介

具体实现是,单表递增,内存缓存号段的方式。

### 首先,数据库设计

建立一张表,像这样:sql

```sql
create table id_generate
(
   id                   bigint(20) not null auto_increment,
   stub                 varchar(20) default NULL comment '服务器IP',
   generated_id         bigint(20) default NULL comment '已经生成过的ID（服务器重启或者注销时更新此ID值）',
   primary key (id),
   UNIQUE (stub)  --更新的字段一定加唯一索引或者主键，不然会一直增加重复数据。
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT 'id生成器'
```

结果：

| (id)序号 | （stub）IP服务器 | ( generated_id)生成过的ID |
| ------ | ----------- | --------------------- |
| 2      | 192.168.1.2 | null                  |

其中 id 是自增的,stub 是服务器 ip
因为新数据库采用 mysql,所以使用 mysql 的独有语法 replace to 来更新记录来获得唯一 id,例如这样:

```sql
REPLACE INTO id_generate (stub) VALUES ("10.32.25.8");
```

该语句的含义:```存在就updated,不存在就先delete后insert这条记录。```保持让ID，变化。

再用 

```sql
SELECT id FROM id_generate WHERE stub = "10.32.25.8";
```

所以,当多个服务器的时候,这个表数据应该是这样的: 

| id   | stub       | generated_id |
| ---- | ---------- | ------------ |
| 5    | 10.32.25.8 | null         |
| 2    | 10.3.2.132 | null         |
| 3    | 10.32.25.7 | null         |
| 4    | 10.2.82.65 | null         |

每台服务器只更新自己的那条记录,保证了单线程操作单行记录。

这时候每个机器拿到的分别是 5,2,3,4 这 4 个 id。

至此,解决了多台服务器同时更新数据,取回的id有混淆。

### 其次，代码设计

原理上,我们还是依靠数据库的特性,每次生成 id 都要请求 db,开销很大。

我们对此又进行优化:
把取回 id 转换为一个号段,进行内存缓存,并且这个号段是可以配置长度的,可以 1000也可以 10000,也就是对拿回来的这个id 放大多少倍的问题。

OK,我们从 DB 一次查询操作,拿回来了 1000 个 id 到内存中了,酷!
4 条数据对应 4 台服务器,每条数据的主键 id 是不同的,那么对应的号段也就是永远没有交集的了。

代码中采用AtomicLong，当第一次拿回号段 id 后,扩大 1000 倍,然后赋值给这个变量 atomic,这就是这个号段的第一个号码。

```java
atomic.set(n * 1000);
```

并且内存里保存一下最大 id,也就是这个号段的最后一个号码

```java
currentMaxId = (n + 1) * 1000;
```

一个号段就形成了，此时每次有请求来取号时候,判断一下有没有到最后一个号码,没有到,就拿个号,走人。

```java
Long uid = atomic.incrementAndGet();
```

如果到达了最后一个号码,那么阻塞住其他请求线程,最早的那个线程去 db 取个号段,再更新一下号段的两个值,就可以了。

# 总结

这个方案,核心代码逻辑不到 20 行,解决了分布式系统序列号生成的问题。

服务器重启后,因为号码缓存在内存,会浪费掉一部分用户ID没有发出去,所以在可能频繁发布的应用中,尽量减小号段放大的步长 n,能够减少浪费。

为了减少浪费一部分id,可以监听 spring 或者 servlet 上下文的销毁事件,把当前即将发出去的用 户 ID 保存起来,下次启动时候再捞回内存即可。

```java
/**
  * todo 容器消费时，调用此方法
*/
@PreDestroy
public void shutdown() {
  idGenerateService.replaceCurrentMaxId(IPUtil.getLocalIp());
}
```



