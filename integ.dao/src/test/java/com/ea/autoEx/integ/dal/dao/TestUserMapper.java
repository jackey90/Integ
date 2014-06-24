package com.ea.autoEx.integ.dal.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.ea.autoEx.integ.dal.model.User;

@ContextConfiguration("classpath:testSpring/applicationContext.xml")
@TransactionConfiguration(transactionManager = "transactionManager")
public class TestUserMapper extends
		AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	UserMapper userMapper;

	@Test
	public void testUserMapper1() {
		User user = userMapper.getUserById(1l);
		System.out.println(user.toString());
	}
}
