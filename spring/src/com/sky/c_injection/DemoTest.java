package com.sky.c_injection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.bean.User;

public class DemoTest {
	//��ֵע��
	@Test
	public void fun1() {
		
		//1.��������
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/c_injection/applicationContext.xml");
		//2.������ҪUser����
		User u = (User) ac.getBean("user");
		//3.��ӡUser����
		System.out.println(u);
		
	}
    //����ע��
	@Test
	public void fun2() {
		
		//1.��������
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/c_injection/applicationContext.xml");
		//2.������ҪUser����
		User u = (User) ac.getBean("user2");
		//3.��ӡUser����
		System.out.println(u);
		
	}
	
	@Test
	public void fun5() {
		
		//1.��������
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/c_injection/applicationContext.xml");
		//2.������ҪUser����
		CollectionBean cb = (CollectionBean) ac.getBean("cb");
		//3.��ӡUser����
		System.out.println(cb);
		
	}
}
