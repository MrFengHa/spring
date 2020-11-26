package com.home.aop_anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 文件描述
 * 切面类
 * @Aspect 标注当前类是切面类
 * @Author 冯根源
 * @create 2020/11/26 15:52
 */
@Component
@Aspect
public class MyAspect {
    @Before("pointcut()")
    public void before() {
        System.out.println("前置增强、、、、、、、");
    }

    public void afterReturning() {
        System.out.println("后置增强、、、、、、、");
    }

    @Around("MyAspect.pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强、、、、、、、");
        Object proceed = pjp.proceed();
        System.out.println("环绕后增强、、、、、、、");
        return proceed;
    }

    public void throwing() {
        System.out.println("异常通知、、、、、、、");
    }

    @After("execution( * com.home.aop_anno.Target.save())")
    public void after() {
        System.out.println("最终增强、、、、、、、");
    }

    /**
     * 定义切点表达式
     */
    @Pointcut("execution( * com.home.aop_anno.Target.save())")
    public void pointcut(){
    }
}
