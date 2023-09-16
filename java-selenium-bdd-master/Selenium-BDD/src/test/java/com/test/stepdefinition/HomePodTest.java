package com.test.stepdefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.selenium.AbstractPage;
import com.test.selenium.BasePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePodTest extends AbstractPage {

	private static final Logger logger = LoggerFactory.getLogger(BasePage.class);

	@When("the user clicks on the TV and Home tab")
	public void the_user_clicks_on_the_tv_and_home_tab() {
		logger.info("the user clicks on the TV and Home tab");
		getHomePodPage().clickOnTVAndHomeTab();
	}

	@Then("select HomePod from the options")
	public void select_home_pod_from_the_options() {
		logger.info("select HomePod from the options");
		getHomePodPage().clickOnHomePod();
	}

	@Then("select color")
	public void select_color() {
		logger.info("select color");
		getHomePodPage().chooseProductColor("Midnight");
	}

	@Then("scroll and click on Add To Bag button")
	public void scroll_and_click_on_add_to_bag_button() throws InterruptedException {
		logger.info("scroll and click on Add To Bag button");
		getHomePodPage().clickOnAddToBagbutton();
	}
}
