package com.ls.domain;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ls.service.AccountService;

/**
 * 功能测试
 * @author Administrator
 *
 */
public class ServiceTest {

    @Test
    public void findAll() {
	// 加载配置文件
	ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	// 获取对象
	AccountService as = (AccountService) ac.getBean("accountService");
	// 调用方法
	as.findAll();
    }
}
