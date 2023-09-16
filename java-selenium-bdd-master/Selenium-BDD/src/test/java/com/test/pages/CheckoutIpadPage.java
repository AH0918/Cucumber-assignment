package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.test.selenium.BasePage;

public class CheckoutIpadPage extends BasePage {

	public CheckoutIpadPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "[class='ac-ln-button']")
	private WebElement buyButton;

	@FindBy(xpath = "//span[text()='No engraving']")
	private WebElement noEngravingButton;

	@FindBy(xpath = "//span[@class='column large-12']/span[text()='No Apple Pencil']")
	private WebElement noApplePencil;

	@FindBy(xpath = "(//span[text()='Add Smart Keyboard Folio'])[1]")
	private WebElement keyboardType;

	@FindBy(xpath = "(//span[text()='Save'])[3]")
	private WebElement saveButton;

	@FindBy(xpath = "//span[text()='No trade-in']")
	private WebElement noTradeInButton;

	@FindBy(xpath = "//span[text()='Buy']")
	private WebElement clickOnBuyLink;

	@FindBy(css = "[id=\"applecareplus_noapplecare_label\"]")
	private WebElement noAppleCare;

	@FindBy(css = "[name='add-to-cart']")
	private WebElement addToCartButton;

	public void selectTheConfiguration(String displaySize, String color, String storage, String wifi)
			throws InterruptedException {
		String locator = "//span[text()='" + displaySize + "']";
		waitForElement(locator);
		waitAndClick(driver.findElement(By.xpath(locator)));

		String chooseColor = "//span[@class='form-label-small'][text()='" + color + "']";
		jsClick(driver.findElement(By.xpath(chooseColor)));

		scrollDown();
		String selectStorage = "//span[text()='" + storage + "']/parent::label";
		jsClick(driver.findElement(By.xpath(selectStorage)));

		scrollDown();
		String wifiOnly = "//span[@class='form-selector-title'][text()='" + wifi + "']";
		jsClick(driver.findElement(By.xpath(wifiOnly)));

		this.clickOnNotEngraving();
		this.clickOnNoApplePencil();
		this.selectKeyboardType();
		this.clickOnSave();
		this.selectNoTradeIn();
		this.clickOnBuy();
		this.selectnoAppleCare();
	}

	public void clickOnNotEngraving() throws InterruptedException {
		Thread.sleep(2000);
		waitForElementClickable(noEngravingButton);
		waitAndClick(noEngravingButton);
	}

	public void clickOnNoApplePencil() {
		waitForElementClickable(noApplePencil);
		jsClick(noApplePencil);
	}

	public void selectKeyboardType() throws InterruptedException {
		scrollIntoView(keyboardType);
		waitForElementClickable(keyboardType);
		jsClick(keyboardType);
	}

	public void clickOnSave() {
		waitForElementClickable(saveButton);
		waitAndClick(saveButton);
	}

	public void selectNoTradeIn() throws InterruptedException {
		Thread.sleep(2000);
		scrollIntoView(noTradeInButton);
		jsClick(noTradeInButton);
		Thread.sleep(2000);
	}

	public void clickOnBuy() throws InterruptedException {
		waitForElementClickable(clickOnBuyLink);
		waitAndClick(clickOnBuyLink);
		Thread.sleep(3000);
	}

	public void selectnoAppleCare() {
		// scrollIntoView(noAppleCare);
		jsClick(noAppleCare);
	}

	public void clickOnAddToBagButton() throws InterruptedException {
		Thread.sleep(3000);
		scrollIntoView(addToCartButton);
		jsClick(addToCartButton);
	}
}
