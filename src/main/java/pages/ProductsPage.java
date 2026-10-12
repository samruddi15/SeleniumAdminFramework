package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	private By catalog = By.xpath("//a[@class='nav-link']/p[contains(text(),'Catalog')]");
	private By productlink  = By.xpath("//a[@class='nav-link']/p[contains(text(),'Products')]");
	private By firstProduct = By.xpath("//tbody/tr[1]/td[3]");
	
	public ProductsPage(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void clickCatalogLink()
	{
		wait.until(ExpectedConditions.elementToBeClickable(catalog)).click();
	}
	
	public void clickProductsLink()
	{
		wait.until(ExpectedConditions.elementToBeClickable(productlink)).click();
	}
	
	public String firstProductName()
	{
		return wait.until( ExpectedConditions.visibilityOfElementLocated(firstProduct) ).getText();
	}

	}
