package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.test.selenium.BasePage;

public class HomePodPage extends BasePage {

	public HomePodPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "[aria-label=\"TV and Home\"]")
	private WebElement tvAndHome;

	@FindBy(css = "[class=\"chapternav-item chapternav-item-homepod\"]")
	private WebElement homePod;

	@FindBy(xpath = "//button[@title=\"Add to Bag\"]")
	private WebElement addToBag;

	public void clickOnTVAndHomeTab() {
		waitForElementClickable(tvAndHome);
		waitAndClick(tvAndHome);
	}

	public void clickOnHomePod() {
		waitForElementClickable(homePod);
		waitAndClick(homePod);
	}

	public void chooseProductColor(String color) {
		String locator = "//span[@class=\"form-label-small\"]/following-sibling::span[text()='" + color + "']";
		waitForElement(locator);
		waitAndClick(driver.findElement(By.xpath(locator)));
	}

	public void clickOnAddToBagbutton() throws InterruptedException {
		Thread.sleep(3000);
		scrollIntoView(addToBag);
		jsClick(addToBag);
	}

}
