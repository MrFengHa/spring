package com.home.entity;

import lombok.Data;
import lombok.ToString;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/7 14:52
 */
@Data
@ToString
public class User {
    private Integer id;
    private String username;
    private String password;
}
