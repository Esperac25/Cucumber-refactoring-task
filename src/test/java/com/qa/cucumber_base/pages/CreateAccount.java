package com.qa.cucumber_base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount {
	@FindBy(id = "customer_firstname")
	private WebElement firstName;
	
	@FindBy(id = "customer_lastname")
	private WebElement lastName;
	
	@FindBy(id = "email")
	private WebElement emailInput;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(id = "firstname")
	private WebElement firstNameAddress;
	
	@FindBy(id = "lastname")
	private WebElement lastNameAddress;
	
	@FindBy(id = "address1")
	private WebElement addressInput;
	
	@FindBy(id = "city")
	private WebElement cityInput;
	
	@FindBy(id = "id_state")
	private WebElement stateInput;
	
	@FindBy(id = "postcode")
	private WebElement postcodeInput;
	
	@FindBy(id = "id_country")
	private WebElement countryInput;
	
	@FindBy(id = "phone_mobile")
	private WebElement phoneInput;
	
	@FindBy(id = "alias")
	private WebElement aliasInput;
	
	@FindBy(id = "submitAccount")
	private WebElement registerButton;
	
	public void accountInfoAndRegister(String name, String last, String email, String pwd, String address, String city, String state, String postcode, String country, String phoneNumber) {
		firstName.sendKeys(name);
		lastName.sendKeys(last);
		emailInput.sendKeys(email);
		password.sendKeys(pwd);
		firstNameAddress.sendKeys(name);
		lastNameAddress.sendKeys(last);
		addressInput.sendKeys(address);
		cityInput.sendKeys(city);
		stateInput.sendKeys(state);
		postcodeInput.sendKeys(postcode);
		phoneInput.sendKeys(phoneNumber);
		aliasInput.sendKeys(address);
		registerButton.submit();
	}
}
