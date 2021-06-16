package com.qa.cucumber_base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage {
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/p/strong")
	private WebElement confirmationPage;
	
	public boolean didOrderComplete() {
		if(confirmationPage != null) {
			if(confirmationPage.getText()
								.equals("Your order on My Store is complete.")) {
				return true;
			}
		}
		return false;
	}
}
