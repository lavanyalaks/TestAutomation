package com.amazon.pageobjects;

import org.openqa.selenium.By;

public interface AddToCartPageObjects {
	//get price from addtocart page  //*[@id="newBuyBoxPrice"]    and //div[@id='hlb-subcart']/div/span/span[2]
	//	By getaddtocartprice = By.xpath("//*[@id=\'newBuyBoxPrice\']");
		By getaddtocartprice = By.xpath("//div[@id='hlb-subcart']/div/span/span[2]");
		
		
		
		
		//click on proceedtocheckout button click    //*[@id='hlb-ptc-btn-native']
		By proceedtocheckoutbutton = By.xpath("//*[@id='hlb-ptc-btn-native']");

}
