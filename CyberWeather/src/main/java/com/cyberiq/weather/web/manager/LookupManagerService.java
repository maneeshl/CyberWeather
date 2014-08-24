package com.cyberiq.weather.web.manager;

import com.cyberiq.weather.web.forms.TemperatureForm;
import com.cyberiq.weather.web.model.Temperature;

public interface LookupManagerService {

	public Temperature lookUpTemp(TemperatureForm form);
	
}
