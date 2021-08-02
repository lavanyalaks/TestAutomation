package com.amazon.testscripts;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.applicationpages.AmazonAddToCartPage;
import com.amazon.applicationpages.AmazonBookDetailsPage;
import com.amazon.applicationpages.AmazonHomePage;
import com.amazon.applicationpages.AmazonSearchResultsPage;
import com.amazon.commonmethods.CommonMethods;
import com.amazon.pageobjects.AddToCartPageObjects;
import com.amazon.pageobjects.BookDetailsPage;
import com.amazon.pageobjects.SearchResultsPageObjects;

public class SearchBookTestScript extends InitiateTest
		implements BookDetailsPage, SearchResultsPageObjects, AddToCartPageObjects {

	@Test(priority = 0)
	public void searchTest() throws InterruptedException {

		AmazonHomePage amazonhomepage = new AmazonHomePage(driver);
		amazonhomepage.searchBook();

		// step1::Result page test
		AmazonSearchResultsPage amazonsearchresultspage = new AmazonSearchResultsPage(driver);
		
		// Step 2:: Result page tests: get price and image click
		String searchresultpricevalue = amazonsearchresultspage.getSearchResultBookPrice();

		amazonsearchresultspage.searchResultClick();

		// step 3: PDP page test
		AmazonBookDetailsPage amazonbookdetailspage = new AmazonBookDetailsPage(driver);
		String bookdetailpagepricevalue = amazonbookdetailspage.getPriceFromBookDetailPage();
		// CommonMethods.getPriceFromBookDetailPage(driver, By bookdetailspricevalue)

		// price assertion: result page and pdp page
		CommonMethods.priceassert(searchresultpricevalue, bookdetailpagepricevalue);

		// click addtocart button
		CommonMethods.clickButtonElement(driver, addtocart);
		
		AmazonAddToCartPage amazonaddtocart = new AmazonAddToCartPage(driver);
		String addtocartpageprice = amazonaddtocart.getPriceFromaddtocartPage();

		// price assertion: result page and cart page
		CommonMethods.priceassert(searchresultpricevalue, addtocartpageprice);
        //click on proceed to checkout button
		CommonMethods.clickButtonElement(driver, proceedtocheckoutbutton);

	}

}
