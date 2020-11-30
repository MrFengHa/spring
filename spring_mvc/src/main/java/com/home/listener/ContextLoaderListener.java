package com.home.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/30 11:12
 */

public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //读取web.xml中的全局参数
        ServletContext servletContext = servletContextEvent.getServletContext();
        String appStr= servletContext.getInitParameter("app");
        ApplicationContext app = new ClassPathXmlApplicationContext(appStr);

        servletContext.setAttribute("app", app);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
