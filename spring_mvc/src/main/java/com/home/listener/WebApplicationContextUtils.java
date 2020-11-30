package com.home.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/30 11:32
 */
public class WebApplicationContextUtils {
    public static ApplicationContext getWebApplicationContext(ServletContext servletContext){
        return (ApplicationContext) servletContext.getAttribute("app");
    }
}
