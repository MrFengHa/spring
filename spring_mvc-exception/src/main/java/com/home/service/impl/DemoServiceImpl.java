package com.home.service.impl;

import com.home.exception.MyException;
import com.home.service.DemoService;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 文件描述
 *
 * @author 冯根源
 * @date 2020/12/1 22:55
 */
@Service
public class DemoServiceImpl implements DemoService {
    /**
     * 抛出类型异常转换异常
     */
    @Override
    public void show1() {
        System.out.println("抛出类型转换异常");
        Object str ="zhangsan";
        Integer num = (Integer)str;
    }

    /**
     * 抛出除零异常
     */
    @Override
    public void show2() {
        System.out.println("抛出除零异常");
        int i=1/0;
    }

    /**
     * 文件找不到异常
     * @throws FileNotFoundException
     */
    @Override
    public void show3() throws FileNotFoundException {
        System.out.println("抛出除零异常");
        InputStream in = new FileInputStream("c:/xxx/xxx/xxx");
    }

    /**
     * 空指针异常
     */
    @Override
    public void show4() {
        System.out.println("空指针异常");
        String str = null;
        str.length();
    }

    /**
     * 自定义异常
     * @throws MyException
     */
    @Override
    public void show5() throws MyException {
        System.out.println("自定义异常");
        throw new MyException();
    }
}
