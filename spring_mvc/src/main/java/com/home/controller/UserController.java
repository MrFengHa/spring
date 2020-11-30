package com.home.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.home.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/30 11:55
 */
@Controller
public class UserController {


    /**
     * 使用springNVC封装的工具将对象变为json字符串
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "quick9")
    @ResponseBody
    public User save9() throws Exception {
        User user = new User();
        user.setUsername("lisi");
        user.setAge(30);

        return user;
    }


    /**、
     * 使用jackson工具 将对象转为json字符串
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/quick8")
    //告知springMvc框架， 不进行视图跳转，直接进行数据响应返回
    @ResponseBody
    public String save8() throws Exception {
        User user = new User();
        user.setUsername("lisi");
        user.setAge(30);
        //使用json的转换工具，将对象转化为json格式字符串返回
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    /**
     * 返回json
     * @return
     */
    @RequestMapping(value = "/quick7")
    @ResponseBody
    public String save7(){

        return "{'username':'zhangsan','age':'18'}";
    }

    /**
     * @ResponseBody 告知springMvc框架， 不进行视图跳转，直接进行数据响应返回 和转发页面区分
     * @return
     */
    @RequestMapping(value = "/quick6")
    @ResponseBody
    public String save6(){

      return "Hello mac";
    }

    /**
     * 使用request传递值
     * @param request
     * @return
     */
    @RequestMapping(value = "/quick5")
    public String save5(HttpServletRequest request) {

        request.setAttribute("username","macbook");
        return "success";
    }

    /**
     * 使用model传递值
     * @param model
     * @return
     */
    @RequestMapping(value = "/quick4")
    public String save4(Model model) {
        model.addAttribute("username","三宝");

        return "success";
    }

    /**
     * 使用传入参数传入modelAndView
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/quick3")
    public ModelAndView save3(ModelAndView modelAndView) {
        //设置视图名称
        modelAndView.setViewName("success");
        //设置模型数据
        modelAndView.addObject("username", "rootS");
        return modelAndView;
    }

    /**
     * 使用modelAndView跳转页面 传递数据
     * @return
     */
    @RequestMapping(value = "/quick2")
    public ModelAndView save2() {
        ModelAndView modelAndView = new ModelAndView();
        //设置视图名称
        modelAndView.setViewName("success");
        //设置模型数据
        modelAndView.addObject("username", "root");
        return modelAndView;
    }

    /**
     * 跳转页面
     * @return
     */
    @RequestMapping("/quick")
    public String save() {
        System.out.println("Controller save running");
        return "success";
    }
}
