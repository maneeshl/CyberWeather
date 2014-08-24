package com.cyberiq.weather.web.dao;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.cyberiq.weather.web.model.Temperature;


public class TemperatureDAOImpl implements TemperatureDAO {

	private static final Logger logger = Logger.getLogger(TemperatureDAOImpl.class);
	
	private HashMap<String, Temperature> lookUpHashMap;
	
	private @Value("${ATLANTA}") String ATL;
	private @Value("${BALTIMORE}") String BWI;
	private @Value("${HOUSTON}") String HOU;
	private @Value("${ORLANDO}") String ORD;
	private @Value("${SEATTLE}") String SEA;
	
	// THIS IS ONLY FOR MOCKING PURPOSES, IN THE ABSENCE OF PROPER DATABASE
		
	public TemperatureDAOImpl() {
		super();
	}


	/**
	 *  Key Lookup method that retrieves "Temperature" value object from HashMap Data Structure based on ZIP CODE
	 */
	public Temperature lookUpTemp(String zipCode) {

		return lookUpHashMap.get(zipCode);
	}


	public HashMap<String, Temperature> getLookUpHashMap() {
		return lookUpHashMap;
	}

	public void setLookUpHashMap(HashMap<String, Temperature> lookUpHashMap) {
		this.lookUpHashMap = lookUpHashMap;
	}
	
}
