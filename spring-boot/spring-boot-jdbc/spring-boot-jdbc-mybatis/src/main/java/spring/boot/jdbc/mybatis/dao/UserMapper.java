package spring.boot.jdbc.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import spring.boot.jdbc.mybatis.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 查询所有的用户信息
     *
     * @return
     */
    List<User> selectAll();
}
