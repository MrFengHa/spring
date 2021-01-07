package com.home;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class SpringsecuritytestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecuritytestApplication.class, args);
    }

}
