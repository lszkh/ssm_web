package com.ls.domain;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.ls.mapper.AccountMapper;

public class MybatisTest {
    
    @Test
    public void findAll() throws Exception {
	InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
	SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
	SqlSession session = factory.openSession();
	AccountMapper mapper = session.getMapper(AccountMapper.class);
	List<Account> list = mapper.findAll();
	for (Account account : list) {
	    System.out.println(account);
	}
	session.close();
	inputStream.close();
    }
    
    @Test
    public void saveAccount() throws Exception {
	Account account = new Account();
	account.setName("曹美美");
	account.setMoney(250d);
	InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
	SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
	SqlSession session = factory.openSession();
	AccountMapper mapper = session.getMapper(AccountMapper.class);
	mapper.saveAccount(account);
	session.commit();
	session.close();
	inputStream.close();
    }
}
