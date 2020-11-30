package com.home.service.impl;

import com.home.dao.UserDao;
import com.home.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/30 10:56
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    /**
     * 保存方法
     */
    @Override
    public void save() {
        userDao.save();
    }
}
