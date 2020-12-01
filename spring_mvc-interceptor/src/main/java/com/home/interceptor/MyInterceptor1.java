package com.home.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 文件描述
 * 自定义拦截器
 *
 * @Author 冯根源
 * @create 2020/12/1 13:45
 */
public class MyInterceptor1 implements HandlerInterceptor {
    /**
     * 在目标方法执行之前执行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle.....");
        String param = request.getParameter("param");
        if ("yes".equals(param)){
            return true;
        }else{
            request.getRequestDispatcher("/error.jsp").forward(request,response);
            return false;
        }

    }

    /**
     * 在目标方法执行之后，目标视图返回之前
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println("postHandle.....");
    }

    /**
     * 最终流程完毕后执行
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion.....");
    }
}
