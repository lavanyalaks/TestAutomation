package com.amazon.pageobjects;

import org.openqa.selenium.By;

public interface SearchResultsPageObjects {
	
//	By firstsearchresult = By.xpath("//div[@data-index='0']]");
	
	
	//for price
	By firstresultprice = By.xpath("//span[@class='a-offscreen']");	
	//for click on searchresult
	By firstsearchresult = By.xpath("//img[@data-image-index='1']");


}
