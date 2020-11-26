package com.home.aop;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/26 14:37
 */
public class Target implements TargetInterface {
    /**
     * 保存
     */
    public void save() {
        int i = 1/0;
        System.out.println("save running........");

    }
}
