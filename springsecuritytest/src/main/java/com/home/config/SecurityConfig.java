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
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

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

    /**
     * 注入数据源
     */
    @Autowired
    private DataSource dataSource;

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl jdbcTokenRepository = new JdbcTokenRepositoryImpl();
        jdbcTokenRepository.setDataSource(dataSource);
        //设置的时候把表创建出来
        //jdbcTokenRepository.setCreateTableOnStartup(true);
        return jdbcTokenRepository;
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(getPasswordEncoder());
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //退出
        http.logout().logoutUrl("/logout").logoutSuccessUrl("/test/hello").permitAll();

        http.formLogin()
                //执行登录页面
                .loginPage("/login.html")
                //登录访问路径
                .loginProcessingUrl("/user/login")
                //登录成功之后跳转的路径
                .defaultSuccessUrl("/main.html").permitAll()
                .and().authorizeRequests()
                //不需要认证可以直接访问
                .antMatchers("/", "/test/hello", "/user/login", "/image/*").permitAll()
                //1只有具有role权限才能访问 hasAuthority
                //.antMatchers("/test/index").hasAuthority("role")
                //2只要用户权限是其中一个就可以访问
                //.antMatchers("/test/index").hasAnyAuthority("admin,role")
                //基于角色的访问控制
                //.antMatchers("/test/index").hasRole("sale")
                //只要用户包含相应的角色就可以
                .antMatchers("/test/index").hasAnyRole("sale,user")
                //所有请求必须认证后才能访问
                .anyRequest().authenticated()
                //设置没有访问权限的页面
                .and().exceptionHandling().accessDeniedPage("/unauth.html")

                //开启自动登录
                .and().rememberMe().tokenRepository(persistentTokenRepository())
                //设置有效时长单位秒
                .tokenValiditySeconds(60)
                .userDetailsService(userDetailsService)

                //关闭csrf防护
                .and().csrf().disable();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
