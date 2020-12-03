package com.home.controller;

import com.home.domain.Account;
import com.home.mapper.AccountMapper;
import com.home.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/12/3 15:34
 */
@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    AccountService accountService;
    /**
     * 保存
     * @param account
     * @return
     */
    @RequestMapping(value="save",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String save(Account account){
        accountService.save(account);
        return "保存成功";
    }
    @RequestMapping("findAll")
    public ModelAndView findAll(){
        List<Account> accountList = accountService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountList",accountList);
        modelAndView.setViewName("accountList");
        return  modelAndView;
    }
}
