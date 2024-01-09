package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public WebDriver driver;
	
	@FindBy(linkText = "MacBook")
	private WebElement productMacbook;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public ProductInfoPage clickOnproduct(){
		productMacbook.click();
		return new ProductInfoPage(driver);
	}

}
