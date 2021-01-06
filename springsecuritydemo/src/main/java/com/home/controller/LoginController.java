package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/5 10:01
 */
@Controller
public class LoginController {

    @PostMapping("toMain")
    public String toMain(){

        return "redirect:main.html";
    }
}
