package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.domain.Account;
import com.ls.mapper.AccountMapper;
import com.ls.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService{
    
    @Autowired
    private AccountMapper accountMapper;
    
    public void saveAccount(Account account) {
        System.out.println("业务层：保存帐户...");
        accountMapper.saveAccount(account);
    }

    @Override
    public List<Account> findAll() {
	// TODO Auto-generated method stub
	System.out.println("业务层：查询所有账户。。。");
	return accountMapper.findAll();
    }
    
    
}
