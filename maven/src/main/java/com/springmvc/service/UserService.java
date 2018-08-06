package com.springmvc.service;

import com.springmvc.modol.User;

public interface UserService {
	public User login(String name,String password) throws Exception;
	public int regis(String name,String password) throws Exception;

}
