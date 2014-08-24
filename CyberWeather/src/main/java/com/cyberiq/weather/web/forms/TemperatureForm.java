package com.cyberiq.weather.web.forms;

public class TemperatureForm {

	private static final String EMPTY_STRING = "";
	private String zipSelected = EMPTY_STRING;
	
	private String city = EMPTY_STRING;
	private String maxTemp = EMPTY_STRING;
	private String minTemp = EMPTY_STRING;
	private String cityImage = EMPTY_STRING;
	
	
	public String getZipSelected() {
		return zipSelected;
	}
	public void setZipSelected(String zipSelected) {
		this.zipSelected = zipSelected;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	public String getCityImage() {
		return cityImage;
	}
	public void setCityImage(String cityImage) {
		this.cityImage = cityImage;
	}
	
	
	
}
