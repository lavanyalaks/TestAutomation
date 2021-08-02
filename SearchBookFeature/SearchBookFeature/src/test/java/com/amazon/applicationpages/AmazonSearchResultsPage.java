package com.amazon.applicationpages;

import org.openqa.selenium.WebDriver;

import com.amazon.pageobjects.SearchResultsPageObjects;

public class AmazonSearchResultsPage implements SearchResultsPageObjects {
	WebDriver driver;

	public AmazonSearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchResultClick() {
		this.driver.findElement(firstsearchresult).click();

	}

	public String getSearchResultBookPrice() {

		String getresultspagepricevalue = driver.findElement(firstresultprice).getAttribute("innerHTML");
		return getresultspagepricevalue;

	}

}
