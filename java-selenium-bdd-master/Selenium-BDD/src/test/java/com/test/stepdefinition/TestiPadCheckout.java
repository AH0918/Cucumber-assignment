package com.test.stepdefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.selenium.AbstractPage;
import com.test.selenium.BasePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestiPadCheckout extends AbstractPage {

	private static final Logger logger = LoggerFactory.getLogger(BasePage.class);

	@When("The user searches for iPad {string} and clicked on the iPad tab")
	public void the_user_searches_for_i_pad_and_clicked_on_the_i_pad_tab(String respectiveTab)
			throws InterruptedException {

		logger.info("the user searches for " + respectiveTab + " and clicked on the product tab");
		getAppleHomePage().clickOnTheDesiredProductTab(respectiveTab);

		logger.info("the user clicks on the first iPad product in the search results");
		getAppleHomePage().theUserSearchesFor("iPad Pro");
	}

	@Then("Click on buy button")
	public void click_on_buy_button() {
		logger.info("Click on buy button");
		getAppleHomePage().clickOnBuyButton();

	}

	@Then("Choose product configuration of your product")
	public void choose_product_configuration_of_your_product() throws InterruptedException {

		logger.info("select the model screen size color, storage and Connectivity");
		getCheckoutIpadPage().selectTheConfiguration("11-inch display", "Space Gray", "128", "Wi-Fi");
	}

}
