package com.cyberiq.weather.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cyberiq.weather.web.forms.TemperatureForm;
import com.cyberiq.weather.web.manager.LookupManagerService;


@Controller
public class TemperatureController {

	
	public static final String FORM_NAME = "temperatureForm";
	private static final Logger logger = Logger.getLogger(TemperatureController.class);
	
	@Autowired
	private LookupManagerService lookUpService;

	@RequestMapping(value = "/showMessage.action", method = RequestMethod.GET)
	public String displayPage(final ModelMap model, @ModelAttribute(value = FORM_NAME) TemperatureForm form) {

		// Pass on the FORM and let Manager Service handle all the logic
		lookUpService.lookUpTemp(form);
		
		return "showMessage";
	}
	
}
