package spring.boot.dubbo.producter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.boot.dubbo.producter.service.UserService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return userService.getAll();
    }
}
