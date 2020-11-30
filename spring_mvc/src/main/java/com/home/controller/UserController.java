package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/30 11:55
 */
@Controller
public class UserController {
    @RequestMapping("/quick")
    public String save(){
        System.out.println("Controller save running");
        return "success.jsp";
    }
}
