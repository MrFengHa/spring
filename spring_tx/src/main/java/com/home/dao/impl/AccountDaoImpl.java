package com.home.dao.impl;

import com.home.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/27 14:38
 */
public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

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
