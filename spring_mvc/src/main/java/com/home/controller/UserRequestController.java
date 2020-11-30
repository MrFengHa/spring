package com.home.controller;

import com.home.domain.User;
import com.home.domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/30 16:14
 */
@Controller

public class UserRequestController {
    @ResponseBody
    @RequestMapping("quick14")
    public void save04(VO vo){
        System.out.println(vo);
    }

    /**
     * 获得数组参数
     * @param strs
     */
    @ResponseBody
    @RequestMapping("quick13")
    public void save03(String[] strs){

        for (String str:strs){
            System.out.println(str);
        }
    }


    /**
     * 获得POJO参数
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping("quick12")
    public User save02(User user){
        User user01 = user;
        return user01;
    }

    /**
     * 获得基本类型参数
     * @param username
     * @param age
     * @return
     */
    @ResponseBody
    @RequestMapping("quick11")
    public User save01(String username,int age){
        User user = new User();
        user.setUsername(username);
        user.setAge(age);
        return user;
    }
}
