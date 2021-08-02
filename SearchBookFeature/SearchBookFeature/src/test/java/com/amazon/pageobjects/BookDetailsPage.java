package com.amazon.pageobjects;

import org.openqa.selenium.By;

public interface BookDetailsPage {
	
	
	//productdetail page book price	
	By bookdetailspricevalue = By.xpath("//*[@id='newBuyBoxPrice']");
	
	//addtocart button click
	By addtocart = By.xpath("//input[@id='add-to-cart-button']");
	
	
	
	

}
