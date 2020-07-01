package com.sky.b_create;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.bean.User;

public class DemoTest {
	
	@Test
	//创建方式1::空参构造
	public void fun1() {
		
		//1.创建容器
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/b_create/applicationContext.xml");
		//2.向容器要User对象
		User u = (User) ac.getBean("user");
		//3.打印User对象
		System.out.println(u);
		
	}
	//创建方式2::静态工厂构造
	@Test
	public void fun2() {
		
		//1.创建容器
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/b_create/applicationContext.xml");
		//2.向容器要User对象
		User u = (User) ac.getBean("user2");
		//3.打印User对象
		System.out.println(u);
		
	}
	//创建方式3::实例工厂构造
		@Test
		public void fun3() {
			
			//1.创建容器
			ApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/b_create/applicationContext.xml");
			//2.向容器要User对象
			User u = (User) ac.getBean("user3");
			//3.打印User对象
			System.out.println(u);
			
		}
		
		//测试生命周期方法
				@Test
				public void fun5() {
					
					//1.创建容器
					ClassPathXmlApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/b_create/applicationContext.xml");
					//2.向容器要User对象
					User u = (User) ac.getBean("user");
					//3.打印User对象
					System.out.println(u);
					//关闭容器，触发销毁方法
					ac.close();
					
				}

}
