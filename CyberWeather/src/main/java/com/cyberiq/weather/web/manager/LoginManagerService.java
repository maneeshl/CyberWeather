package com.cyberiq.weather.web.manager;

import com.cyberiq.weather.web.model.User;

public interface LoginManagerService {

	public User checkCredentials(String userName, String pwd);
	
}
