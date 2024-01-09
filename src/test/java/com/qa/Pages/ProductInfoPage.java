package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInfoPage {
	public WebDriver driver;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement clickAddToCart;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;

	public ProductInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void addToCartButton() {
		clickAddToCart.click();
	}

	public boolean productAddedSuccess() {
		return successMessage.isDisplayed();
	}

}
