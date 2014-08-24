package com.cyberiq.weather.web.forms;

public class LoginForm {

	
	private static final String EMPTY_STRING = "";
	
	private String userName = EMPTY_STRING;
	
	private String password = EMPTY_STRING;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
