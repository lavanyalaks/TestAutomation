package com.amazon.applicationpages;

import org.openqa.selenium.WebDriver;

import com.amazon.pageobjects.AddToCartPageObjects;

public class AmazonAddToCartPage implements AddToCartPageObjects {
	WebDriver driver;

	public AmazonAddToCartPage(WebDriver driver) {
		this.driver = driver;

	}

	// get price from addtocart page (can make a common method)
	public String getPriceFromaddtocartPage() {		
		String getbookdetailpageprice = driver.findElement(getaddtocartprice).getText();		
		return getbookdetailpageprice;
	}

	// click on proceedtocheckout button
	public void clickToProceedToCheckout() {
		driver.findElement(proceedtocheckoutbutton).click();
	}

}
