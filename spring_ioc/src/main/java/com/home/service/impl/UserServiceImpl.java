package com.home.service.impl;

import com.home.dao.UserDao;
import com.home.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/25 15:02
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;



//    public UserServiceImpl(UserDao userDao){
//        this.userDao = userDao;
//    }

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }


    public UserServiceImpl(){
        System.out.println("UserServiceImpl......");
    }

    /**
     * 保存
     */
    public void save() {
        userDao.save();
    }
}
