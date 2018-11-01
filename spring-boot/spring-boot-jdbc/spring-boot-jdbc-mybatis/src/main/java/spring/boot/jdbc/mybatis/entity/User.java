package spring.boot.jdbc.mybatis.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private Integer sex;
}
