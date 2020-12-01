package com.home.controller;

import com.home.domain.User;
import com.home.domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/30 16:14
 */
@Controller

public class UserRequestController {
    /**
     * 自定义类型转换器
     * @param date
     */
    @ResponseBody
    @RequestMapping("quick18")
    public void save08(Date date){
        System.out.println(date);
    }
    /**
     * username
     * @param username
     */
    @ResponseBody
    @RequestMapping("quick17/{username}")
    public void save07(@PathVariable("username") String username){
        System.out.println(username);
    }
    /**
     * 使用@Requestparam获取不同名参数
     * @param username
     */
    @ResponseBody
    @RequestMapping("quick16")
    public void save06(@RequestParam("name") String username){
        System.out.println(username);
    }

    /**
     * 获取List集合参数
     * @param userList
     */
    @ResponseBody
    @RequestMapping("quick15")
    public void save05(@RequestBody List<User> userList){
        System.out.println(userList);
    }


    /**
     * 使用第三个类获取集合参数
     * @param vo
     */
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
