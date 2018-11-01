package test.web;

import test.handle.BaseProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    BaseProperties baseProperties;

    @RequestMapping("/")
    @ResponseBody
    public String test() {
        return baseProperties.getConfig();
    }
}
