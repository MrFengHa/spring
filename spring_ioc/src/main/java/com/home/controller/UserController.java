package com.home.controller;

import com.home.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/25 15:06
 */
public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
