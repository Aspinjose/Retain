package com.stepdefinition;


import com.Driver_Manager.Driver_Manager;
import com.common_utlis.Common_Utlis;

import io.cucumber.java.Before;

public class Common_stepdefinition {
	
	//launch_browser
	@Before
	public void Before_scenario() {

		try {
			Common_Utlis commonutlis=new Common_Utlis();
			commonutlis.load_properties();
			if(Driver_Manager.getDriver()==null) {
				Driver_Manager.launch_browser();
				commonutlis.initElement();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
