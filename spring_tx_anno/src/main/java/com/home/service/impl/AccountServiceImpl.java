package com.home.service.impl;

import com.home.dao.AccountDao;
import com.home.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/27 14:42
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    /**
     * 转账
     *
     * @param outMan
     * @param inMan
     * @param money
     */
    @Transactional()
    public void transfer(String outMan, String inMan, double money) {
        accountDao.out(outMan,money);
        int i = 1/0;
        accountDao.in(inMan,money);
    }
}
