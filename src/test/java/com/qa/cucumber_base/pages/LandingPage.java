package com.qa.cucumber_base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	final public static String url = "http://automationpractice.com/index.php";
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	private WebElement signInButton;
	
	@FindBy(xpath = "//input[@id='email_create']")
	private WebElement emailInput;
	
	@FindBy(id = "SubmitCreate")
	private WebElement createButton;
	
	public void signInAndCreateAccount(String email) {
		signInButton.click();
		emailInput.sendKeys(email);
		createButton.submit();
	}

}
