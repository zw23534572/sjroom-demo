package com.idgenerate.web;

import com.idgenerate.service.IDGenerateService;
import com.idgenerate.common.IPUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IDGenerateController {

    @Autowired
    IDGenerateService idGenerateService;

    @RequestMapping("/")
    @ResponseBody
    public Long get() {
        return idGenerateService.get(IPUtil.getLocalIp());
    }

    @RequestMapping("/destroy")
    @ResponseBody
    public void destroy() {
        idGenerateService.replaceCurrentMaxId(IPUtil.getLocalIp());
    }
}
