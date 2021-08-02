package com.amazon.applicationpages;

import org.openqa.selenium.WebDriver;
import com.amazon.pageobjects.HomePageObjects;

public class AmazonHomePage implements HomePageObjects {
	WebDriver driver;
	
public AmazonHomePage(WebDriver driver) {
	this.driver=driver;
}
	
	public void searchBook() {

		driver.findElement(searchbox).sendKeys("qa testing for beginners");
		driver.findElement(searchsubmit).click();
		
	}
	
	

}
