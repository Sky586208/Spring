package com.sky.d_springaop;

import org.aspectj.lang.ProceedingJoinPoint;

//֪ͨ��
public class MyAdvice {

	//ǰ��֪ͨ 
	//-> Ŀ�귽������֮ǰ����
	//����֪ͨ ����������쳣������ã�
	//-> Ŀ�귽������֮�����
	//����֪ͨ
	//-> Ŀ�귽��֮ǰ�ͻ�󶼵���
	//�쳣����֪ͨ
	//-> ��������쳣���ͻ����
	//����֪ͨ�������Ƿ�����쳣������ã�
//------------------------------------------------------
	//ǰ��֪ͨ
	public void before() {
		    System.out.println("����ǰ��֪ͨ����");
	}
	
	//����֪ͨ
	public void afterReturning() {
			System.out.println("���Ǻ���֪ͨ�������쳣������ã���");
	}
	
	//ǰ��֪ͨ
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		
		    System.out.println("���ǻ���֪֮ͨǰ����");
		
		    Object proceed = pjp.proceed();//����Ŀ�귽��
		
			System.out.println("���ǻ���֪֮ͨ�󣡣�");
			return proceed;
	}
	//�쳣֪ͨ
	public void afterException() {
		    System.out.println("�����쳣����");
	}
	//����֪ͨ
	public void after() {
			System.out.println("���Ǻ���֪ͨ�������Ƿ�����쳣������ã�����");
	}
}
