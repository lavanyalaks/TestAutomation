package com.amazon.applicationpages;

import org.openqa.selenium.WebDriver;

import com.amazon.pageobjects.BookDetailsPage;

public class AmazonBookDetailsPage implements BookDetailsPage {
	WebDriver driver;

	public AmazonBookDetailsPage(WebDriver driver) {
		this.driver = driver;

	}

	// get price from pdp page (can make a common method)
	public String getPriceFromBookDetailPage() {

		String getbookdetailpageprice = driver.findElement(bookdetailspricevalue).getText();
		return getbookdetailpageprice;
	}

	//click on addtocart button
	public void clickAddToCartButton() {
		driver.findElement(addtocart).click();
	}
	
	
	
}
