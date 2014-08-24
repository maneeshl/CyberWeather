package com.cyberiq.weather.web.dao;

import com.cyberiq.weather.web.model.Temperature;

public interface TemperatureDAO {

	public Temperature lookUpTemp(String zipCode);
}
