package com.sky.b_create;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.bean.User;

public class DemoTest {
	
	@Test
	//������ʽ1::�ղι���
	public void fun1() {
		
		//1.��������
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/b_create/applicationContext.xml");
		//2.������ҪUser����
		User u = (User) ac.getBean("user");
		//3.��ӡUser����
		System.out.println(u);
		
	}
	//������ʽ2::��̬��������
	@Test
	public void fun2() {
		
		//1.��������
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/b_create/applicationContext.xml");
		//2.������ҪUser����
		User u = (User) ac.getBean("user2");
		//3.��ӡUser����
		System.out.println(u);
		
	}
	//������ʽ3::ʵ����������
		@Test
		public void fun3() {
			
			//1.��������
			ApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/b_create/applicationContext.xml");
			//2.������ҪUser����
			User u = (User) ac.getBean("user3");
			//3.��ӡUser����
			System.out.println(u);
			
		}
		
		//�����������ڷ���
				@Test
				public void fun5() {
					
					//1.��������
					ClassPathXmlApplicationContext ac= new ClassPathXmlApplicationContext("com/sky/b_create/applicationContext.xml");
					//2.������ҪUser����
					User u = (User) ac.getBean("user");
					//3.��ӡUser����
					System.out.println(u);
					//�ر��������������ٷ���
					ac.close();
					
				}

}
