package com.springmvc.service;

import java.util.List;

import com.springmvc.modol.User;

public interface UserService {
	public User login(String name,String password) throws Exception;
	public int regis(String name,String password) throws Exception;
	public List<User> getUserList() throws Exception;
	public int delete(String user) throws Exception;
}
