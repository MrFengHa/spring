package com.home.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 文件描述
 * Security配置类
 *
 * @Author 冯根源
 * @create 2021/1/5 9:16
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 通过配置类设置登录名和密码
     *
     * @param auth
     * @throws Exception
     */
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("admin").password(getPasswordEncoder().encode("123")).roles("admin");
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                //自定义登录页面
                .loginPage("/login.html")
                //必须和表单提交的接口一样，会去执行自定义登录逻辑
                .loginProcessingUrl("/login")
                //登录成功后跳转的页面
                .successForwardUrl("/toMain");
        //授权
        http.authorizeRequests()
                /**
                 * 放行，不需要认证
                 */
                .antMatchers("/login.html").permitAll()
                /**
                 * 所有的请求都必须经过认证才能访问，必须登录
                 */
                .anyRequest().authenticated();
        //关闭csrf防护
        http.csrf().disable();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
