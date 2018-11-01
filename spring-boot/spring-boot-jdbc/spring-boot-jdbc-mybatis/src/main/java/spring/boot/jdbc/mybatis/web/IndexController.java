package spring.boot.jdbc.mybatis.web;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.boot.jdbc.mybatis.dao.UserMapper;
import spring.boot.jdbc.mybatis.entity.User;

import java.util.List;

@Log4j2
@Controller
public class IndexController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/")
    @ResponseBody
    public List<User> getUser() {
        List<User>  resultList = userMapper.selectAll();
        log.info("IndexController getUser:{}",resultList);
        return resultList;
    }
}
