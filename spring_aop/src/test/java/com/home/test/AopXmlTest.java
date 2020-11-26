package com.home.test;

import com.home.aop_xml.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/26 16:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class AopXmlTest {
    @Autowired
    private TargetInterface target;
    @Test
    public void test1(){
        target.save();
    }
}
