package com.home.dao.impl;

import com.home.dao.UserDao;
import com.home.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/25 14:48
 */
public class UserDaoImpl implements UserDao {
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    private String username;
   private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public UserDaoImpl() {
    }

    /**
     * 保存
     */
    public void save() {

        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("run saving........");
    }
}
