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
//@Service("user")  //Service层
//@Controller("user")  //web层
@Repository("user")  //dao层
//指定对象的作用范围
@Scope(scopeName="singleton")
public class User {
	
	@Value("tom")
	
	private String name;
	
	@Value("18")
	private Integer age;
	
	//@Autowired   //自动装配
	//@Qualifier("car2") 选择自动装配对象
	
	@Resource(name="car")  //手动注入，指定对象
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
    
	@PostConstruct  // 对象被创建后调用  init-method
	public void init() {
		System.out.println("初始化方法");
	}
	@PreDestroy    //对象销毁前调用  destory-method
	public void destory() {
		System.out.println("销毁方法");
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	
	
}
