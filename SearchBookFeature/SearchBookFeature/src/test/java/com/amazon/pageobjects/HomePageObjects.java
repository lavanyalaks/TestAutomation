package com.amazon.pageobjects;

import org.openqa.selenium.By;

public interface HomePageObjects {
	
	By searchbox = By.xpath("//input[@id='twotabsearchtextbox']");
	By searchsubmit = By.xpath("//*[contains(@id,'submit-text')]");
	
	

}
