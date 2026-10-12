package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void testValidLogin()
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("admin@yourstore.com");
		loginPage.enterPaswword("admin");
		loginPage.clickLogin();
		
		System.out.println("Title of the page is : "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
		
		ProductsPage page = new ProductsPage(driver);
		
		page.clickCatalogLink();
		page.clickProductsLink();
	
	}
	
	
}
