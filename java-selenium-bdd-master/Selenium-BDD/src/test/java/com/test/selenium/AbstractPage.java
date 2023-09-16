package com.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.pages.AirPodsPage;
import com.test.pages.AppleHomePage;
import com.test.pages.ApplePencilPage;
import com.test.pages.AppleSignInPage;
import com.test.pages.CheckoutIpadPage;
import com.test.pages.HomePodPage;
import com.test.pages.SearchPage;

public class AbstractPage {

	protected static WebDriver driver;

	protected static AppleHomePage appleHomePage;
	protected static AppleSignInPage appleSignInPage;
	protected static CheckoutIpadPage checkoutIpadPage;
	protected static SearchPage searchPage;
	protected static ApplePencilPage applePencilPage;
	protected static AirPodsPage airPodsPage;
	protected static HomePodPage homePodPage;

	protected AppleHomePage getAppleHomePage() {
		if (appleHomePage == null) {
			appleHomePage = PageFactory.initElements(driver, AppleHomePage.class);
		}
		return appleHomePage;
	}

	protected AppleSignInPage getAppleSignInPage() {
		if (appleSignInPage == null) {
			appleSignInPage = PageFactory.initElements(driver, AppleSignInPage.class);
		}
		return appleSignInPage;
	}

	protected CheckoutIpadPage getCheckoutIpadPage() {
		if (checkoutIpadPage == null) {
			checkoutIpadPage = PageFactory.initElements(driver, CheckoutIpadPage.class);
		}
		return checkoutIpadPage;
	}

	protected SearchPage getSearchPage() {
		if (searchPage == null) {
			searchPage = PageFactory.initElements(driver, SearchPage.class);
		}
		return searchPage;
	}

	protected ApplePencilPage getApplePencilPage() {
		if (applePencilPage == null) {
			applePencilPage = PageFactory.initElements(driver, ApplePencilPage.class);
		}
		return applePencilPage;
	}

	protected AirPodsPage getAirPodsPage() {
		if (airPodsPage == null) {
			airPodsPage = PageFactory.initElements(driver, AirPodsPage.class);
		}
		return airPodsPage;
	}

	protected HomePodPage getHomePodPage() {
		if (homePodPage == null) {
			homePodPage = PageFactory.initElements(driver, HomePodPage.class);
		}
		return homePodPage;
	}

}
