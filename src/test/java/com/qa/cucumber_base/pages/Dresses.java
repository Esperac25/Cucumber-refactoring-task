package com.qa.cucumber_base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dresses {
	
	@FindBy(linkText = "Dresses")
	private WebElement dressTab;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	private WebElement addToCart;
	
	public void addDressToCart() {
		dressTab.click();
		addToCart.click();
	}

}
