package com.test.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.selenium.BasePage;

public class SearchPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement element;

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "[id='globalnav-menubutton-link-search']")
	private WebElement searchIcon;

	@FindBy(css = "[placeholder=\"Search by location, ZIP, or store name\"]")
	private WebElement searchInputbox;

	@FindBy(xpath = "//div[@class=\"search-results-list-grid  \"]/div")
	private WebElement firstStore;

	@FindBy(xpath = "(//span[text()='Reserve a shopping session'])[1]")
	private WebElement reserveShopping;

	@FindBy(xpath = "//input[@value=\"iPhone\"]/parent::li")
	private WebElement selectIphone;

	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueButton;

	@FindBy(css = "[class=\"location-select-text-wrapper\"]")
	private WebElement chooseLocation;

	@FindBy(css = "[id='select-state'")
	private WebElement selectState;

	@FindBy(css = "[id='select-store']")
	private WebElement selectStore;

	@FindBy(css = "[name='location-confirm']")
	private WebElement chooseThisStore;

	public void clickOnSearchIcon() {
		waitForElementClickable(searchIcon);
		waitAndClick(searchIcon);
	}

	public void clickOnTheSearchrelatedTab(String text) {
		String locator = "//span[text()='" + text + "']";
		waitForElement(locator);
		waitAndClick(driver.findElement(By.xpath(locator)));

	}

	public void searchInputbox(String pincode) throws InterruptedException {
		stopPageLoading();
		waitForElementClickable(searchInputbox);
		waitAndClick(searchInputbox);
		inputText(searchInputbox, pincode);

		By elementLocator = By.xpath("//span[text()='Floral Park, NY, United States']");
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
		waitAndClick(element);
	}

	public void clickOnFisrtStore() {
		waitForElementClickable(firstStore);
		waitAndClick(firstStore);
	}

	public void clickOnReserveShopping() {
		waitForElementClickable(reserveShopping);
		waitAndClick(reserveShopping);
	}

	public void clickOnIphone() {
		waitForElementClickable(selectIphone);
		waitAndClick(selectIphone);
	}

	public void clickOnContinueButton() {
		waitForElementClickable(continueButton);
		waitAndClick(continueButton);
	}

	public void chooseLocation() {
		waitForElementVisible(chooseLocation);
		scrollIntoView(chooseLocation);
		waitAndClick(chooseLocation);
	}

	public void selectState(int value) {
		selectDropDownByIndex(selectState, value);
	}

	public void selectStore(String value) {
		selectDropDownByValue(selectStore, value);
	}

	public void clickOnChooseThisStore() {
		waitForElementClickable(chooseThisStore);
		waitAndClick(chooseThisStore);
	}
}
