package com.home.domain;

import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/30 16:34
 */
public class VO {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }
}
