package spring.boot.web;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
public class IndexController {

    @RequestMapping("")
    @ResponseBody
    public String index(HttpServletRequest request) {
        System.out.println("testModel:{}");
        log.info("testModel:{}",11);
        return "hello world";
    }


    @RequestMapping("test")
    @ResponseBody
    public String test(HttpServletRequest request) {
        System.out.println("testModel:{}");
        return "hello world";
    }

}
