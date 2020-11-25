package com.home.factory;

import com.home.dao.UserDao;
import com.home.dao.impl.UserDaoImpl;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/25 14:52
 */
public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
