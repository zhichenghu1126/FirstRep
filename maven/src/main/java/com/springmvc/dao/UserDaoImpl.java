package com.springmvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.springmvc.modol.User;

public class UserDaoImpl implements UserDao{
	private DataSource dataSource;
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public User query(String name,String password) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = dataSource.getConnection();
		String sql = "select user_name,user_password from user where user_name=? and user_password=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		List<User>  users = new ArrayList<User>();
		while (rs.next()) {
			String userName = rs.getString("user_name");
			String up = rs.getString("user_password");
			User user = new User();
			user.setName(userName);
			user.setPassword(up);
			users.add(user);
		}
		conn.close();
		return users.isEmpty()?null:users.get(0);
	}
	
	
	public int add(String name,String password) throws SQLException{
		int update = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = dataSource.getConnection();
		String sql = "insert into user(user_name,user_password) values(?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, password);
		update = pstmt.executeUpdate();

		conn.close();
		return update;
	}
	
	public List<User> show() throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = dataSource.getConnection();
		String sql = "select user_name,user_password from user";
		pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<User>  users = new ArrayList<User>();
		while (rs.next()) {
			String userName = rs.getString("user_name");
			String up = rs.getString("user_password");
			User user = new User();
			user.setName(userName);
			user.setPassword(up);
			users.add(user);
		}
		conn.close();
		return users;
	}
	
	public int del(String user) throws SQLException{
		int del = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = dataSource.getConnection();
		String sql = "delete from user where user_name =?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user);
		del = pstmt.executeUpdate();
		conn.close();
		return del;
	}
	
	
	
	
	
	
}
