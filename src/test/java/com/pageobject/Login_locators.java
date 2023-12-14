package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_locators {
	
	private static Login_locators LoginInstance;
	
	private Login_locators() {
		
	}
    public static Login_locators getInstance() {
    	if(LoginInstance==null) {
    		LoginInstance=new Login_locators();
    	}
    	return LoginInstance;
    }
	@FindBy(id = "otherTileText")
	private WebElement user_another_account;
	@FindBy(id = "i0116")
	private WebElement user_name_field;
	@FindBy(id = "idSIButton9")
	private WebElement next_button;

	@FindBy(id = "i0118")
	private WebElement password_field;
	@FindBy(xpath = "//*[@id=\'idSIButton9\']")
	private WebElement signin_button;

	public WebElement getUser_another_account() {
		return user_another_account;
	}

	public WebElement getUser_name_field() {
		return user_name_field;
	}

	public WebElement getNext_button() {
		return next_button;
	}

	public WebElement getPassword_field() {
		return password_field;
	}

	public WebElement getSignin_button() {
		return signin_button;
	}

}
