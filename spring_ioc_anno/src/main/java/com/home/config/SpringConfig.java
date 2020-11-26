package com.home.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * 文件描述
 *
 * @Configuration 指定当前类为spring核心配置类
 * @ComponentScan 扫描组件
 * @PropertySource 加载properties配置文件
 * @Author 冯根源
 * @create 2020/11/26 11:20
 */

@Configuration
@ComponentScan("com.home")
@Import({DataSourceConfig.class})
public class SpringConfig {



}
