package com.home.controller;

import com.home.config.SpringConfig;
import com.home.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/26 10:42
 */
@Controller
public class UserController {
    public static void main(String[] args) {
        //ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService =  app.getBean(UserService.class);
        userService.save();
    }
}
