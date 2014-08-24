package com.cyberiq.weather.web.model;

public class Temperature {

	private final String EMPTY_STRING = "";
	private String city = EMPTY_STRING;
	private String zipCode = EMPTY_STRING;
	private String currentTemp = EMPTY_STRING;
	private String maxTemp = EMPTY_STRING;
	private String minTemp = EMPTY_STRING;
	private String humidity = EMPTY_STRING;
	private String wind = EMPTY_STRING;
	
	
	public Temperature() {
		super();
	}

	public Temperature(String city, String zipCode, String currentTemp,
			String maxTemp, String minTemp, String humidity, String wind) {
		super();
		this.city = city;
		this.zipCode = zipCode;
		this.currentTemp = currentTemp;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.humidity = humidity;
		this.wind = wind;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCurrentTemp() {
		return currentTemp;
	}
	public void setCurrentTemp(String currentTemp) {
		this.currentTemp = currentTemp;
	}
	public String getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(String maxTemp) {
		this.maxTemp = maxTemp;
	}
	public String getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(String minTemp) {
		this.minTemp = minTemp;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getWind() {
		return wind;
	}
	public void setWind(String wind) {
		this.wind = wind;
	}
	
	
	
}
