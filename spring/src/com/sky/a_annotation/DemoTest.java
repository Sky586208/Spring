package com.sky.a_annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.bean.User;

public class DemoTest {
	
	@Test
	public void fun1() {
		
		//1.��������
		ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.������ҪUser����
		User u1 = (User) ac.getBean("user");
		User u2 = (User) ac.getBean("user");
		
		System.out.println(u1==u2);
		//3.��ӡUser����
		System.out.println(u1);
		
	}

}
