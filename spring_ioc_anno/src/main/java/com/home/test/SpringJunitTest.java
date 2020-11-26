package com.home.test;

import com.home.config.SpringConfig;
import com.home.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/26 11:59
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:ApplicationContext.xml")
@ContextConfiguration(classes = SpringConfig.class)
public class SpringJunitTest {
    @Autowired
    private UserService userService;
    @Autowired
    private DataSource dataSource;
    @Test
    public void test1() throws SQLException {
        userService.save();
        System.out.println(dataSource.getConnection());
    }
}
