package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.test.selenium.BasePage;

public class AppleSignInPage extends BasePage {

	public AppleSignInPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='account_name_text_field']")
	private WebElement usernameInputbox;

	@FindBy(css = "[id='sign-in']")
	private WebElement nextArrow;

	@FindBy(css = "[id='password_text_field']")
	private WebElement passwordinputbox;

	public void loginValidUser(String user, String password) throws InterruptedException {
		//Thread.sleep(30000000000000000L);
		// jsClick(usernameInputbox);
		inputText(usernameInputbox, user);
		jsClick(nextArrow);
		jsClick(passwordinputbox);
		inputText(passwordinputbox, password);
	}

}
