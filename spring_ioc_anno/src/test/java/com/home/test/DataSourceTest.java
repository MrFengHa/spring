package com.home.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/25 17:57
 */
public class DataSourceTest {
    @Test
    /**
     * 测试手动创建Druid数据源(加载配置文件)
     */
    public void testDruidProperties() throws Exception {
        //读取配置文件
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        String driver = resourceBundle.getString("jdbc.driver");
        String url = resourceBundle.getString("jdbc.url");
        String username = resourceBundle.getString("jdbc.username");
        String password = resourceBundle.getString("jdbc.password");

        //创建数据源对象
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);

        DruidPooledConnection connection = druidDataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    /**
     * 测试手动创建C3P0数据源
     */
    public void testC3p0() throws SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        Connection connection = null;
        try {
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://lszxydh.cn:3306/mysql");
            dataSource.setUser("root");
            dataSource.setPassword("sql");
            connection = dataSource.getConnection();
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    @Test
    /**
     * 测试手动创建Druid数据源
     */
    public void testDruid() throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://lszxydh.cn:3306/mysql");
        dataSource.setUsername("root");
        dataSource.setPassword("sql");
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
