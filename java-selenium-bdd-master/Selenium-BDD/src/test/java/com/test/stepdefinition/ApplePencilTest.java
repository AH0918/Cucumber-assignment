package com.test.stepdefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.selenium.AbstractPage;
import com.test.selenium.BasePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplePencilTest extends AbstractPage {

	private static final Logger logger = LoggerFactory.getLogger(BasePage.class);

	@When("The user searches for iPad {string} and click on the Apple pencil tab")
	public void the_user_searches_for_i_pad_and_click_on_the_apple_pencil_tab(String string)
			throws InterruptedException {
		logger.info("the user searches for " + string + " and clicked on the product tab");
		getAppleHomePage().clickOnTheDesiredProductTab(string);

		logger.info("the user searches for ipad and clicked on Apple pencil tab.");
		getApplePencilPage().clickOnApplePencilTab();
	}

	@Then("Click on shop button")
	public void click_on_shop_button() {
		getApplePencilPage().clickOnShopButton();
	}

	@Then("Click on Apple Pencil secondGen Buy button and click on add to bag button")
	public void click_on_apple_pencil_second_gen_buy_button_and_click_on_add_to_bag_button()
			throws InterruptedException {
		logger.info("select the 2nd gen Apple Pencil");
		getApplePencilPage().selectSecondGenPencil();

	}

	@Then("click on Add to bag button")
	public void click_on_add_to_bag_button() {
		getApplePencilPage().clickOnAddToCartButton();
	}

	@Then("Click on checkout button")
	public void click_on_checkout_button() {
		logger.info("click on checkout button");
		getApplePencilPage().clickOnCheckoutButton();

	}

	@Then("The user enters the shipping information and enter pincode {string}")
	public void the_user_enters_the_shipping_information_and_enter_pincode(String string) throws InterruptedException {
		logger.info("the user enters their shipping information and enter pincode {string}" + string);
		getAppleHomePage().clickOnLikeToDelivered();
		//getAppleHomePage().enterValidZipcode(string);
		//getAppleHomePage().clickOnApply();

		logger.info("click on express delivery");
		//getApplePencilPage().clickOnExpressDelivery();

		logger.info("click On Continue Shipping Address Button");
		getAppleHomePage().clickOnContinueShippingAddressButton();

		logger.info("Enter firstName : {string} and lastName {string}");
		getAppleHomePage().enterFirstnameAndLastname("Global", "tester");

		logger.info("enter street address {string} and landmark address {string}");
		getAppleHomePage().enterStreetAddressAndLandmark("Chicago", "testing");

		logger.info("enter email address {string}  and phone number {string} ");
		getAppleHomePage().enterEmailAndPhone("globaltester999@gmail.com", "(053) 423-2241");

	}

}
