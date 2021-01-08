package com.home;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@MapperScan
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled = true)
public class SpringsecuritytestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecuritytestApplication.class, args);
    }

}
