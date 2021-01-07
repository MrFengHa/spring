package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/7 13:57
 */
@Controller
@RequestMapping("test")
public class TestController {
    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello security";
    }
}
