package com.amazon.commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CommonMethods {
	static WebDriver driver;

	public CommonMethods(WebDriver driver) {
		this.driver = driver;

	}

	public static void priceassert(String searchresultprice, String productpageprice) {
		Assert.assertEquals(searchresultprice, productpageprice);

	}
	
	public static void clickButtonElement(WebDriver driver, By elementdetail) {
		try {
			driver.findElement(elementdetail).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

/*
 * public static String getPriceFromBookDetailPage(WebDriver driver, By
 * getpricevalue) {
 * 
 * String getbookdetailpageprice = driver.findElement(getpricevalue).getText();
 * 
 * return getbookdetailpageprice; } 
 */
}