package com.testdemo.web.vo;

public class Student {
	private int userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private int userAge;
	private int userGrade;
	public int getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
}
