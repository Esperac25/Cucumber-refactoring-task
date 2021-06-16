package com.qa.cucumber_base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout {
	@FindBy(xpath = "//*[@id=\"button_order_cart\"]/span")
	private WebElement checkout;
	
	@FindBy(id = "cgv")
	private WebElement termsOfService;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	private WebElement proceedToCheckout;
	
	@FindBy(xpath ="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	private WebElement payByBank;
	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
	private WebElement confirmOrder;
	
	
	public void checkOut() {
		checkout.click();
		termsOfService.click();
		proceedToCheckout.click();
		payByBank.click();
		confirmOrder.click();
	}
}
