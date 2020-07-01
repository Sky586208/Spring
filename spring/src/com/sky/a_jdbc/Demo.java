package com.sky.a_jdbc;

import java.beans.PropertyVetoException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

//演示jdbc模板
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/sky/a_jdbc/applicationContext.xml")
public class Demo {

	@Resource(name="userDao")
	private UserDao ud;
	
	@Test
	public void fun1() throws Exception {
		
		//0准备连接池
		ComboPooledDataSource ds = new ComboPooledDataSource();
		ds.setDriverClass("com.mysql.cj.jdbc.Driver");
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/spring?characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai");
		ds.setUser("root");
		ds.setPassword("manager");
		
		//1创建JDBC模板对象
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(ds);
		
		//2书写SQl,并执行
		String sql = "insert into user values(null,'rose')";
		jt.update(sql);
		
	}
	
	@Test
	public void fun2() throws Exception {
		
		User u =new User();
		
		u.setName("tom");
		
		ud.save(u);
		
	}
	@Test
	public void fun3() throws Exception {
		
		User u =new User();
		u.setId(3);
		u.setName("jack");
		
		ud.update(u);
		
	}
	@Test
	public void fun4() throws Exception {
		
		ud.delete(2);
		
	}
	@Test
	public void fun5() throws Exception {
		
		System.out.println(ud.getTotalCount());
		
	}
	@Test
	public void fun6() throws Exception {
		
		System.out.println(ud.getById(1));
		
	}
	@Test
	public void fun7() throws Exception {
		
		System.out.println(ud.getAll());
		
	}
}
