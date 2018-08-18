package com.springmvc.dao;

import java.sql.SQLException;
import java.util.List;

import com.springmvc.modol.User;
	public interface UserDao  {
		public User query(String name,String password)  throws SQLException ;
		public int add(String name,String password) throws SQLException ;
		public List<User> show() throws SQLException ;
		public int del(String user) throws SQLException;
}
