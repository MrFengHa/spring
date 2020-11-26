package com.home.aop_xml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 文件描述
 * 切面类
 *
 * @Author 冯根源
 * @create 2020/11/26 15:52
 */
public class MyAspect {
    public void before() {
        System.out.println("前置增强、、、、、、、");
    }

    public void afterReturning() {
        System.out.println("后置增强、、、、、、、");
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强、、、、、、、");
        Object proceed = pjp.proceed();
        System.out.println("环绕后增强、、、、、、、");
        return proceed;
    }

    public void throwing() {
        System.out.println("异常通知、、、、、、、");
    }

    public void after() {
        System.out.println("最终增强、、、、、、、");
    }
}
