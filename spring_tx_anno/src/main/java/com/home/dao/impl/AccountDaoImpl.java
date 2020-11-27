package com.home.dao.impl;

import com.home.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/27 14:38
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 转出
     *
     * @param outMan
     * @param money
     */
    public void out(String outMan, double money) {
        jdbcTemplate.update("update account set money=money-? where name=?",money,outMan);
    }

    /**
     * 转入
     *
     * @param outMan
     * @param money
     */
    public void in(String outMan, double money) {
        jdbcTemplate.update("update account set money=money+? where name=?",money,outMan);
    }
}
