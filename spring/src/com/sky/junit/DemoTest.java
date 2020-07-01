package com.sky.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.bean.User;

public class DemoTest {
	
	@Test
	public void fun1() {
		
		//1.创建容器
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/applicationContext.xml");
		//2.向容器要User对象
		User u = (User) ac.getBean("user");
		//3.打印User对象
		System.out.println(u);
		
	}

}
