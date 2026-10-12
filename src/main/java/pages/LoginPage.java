package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	private By usernameTextBox = By.id("Email");
	private By passwordTextBox = By.id("Password");
	private By loginButton = By.xpath("//button[@type='submit']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void enterUsername(String username)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(usernameTextBox));
		driver.findElement(usernameTextBox).clear();
		driver.findElement(usernameTextBox).sendKeys(username);
	}
	
	public void enterPaswword(String password)
	{
		
		driver.findElement(passwordTextBox).clear();
		driver.findElement(passwordTextBox).sendKeys(password);
	}
	
	public void clickLogin()
	{
		driver.findElement(loginButton).click();
		
	}
}
