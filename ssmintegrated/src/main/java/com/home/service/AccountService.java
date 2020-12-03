package com.home.service;

import com.home.domain.Account;

import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/12/3 15:33
 */
public interface AccountService {
    /**
     * 保存
     * @param account
     */
    void save(Account account);

    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();
}
