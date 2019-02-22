package com.ls.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.ls.domain.Account;

/**
 * 持久层接口
 * @author Administrator
 *
 */
@Repository
public interface AccountMapper {
    
    
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);
    
    
    @Select("select * from account")
    public List<Account> findAll();
}
