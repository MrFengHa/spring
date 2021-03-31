package com.home.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/3/31 16:10
 */
@RestController
public class HelloController {
    @RequestMapping("/test/spring/session")
    public String testSession(HttpSession session){
        session.setAttribute("king","hello-king");
        return "数据存入Session域";
    }
}
