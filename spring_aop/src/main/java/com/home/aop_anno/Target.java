package com.home.aop_anno;

import org.springframework.stereotype.Component;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/26 14:37
 */
@Component
public class Target implements TargetInterface {
    /**
     * 保存
     */
    public void save() {

        System.out.println("save running........");

    }
}
