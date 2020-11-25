package com.home.factory;

import com.home.dao.UserDao;
import com.home.dao.impl.UserDaoImpl;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/25 14:59
 */
public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
