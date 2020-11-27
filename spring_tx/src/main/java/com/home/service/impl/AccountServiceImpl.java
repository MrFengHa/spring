package com.home.service.impl;

import com.home.dao.AccountDao;
import com.home.service.AccountService;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/27 14:42
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     * 转账
     *
     * @param outMan
     * @param inMan
     * @param money
     */
    public void transfer(String outMan, String inMan, double money) {
        accountDao.out(outMan,money);
        int i = 1/0;
        accountDao.in(inMan,money);
    }
}
