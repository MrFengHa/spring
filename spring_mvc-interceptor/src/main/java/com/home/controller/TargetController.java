package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/12/1 11:43
 */
@Controller
public class TargetController {
    @RequestMapping("/target")
    public ModelAndView show(){
        System.out.println("目标资源执行....");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","yes");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
