package com.qa.cucumber_base.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.qa.cucumber_base.pages.AutomationPOMRepository;
import com.qa.cucumber_base.hooks.Hooks;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class PurchaseItems {
	
	private AutomationPOMRepository pom;
	private WebDriver webDriver;
	
	private boolean orderCompletedExpected;
	private boolean orderCompletedActual;
	
	public PurchaseItems(Hooks hooks) {
		this.webDriver = hooks.getWebDriver();
		this.pom = new AutomationPOMRepository(webDriver);
		this.orderCompletedExpected = true;
	}
	@Given("the user is on the home page")
	public void theUserIsOnTheHomePage(String email) {
	    System.out.println(email + " ");
		webDriver.get(pom.landingPage.url);
	    pom.landingPage.signInAndCreateAccount(email);  
	}
	@When("the user creates an account")
	public void theUserCreatesAnAccount(String name, String last, String email, String pwd, String address, String city, String state, String postcode, String country, String phoneNumber) {
	   pom.createAccount.accountInfoAndRegister(name, last, email, pwd, address, city, state, postcode, country, phoneNumber);
	}
	@Then("the user logs in to verify their account was created")
	public void theUserLogsInToVerifyTheirAccountWasCreated(String email, String pwd) {
	    pom.login.userLogin(email, pwd);
	}
	@Given("the user clicks  dress tab and navigates to the dresses page")
	public void theUserClicksDressTabAndNavigatesToTheDressesPageAndAddsToCart() {
		pom.dress.addDressToCart();
	}

	@Given("the user clicks checkout")
	public void theUserClicksCheckout() {
	    pom.checkout.checkOut();
	    this.orderCompletedActual = pom.confirmOrder.didOrderComplete();
	}
	@Then("the order confirmation page appears")
	public void theOrderConfirmationPageAppears() {
	   assertEquals(orderCompletedExpected, orderCompletedActual);
	}

}
