package com.sky.c_injection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.bean.User;

public class DemoTest {
	//设值注入
	@Test
	public void fun1() {
		
		//1.创建容器
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/c_injection/applicationContext.xml");
		//2.向容器要User对象
		User u = (User) ac.getBean("user");
		//3.打印User对象
		System.out.println(u);
		
	}
    //构造注入
	@Test
	public void fun2() {
		
		//1.创建容器
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/c_injection/applicationContext.xml");
		//2.向容器要User对象
		User u = (User) ac.getBean("user2");
		//3.打印User对象
		System.out.println(u);
		
	}
	
	@Test
	public void fun5() {
		
		//1.创建容器
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/c_injection/applicationContext.xml");
		//2.向容器要User对象
		CollectionBean cb = (CollectionBean) ac.getBean("cb");
		//3.打印User对象
		System.out.println(cb);
		
	}
}
