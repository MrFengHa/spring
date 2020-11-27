package com.home.test;

import com.home.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/27 10:06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class JdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 使用聚合函数查询
     */
    @Test
    public void testFindCount() {
        Integer count = jdbcTemplate.queryForObject("select count(*) from account", Integer.class);
        System.out.println(count);
    }

    /**
     * 根据条件查询
     */
    @Test
    public void testFindOne() {

        Account account = jdbcTemplate.queryForObject("select * from account where name=?", new BeanPropertyRowMapper<Account>(Account.class), "三宝");
        System.out.println(account);
    }

    @Test
    public void testFindAll() {

        List<Account> accountList = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(accountList);
    }

    @Test
    public void testDelete() {

        int row = jdbcTemplate.update("delete from account where name = ?", "tom");
        System.out.println(row);
    }

    @Test
    public void testUpdate() {

        int row = jdbcTemplate.update("update  account set money=? where name =?", 100000, "三宝");
        System.out.println(row);
    }

    @Test
    public void testInsert() {

        int row = jdbcTemplate.update("insert into account values (?,?)", "susu", 1);
        System.out.println(row);
    }
}
