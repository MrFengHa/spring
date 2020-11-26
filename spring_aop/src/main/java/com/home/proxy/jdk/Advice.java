package com.home.proxy.jdk;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/26 14:38
 */
public class Advice {
    public void before(){
        System.out.println("前置增强");
    }

    public void after(){
        System.out.println("后置增强");
    }


}
