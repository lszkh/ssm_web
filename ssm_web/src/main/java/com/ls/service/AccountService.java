package com.ls.service;

import java.util.List;

import com.ls.domain.Account;

/**
 * 业务层接口
 * @author Administrator
 *
 */
public interface AccountService {

    public void saveAccount(Account account);
    
    public List<Account> findAll();
}
