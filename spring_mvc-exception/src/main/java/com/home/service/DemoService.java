package com.home.service;

import com.home.exception.MyException;

import java.io.FileNotFoundException;

/**
 * 文件描述
 *
 * @author 冯根源
 * @date 2020/12/1 22:49
 */
public interface DemoService {
    /**
     * 抛出类型异常转换异常
     */
    void show1();

    /**
     * 抛出除零异常
     */
    void show2();

    /**
     * 文件找不到异常
     * @throws FileNotFoundException
     */
    void show3() throws FileNotFoundException;

    /**
     * 空指针异常
     */
    void show4();

    /**
     * 自定义异常
     * @throws MyException
     */
    void show5() throws MyException;
}
