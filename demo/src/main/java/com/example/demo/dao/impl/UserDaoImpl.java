package com.example.demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.bean.User;
import com.example.demo.dao.UserDao;

import jakarta.annotation.PostConstruct;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialise() {
		setDataSource(dataSource);
	}

	@SuppressWarnings("deprecation")
	@Override
	public User getUserById(String userId) {
		String sql = "select cast(aes_decrypt(unhex(`user_pswd`), 'secret') as char(50)) from user where user_id=?;";
		return getJdbcTemplate().queryForObject(sql, new Object[] { userId }, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setUserId(userId);
				user.setPassword(rs.getString(1));
				return user;
			}
		});
	}
}
