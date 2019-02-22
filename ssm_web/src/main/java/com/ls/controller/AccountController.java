package com.ls.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ls.domain.Account;
import com.ls.service.AccountService;

/**
 * 前段控制器
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;
    	/**
    	 * 查询所有账户
    	 * @return
    	 */
    	@RequestMapping("/findAll")
    	public String findAll(Model model) {
    	    System.out.println("表现层：查询所有账户。。。");
    	    List<Account> list = accountService.findAll();
    	    model.addAttribute("list",list);
    	    return "list";
    	}
    	
    	/**
    	 * 保存账户
    	 * @param account
    	 */
    	@RequestMapping("/saveAccount")
        public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
            accountService.saveAccount(account);
            response.sendRedirect(request.getContextPath()+"/account/findAll");
            return;
        }
}
