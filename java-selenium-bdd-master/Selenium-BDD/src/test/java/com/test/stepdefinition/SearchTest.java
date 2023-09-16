package com.test.stepdefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.selenium.AbstractPage;
import com.test.selenium.BasePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchTest extends AbstractPage {

	private static final Logger logger = LoggerFactory.getLogger(BasePage.class);

	@When("Click on the search icon and locate a store")
	public void click_on_the_search_icon_and_locate_a_store() throws InterruptedException {

		logger.info("click on the search icon on the menu bar");
		getSearchPage().clickOnSearchIcon();

		logger.info("Click on the search icon and locate a store");
		getSearchPage().clickOnTheSearchrelatedTab("Find a Store");

		logger.info("enter pincode to find the store");
		getSearchPage().searchInputbox("11001");

		logger.info("select the first store from list");
		getSearchPage().clickOnFisrtStore();

		logger.info("click on reserve a shopping");
		getSearchPage().clickOnReserveShopping();

		logger.info("choose iphone from the option");
		getSearchPage().clickOnIphone();

		logger.info("click on continue button");
		getSearchPage().clickOnContinueButton();

		logger.info("choose preferred location");
		getSearchPage().chooseLocation();
	}

	@Then("Select state and store")
	public void select_state_and_store() {
		logger.info("select the state and store");
		getSearchPage().selectState(1);
		getSearchPage().selectStore("0");
	}

	@Then("Click on choose this store")
	public void click_on_choose_this_store() {
		getSearchPage().clickOnChooseThisStore();

	}
}
