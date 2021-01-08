package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/7 13:57
 */
@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping("hello")
    public String hello(){
        return "hello security";
    }
    @GetMapping("index")
    public String index(){
        return "hello index";
    }
}
