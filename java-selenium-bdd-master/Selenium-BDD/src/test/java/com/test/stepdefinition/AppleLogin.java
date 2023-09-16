package com.test.stepdefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.selenium.AbstractPage;
import com.test.selenium.BasePage;

import io.cucumber.java.en.Then;

public class AppleLogin extends AbstractPage {

	private static final Logger logger = LoggerFactory.getLogger(BasePage.class);

	@Then("enter valid apple userid {string} and password {string}")
	public void enter_valid_apple_userid_and_password(String userid, String password) throws InterruptedException {

		logger.info("enter valid apple userid '" + userid + "' and password " + password);
		getAppleSignInPage().loginValidUser(userid, password);
	}

}
