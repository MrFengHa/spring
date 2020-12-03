package com.home.mapper;

import com.home.domain.Account;

import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/12/3 15:32
 */
public interface AccountMapper {
    /**
     * 保存
     * @param account
     */
    void save(Account account);

    /**
     * 查找所有
     * @return
     */
    List<Account> findAll();
}
