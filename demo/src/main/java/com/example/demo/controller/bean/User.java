package com.example.demo.controller.bean;

public class User {
	private String userId;
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId = " + userId + ", password = " + password + "]";
	}
	// Testing whether changes made in file on eclipse are reflected on GitHub or not.
}
