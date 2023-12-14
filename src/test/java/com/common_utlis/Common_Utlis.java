package com.common_utlis;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.Driver_Manager.Driver_Manager;
import com.constants.Constants;
import com.pageobject.Login_locators;

public class Common_Utlis {

	public void load_properties() {
		Properties pr = new Properties();
		try {
			pr.load(getClass().getResourceAsStream("/config.properties"));
		} catch (Exception e) {
		}

		Constants.Browserchosen = pr.getProperty("Browser");
		Constants.Launch_url = pr.getProperty("Url");
		Constants.User_name = pr.getProperty("Username");
		Constants.Password = pr.getProperty("Password");

	}

	public void initElement() {
		PageFactory.initElements(Driver_Manager.getDriver(), Login_locators.getInstance());

	}
}
