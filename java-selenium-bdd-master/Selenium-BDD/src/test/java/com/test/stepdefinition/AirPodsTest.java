package com.test.stepdefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.selenium.AbstractPage;
import com.test.selenium.BasePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AirPodsTest extends AbstractPage {

	private static final Logger logger = LoggerFactory.getLogger(BasePage.class);

	@When("the user clicks on the AirPods tab")
	public void the_user_clicks_on_the_air_pods_tab() {
		logger.info("the user clicks on the AirPods tab");
		getAirPodsPage().clickOnAirPodsTab();
	}

	@Then("select AirPods second Generation")
	public void select_air_pods_second_generation() {
		logger.info("select AirPods second Generation");
		getAirPodsPage().clickOnAirPods2ndGenTab();
	}

	@Then("click on buy button")
	public void click_on_buy_button() {
		logger.info("click on buy button");
		getAirPodsPage().clickOnBuyButton();
	}

	@Then("click on Add To Bag button")
	public void click_on_add_to_bag_button() {
		logger.info("click on Add To Bag button");
		getAirPodsPage().clickOnAddToBagButton();
	}

	@Then("click on Checkout button")
	public void click_on_checkout_button() {
		logger.info("click on Checkout button");
		getAirPodsPage().clickOnCheckoutButton();
	}

	@Then("click on Continue As Guest")
	public void click_on_continue_as_guest() {
		logger.info("click on Continue As Guest");
		getAirPodsPage().clickOnGuestCheckoutButton();
	}
}
