package com.sky.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.bean.User;

public class DemoTest {
	
	@Test
	public void fun1() {
		
		//1.��������
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/applicationContext.xml");
		//2.������ҪUser����
		User u = (User) ac.getBean("user");
		//3.��ӡUser����
		System.out.println(u);
		
	}

}
