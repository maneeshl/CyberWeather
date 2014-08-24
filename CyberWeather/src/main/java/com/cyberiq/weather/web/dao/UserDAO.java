package com.cyberiq.weather.web.dao;

import com.cyberiq.weather.web.model.User;

public interface UserDAO {

	public User getUser(String userName, String pwd);
	
}
