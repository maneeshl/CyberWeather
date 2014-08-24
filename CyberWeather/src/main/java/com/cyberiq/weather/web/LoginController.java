package com.cyberiq.weather.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cyberiq.weather.web.forms.LoginForm;
import com.cyberiq.weather.web.manager.LoginManagerService;



@Controller
public class LoginController {

	
	public static final String FORM_NAME = "loginForm";
	private static final Logger logger = Logger.getLogger(LoginController.class);

	@Autowired
	private LoginManagerService service;
	
	@RequestMapping(value = "/login.action", method = RequestMethod.POST)
	public String displayPage(final ModelMap model, @ModelAttribute(value = FORM_NAME) LoginForm form) {
		return "welcome";
	}
	
	@RequestMapping(value = "/login.action", method = RequestMethod.GET)
	public String landingPage(final ModelMap model, @ModelAttribute(value = FORM_NAME) LoginForm form) {
		return "welcome";
	}
	
}
