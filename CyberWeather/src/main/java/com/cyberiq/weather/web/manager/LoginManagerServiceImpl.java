package com.cyberiq.weather.web.manager;

import org.springframework.beans.factory.annotation.Autowired;

import com.cyberiq.weather.web.dao.UserDAO;
import com.cyberiq.weather.web.model.User;

public class LoginManagerServiceImpl implements LoginManagerService {
	
	@Autowired
	private UserDAO user;

	public User checkCredentials(String userName, String pwd) {
		
		return user.getUser(userName, pwd);
	}
	
	
}
