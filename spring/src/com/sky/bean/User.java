package com.sky.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//<bean name="user" class="com.sky.bean.User" />
//@Component("user")
//@Service("user")  //Service��
//@Controller("user")  //web��
@Repository("user")  //dao��
//ָ����������÷�Χ
@Scope(scopeName="singleton")
public class User {
	
	@Value("tom")
	
	private String name;
	
	@Value("18")
	private Integer age;
	
	//@Autowired   //�Զ�װ��
	//@Qualifier("car2") ѡ���Զ�װ�����
	
	@Resource(name="car")  //�ֶ�ע�룬ָ������
	private Car car;
	
	
	

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
    
	@PostConstruct  // ���󱻴��������  init-method
	public void init() {
		System.out.println("��ʼ������");
	}
	@PreDestroy    //��������ǰ����  destory-method
	public void destory() {
		System.out.println("���ٷ���");
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	
	
}
