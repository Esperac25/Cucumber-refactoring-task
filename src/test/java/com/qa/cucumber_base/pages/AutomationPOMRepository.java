package com.qa.cucumber_base.pages;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.qa.cucumber_base.hooks.Hooks;

public class AutomationPOMRepository {
	
	private WebDriver webDriver;
	
	public LandingPage landingPage;
	public CreateAccount createAccount;
	public Login login;
	public Dresses dress;
	public Checkout checkout;
	public ConfirmationPage confirmOrder;
	
	public AutomationPOMRepository(WebDriver webDriver) {
		this.webDriver = webDriver;
		this.webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		this.webDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		this.landingPage = PageFactory.initElements(webDriver, LandingPage.class);
		this.createAccount = PageFactory.initElements(webDriver, CreateAccount.class);
		this.login = PageFactory.initElements(webDriver, Login.class);
		this.dress = PageFactory.initElements(webDriver, Dresses.class);
		this.checkout = PageFactory.initElements(webDriver, Checkout.class);
		this.confirmOrder = PageFactory.initElements(webDriver, ConfirmationPage.class);
	}
}
