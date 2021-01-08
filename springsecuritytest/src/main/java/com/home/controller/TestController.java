package com.home.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/7 13:57
 */
@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping("hello")
    public String hello() {
        return "hello security";
    }

    @GetMapping("index")
    public String index() {
        return "hello index";
    }

    @Secured({"ROLE_sale", "ROLE_manager"})
    @GetMapping("update")
    public String update() {
        return "hello update";
    }

    @PreAuthorize("hasAnyAuthority('role')")
    @GetMapping("update1")
    public String update1() {
        return "hello update1";
    }

    @PostAuthorize("hasAnyAuthority('role')")
    @GetMapping("update2")
    public String update2(){
        return "update2";
    }


}
