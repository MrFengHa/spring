package com.home.dao.impl;

import com.home.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/30 10:53
 */
@Repository
public class UserDaoImpl implements UserDao {

    /**
     * 保存
     */
    @Override
    public void save() {
        System.out.println("save running");
    }
}
