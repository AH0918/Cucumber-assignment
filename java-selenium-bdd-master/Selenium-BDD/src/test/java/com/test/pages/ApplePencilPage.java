package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.test.selenium.BasePage;

public class ApplePencilPage extends BasePage {

	public ApplePencilPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "[class='chapternav-item chapternav-item-apple-pencil']")
	private WebElement applePencilTab;

	@FindBy(xpath = "//a[text()='Shop ']")
	private WebElement shopButton;

	@FindBy(xpath = "//span[text()='Apple Pencil (2nd generation)']/parent::a")
	private WebElement buyTwoGenPencil;

	@FindBy(css = "[id=\"add-to-cart\"]")
	private WebElement addToCartButton;

	@FindBy(css = "[id='shoppingCart.actions.checkout']")
	private WebElement checkoutButton;

	@FindBy(xpath = "//span[text()='Express Delivery']")
	private WebElement expressDelivery;

	public void clickOnApplePencilTab() {
		waitForElementClickable(applePencilTab);
		waitAndClick(applePencilTab);

	}

	public void clickOnShopButton() {
		jsClick(shopButton);
	}

	public void selectSecondGenPencil() {
		waitForElementClickable(buyTwoGenPencil);
		waitAndClick(buyTwoGenPencil);
	}

	public void clickOnAddToCartButton() {
		scrollIntoView(addToCartButton);
		waitAndClick(addToCartButton);
	}

	public void clickOnCheckoutButton() {
		scrollIntoView(checkoutButton);
		waitAndClick(checkoutButton);

	}

	public void clickOnExpressDelivery() {
		waitForElementClickable(expressDelivery);
		waitAndClick(expressDelivery);
	}

}
