package com.cyberiq.weather.web.manager;

import com.cyberiq.weather.web.dao.TemperatureDAO;
import com.cyberiq.weather.web.forms.TemperatureForm;
import com.cyberiq.weather.web.model.Temperature;

public class LookupManagerServiceImpl implements LookupManagerService {

	private TemperatureDAO tempDAO;
    private Temperature localTemp = new Temperature();
	
	/**
	 * Service method to implement business logic, if needed and call the back end services
	 */
	public Temperature lookUpTemp(TemperatureForm form) {
		
		String tempStr = "";
		
		localTemp = tempDAO.lookUpTemp(form.getZipSelected());
		form.setCityImage(tempStr+"/"+localTemp.getCity()+"/");
		
		return localTemp;
	}

	public TemperatureDAO getTempDAO() {
		return tempDAO;
	}

	public void setTempDAO(TemperatureDAO tempDAO) {
		this.tempDAO = tempDAO;
	}

	
}
