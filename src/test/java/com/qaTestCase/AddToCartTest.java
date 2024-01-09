package com.qaTestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Pages.HomePage;
import com.qa.Pages.ProductInfoPage;

public class AddToCartTest {
	public WebDriver driver;
	public HomePage homepage;
	public ProductInfoPage productinfopage;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		homepage = new HomePage(driver);

	}

	@Test
	public void AddToCart() {
		productinfopage = homepage.clickOnproduct();
		productinfopage.addToCartButton();
		Assert.assertTrue(productinfopage.productAddedSuccess());

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
