package com.springmvc.dao;

import java.sql.SQLException;

import com.springmvc.modol.User;
	public interface UserDao  {
		public User query(String name,String password)  throws SQLException ;
		public int add(String name,String password) throws SQLException ;
}
