package com.test.stepdefinition;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.selenium.AbstractPage;
import com.test.selenium.BasePage;
import com.test.selenium.Configuration;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuestCheckout extends AbstractPage {

	private static final Logger logger = LoggerFactory.getLogger(BasePage.class);

	@Given("The user is on the Apple website homepage")
	public void the_user_is_on_the_apple_website_homepage() throws Exception {
		String url = Configuration.getConfig("AppleURL");

		logger.info("the_user_is_on_the_e_commerce_website_homepage");
		driver.navigate().to(url);
	}

	@When("The user searches for {string} and clicked on the product tab")
	public void the_user_searches_for_and_clicked_on_the_product_tab(String respectiveTab) throws InterruptedException {
		logger.info("the user searches for " + respectiveTab + " and clicked on the product tab");
		getAppleHomePage().clickOnTheDesiredProductTab(respectiveTab);

		logger.info("the user clicks on the first iPhone product in the search results iPhone 14");
		getAppleHomePage().theUserSearchesFor("iPhone 14");

//		logger.info("user select the colour deep-purple");
//		getAppleHomePage().selectTheProductColour("deep-purple");

//		logger.info("user clicked on buy button");
//		getAppleHomePage().clickOnBuyButton();
		logger.info("select the model");
		getAppleHomePage().selectTheModel();

		logger.info("select the color");
		getAppleHomePage().selectColour("Blue");

		logger.info("user choose the storage 128");
		getAppleHomePage().selectTheStorage("128");
	}

	@Then("Clicked on No trade button")
	public void clicked_on_no_trade_button() {
		logger.info("clicked on No trade button");
		getAppleHomePage().clickOnNoTradeInButton();
	}

	@Then("User selected the payment option:{string}")
	public void user_selected_the_payment_option(String paymentPartner) throws InterruptedException {
		logger.info("user selected the payment option:" + paymentPartner);
		getAppleHomePage().selectPaymentOption(paymentPartner);

		logger.info("user choosen payment carrier AT&T");
		getAppleHomePage().chooseAPaymentCarrier("AT&T");

		logger.info("choosen apple care coverage");
		getAppleHomePage().selectAppleCareCoverage();

		logger.info("selected coverage type");
		getAppleHomePage().selectCoverageType();
	}

	@Then("selected coverage type")
	public void selected_coverage_type() {
		logger.info("selected coverage type");
		getAppleHomePage().selectCoverageType();
	}

	@Then("Clicked on Add to bag button")
	public void clicked_on_add_to_bag_button() throws InterruptedException {
		logger.info("clicked on Add to bag button");
		getAppleHomePage().clickOnAddToBagButton();
	}

	@Then("User verify the selected color {string}")
	public void user_verify_the_selected_color(String color) {
		logger.info("user verify the selected colour is " + color);
		Assert.assertTrue(getAppleHomePage().verifyChoosenColour().contains(color));
	}

	@Then("Click on review bag button")
	public void click_on_review_bag_button() {
		logger.info("click on review bag button");
		getAppleHomePage().clickOnReviewBag();
	}

	@Then("The user proceeds to checkout")
	public void the_user_proceeds_to_checkout() {
		logger.info("the user proceeds to checkout");
		getAppleHomePage().clickOnCheckoutButton();
	}

	@Then("The user selects as Guest User")
	public void the_user_selects_as_guest_user() {
		logger.info("the user selects as Guest User");
		getAppleHomePage().proceedAsGuestUser();
	}

	@Then("The user enters their shipping information and enter pincode {string}")
	public void the_user_enters_their_shipping_information_and_enter_pincode(String pincode)
			throws InterruptedException {

		logger.info("the user enters their shipping information and enter pincode {string}" + pincode);
		getAppleHomePage().clickOnLikeToDelivered();

		getAppleHomePage().clickOnContinueShippingAddressButton();

		logger.info("Enter firstName : {string} and lastName {string}");
		getAppleHomePage().enterFirstnameAndLastname("Global", "tester");

		logger.info("enter street address {string} and landmark address {string}");
		getAppleHomePage().enterStreetAddressAndLandmark("Chicago", "testing");

		logger.info("enter email address {string}  and phone number {string} ");
		getAppleHomePage().enterEmailAndPhone("globaltester999@gmail.com", "(053) 423-2241");
	}

	@Then("click on continue payment button")
	public void click_on_continue_payment_button() {
		logger.info("click on continue payment button");
		getAppleHomePage().clickOnContinuePaymentButton();
	}

	@Then("Verify added product into the cart page is {string} and the color is {string}")
	public void verify_added_product_into_the_cart_page_is_and_the_color_is(String productName, String color) {
		logger.info("verify added product into the cart page is :'" + productName + "' and the colour :" + color);
		Assert.assertTrue(getAppleHomePage().verifyAddedProductAndColour().contains(productName));
		Assert.assertTrue(getAppleHomePage().verifyAddedProductAndColour().contains(color));
	}

	@Then("Click on remove button")
	public void click_on_remove_button() {
		logger.info("click on remove button");
		getAppleHomePage().clickOnproductRemoveButton();
	}

	@Then("Verify that product is removed")
	public void verify_that_product_is_removed() throws InterruptedException {
		logger.info("verify that product is removed and cart is empty");
		Assert.assertTrue(getAppleHomePage().verifyCartIsEmpty().contains("Your bag is empty"));

	}

}