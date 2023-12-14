package com.stepdefinition;

import com.Driver_Manager.Driver_Manager;
import com.constants.Constants;
import com.pageobject.Login_locators;

import io.cucumber.java.en.*;

public class Login_step {

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		Driver_Manager.getDriver().get(Constants.Launch_url);

	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Login_locators.getInstance().getUser_name_field().sendKeys(Constants.User_name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Login_locators.getInstance().getNext_button().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Login_locators.getInstance().getPassword_field().sendKeys(Constants.Password);
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	}

	@Then("User should be redirected to the home page")
	public void user_should_be_redirected_to_the_home_page() {
	}

	@Then("User should see a welcome message")
	public void user_should_see_a_welcome_message() {
	}

}