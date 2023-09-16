package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.test.selenium.BasePage;

public class AirPodsPage extends BasePage {

	public AirPodsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "[aria-label='AirPods']")
	private WebElement airPodsTab;

	@FindBy(css = "[class=\"chapternav-item chapternav-item-airpods-2gen\"]")
	private WebElement airPods2NdGen;

	@FindBy(xpath = "//a[text()='Buy ']")
	private WebElement clickOnBuy;

	@FindBy(css = "[id=\"add-to-cart\"]")
	private WebElement addToBag;

	@FindBy(css = "[id=\"shoppingCart.actions.checkout\"]")
	private WebElement checkout;

	@FindBy(css = "[id=\"signIn.guestLogin.guestLogin\"]")
	private WebElement guestCheckout;

	public void clickOnAirPodsTab() {
		waitForElementClickable(airPodsTab);
		waitAndClick(airPodsTab);
	}

	public void clickOnAirPods2ndGenTab() {
		waitForElementClickable(airPods2NdGen);
		waitAndClick(airPods2NdGen);
	}

	public void clickOnBuyButton() {
		waitForElementClickable(clickOnBuy);
		waitAndClick(clickOnBuy);
	}

	public void clickOnAddToBagButton() {
		scrollIntoView(addToBag);
		waitAndClick(addToBag);
	}

	public void clickOnCheckoutButton() {
		scrollIntoView(checkout);
		waitAndClick(checkout);
	}

	public void clickOnGuestCheckoutButton() {
		waitAndClick(guestCheckout);
	}

}
