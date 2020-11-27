package com.home.dao;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/27 14:37
 */
public interface AccountDao  {
    /**
     * 转出
     * @param outMan
     * @param money
     */
    void out(String outMan, double money);

    /**
     * 转入
     * @param outMan
     * @param money
     */
    void in(String outMan, double money);
}
