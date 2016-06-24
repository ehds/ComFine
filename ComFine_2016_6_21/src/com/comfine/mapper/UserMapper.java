package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.User;

public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rownum) throws SQLException {
		// TODO 数据库一行对应的对象映射
		User user = new User();
		user.setUserId(rs.getInt("id"));
		user.setUserName(rs.getString("username"));
		user.setUserPwd(rs.getString("password"));
		user.setTel(rs.getString("tel"));
		user.setPicpath(rs.getString("facepath"));
		return user;
	}

}
