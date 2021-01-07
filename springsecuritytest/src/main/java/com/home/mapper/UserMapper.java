package com.home.mapper;

import com.home.entity.User;
import org.springframework.stereotype.Repository;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/7 14:47
 */
@Repository
public interface UserMapper {
    /**
     * 根据名称查找
     * @param username
     * @return
     */
    User findByName(String username);
}
