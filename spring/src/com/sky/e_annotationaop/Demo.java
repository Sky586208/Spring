package com.sky.e_annotationaop;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.sky.service.UserService;
//�����Ǵ�������
@RunWith(SpringJUnit4ClassRunner.class) 
//ָ����������ʱʹ���Ǹ������ļ�
@ContextConfiguration("classpath:com/sky/e_annotationaop/applicationContext.xml")
public class Demo{
		
	//����Ϊuser�Ķ���ע�뵽u������
	@Resource(name="userService")
	private UserService us;
	
		@Test
		public void fun1(){
			
			us.save();
	}
}
