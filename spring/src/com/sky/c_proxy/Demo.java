package com.sky.c_proxy;

import org.junit.Test;

import com.sky.service.UserService;
import com.sky.service.UserServiceImpl;

public class Demo {

	@Test
	public void fun1() {
		UserService us = new UserServiceImpl();
		
		UserServiceProxyFactory factory = new UserServiceProxyFactory(us);
		
		UserService usProxy = factory.getUserServiceProxy();
		
		usProxy.save();
	}
	
}
