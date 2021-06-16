package com.qa.cucumber_base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(id = "SubmitLogin")
	private WebElement loginButton;
	
	public void userLogin(String emailInput, String pwd) {
		email.sendKeys(emailInput);
		password.sendKeys(pwd);
		loginButton.submit();
	}
}
