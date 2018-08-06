package com.springmvc.service;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDao;
import com.springmvc.modol.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public User login(String name, String password) throws Exception {
		User user = userDao.query(name, password);
		return user;
	}
	
	public int regis(String name,String password)throws Exception {
		int user = userDao.add(name,password);
		return user;
	}
	
	public List<User> getUserList() throws Exception{
		List<User> users = userDao.show();
		return  users;
	}
	
	public int delete(String user) throws Exception{
		int del = userDao.del(user);
		return del;
	}
//	public UserDao getUserDao() {
//		return userDao;
//	}
//	public void setUserDao(UserDao userDao) {
//		this.userDao = userDao;
//	}

}
