package com.home.service.impl;

import com.home.dao.UserDao;
import com.home.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/26 10:40
 */
@Service("userService")
public class UserServiceImpl implements UserService {
   @Resource()
    private UserDao userDao;
    /**
     * 保存方法
     */
    public void save() {
        userDao.save();
    }
}
