package com.sky.a_jdbc;

import java.util.List;

public interface UserDao {

	//��
	void save(User u);
	//ɾ
	void delete(Integer id);
	//��
	void update(User u);
	//��
	User getById(Integer id);
	//��
	int getTotalCount();
	//��
	List<User> getAll();
	
}
