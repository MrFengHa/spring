package com.home.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/6 17:17
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(getPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                //执行登录页面
                .loginPage("/login.html")
                //登录访问路径
                .loginProcessingUrl("/user/login")
                //登录成功之后跳转的路径
                .defaultSuccessUrl("/main.html").permitAll()
                .and().authorizeRequests()
                //不需要认证可以直接访问
                .antMatchers("/", "/test/hello", "/user/login","/image/*").permitAll()
                //所有请求必须认证后才能访问
                .anyRequest().authenticated()
                //关闭csrf防护
                .and().csrf().disable();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
