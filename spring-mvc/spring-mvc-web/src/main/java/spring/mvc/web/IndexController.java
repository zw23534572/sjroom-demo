package spring.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


public class IndexController {

    @RequestMapping("/test")
    @ResponseBody
    public String index(HttpServletRequest request) {
        System.out.println("IndexController index started:" + request.getParameter("name"));
        return "hello world";
    }
}
