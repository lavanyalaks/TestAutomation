package com.amazon.testscripts;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class InitiateTest {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("In Before test method");

		System.setProperty("webdriver.chrome.driver", "C:\\Lavanya_Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//System.out.println("Lavanya: Chrome Driver is initiated");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The actual title displayed is:" + title);
		// validating for title
		if (title.contains("Amazon.com")) {
			System.out.println("I am on Amazon application");
		} else {
			System.out.println("I am not on Amazon application");
		}
	}
	
	

	@AfterTest
		public void tearDown() {
		driver.close();
		driver.quit();
	}
	}

