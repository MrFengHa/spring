package com.home.controller;

import com.home.exception.MyException;
import com.home.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文件描述
 *
 * @author 冯根源
 * @date 2020/12/1 22:46
 */
@Controller
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("show1")
    public String show1(){
        System.out.println("show running");
        demoService.show1();
        return "index";
    }

    @RequestMapping("show5")
    public String show5() throws MyException {
        System.out.println("show running");
        demoService.show5();
        return "index";
    }
}
