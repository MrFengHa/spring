package com.home.service;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/27 14:42
 */
public interface AccountService {
    /**
     * 转账
     * @param outMan
     * @param inMan
     * @param money
     */
    void transfer(String outMan,String inMan,double money);
}
