package TestNgLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	@Test
	public void Login_standard_user() throws Exception {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\testdata\\msedgedriver.exe");
		System.out.println("Login via standard_user.");
		WebDriver driver = new EdgeDriver();
	    driver.get("https://saucedemo.com/");
	    
	    WebElement Webelement1;
	    Webelement1 = driver.findElement(By.cssSelector("#user-name"));
	    Webelement1.sendKeys("standard_user");
	    
	    Webelement1 = driver.findElement(By.xpath("//*[@id='password']"));
	    Webelement1.sendKeys("secret_sauce");
	    
	    Webelement1 = driver.findElement(By.name("login-button"));
	    Webelement1.click();
	    
		try {
		//Asset fail if menu not displayed
		Assert.assertTrue(Webelement1.findElement(By.id("react-burger-menu-btn")).isDisplayed());
		} catch(Throwable t)
		{
			System.out.println(t);
		}
		driver.quit();
	}
	
	@Test
	public void Login_performance_glitch_user() {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\testdata\\msedgedriver.exe");
		System.out.println("Login via performance_glitch_user.");
		WebDriver driver = new EdgeDriver();
	    driver.get("https://saucedemo.com/");
	    
	    WebElement Webelement1;
	    Webelement1 = driver.findElement(By.cssSelector("#user-name"));
	    Webelement1.sendKeys("performance_glitch_user");
	    
	    Webelement1 = driver.findElement(By.xpath("//*[@id='password']"));
	    Webelement1.sendKeys("secret_sauce");
	    
	    Webelement1 = driver.findElement(By.name("login-button"));
	    Webelement1.click();
	    
		try {
		//Asset fail if menu not displayed
		Assert.assertTrue(Webelement1.findElement(By.id("react-burger-menu-btn")).isDisplayed());
		} catch(Throwable t)
		{
			System.out.println(t);
		}
		//throw new SkipException("Google functionality not supported.");
		driver.quit();
	}
	@Test(priority=1)
	public void Login_without_username() {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\testdata\\msedgedriver.exe");
		System.out.println("Login without username.");
		WebDriver driver = new EdgeDriver();
	    driver.get("https://saucedemo.com/");
	    
	    WebElement Webelement1;
	    //Webelement1 = driver.findElement(By.cssSelector("#user-name"));
	    //Webelement1.sendKeys("performance_glitch_user");
	    
	    Webelement1 = driver.findElement(By.xpath("//*[@id='password']"));
	    Webelement1.sendKeys("secret_sauce");
	    
	    Webelement1 = driver.findElement(By.name("login-button"));
	    Webelement1.click();
	    
		try {
		//Asset fail if error message not displayed equal
			Webelement1 = driver.findElement(By.className("error-button"));
			
			
		Assert.assertEquals("Epic sadface: Username is required", Webelement1.getText());
		} catch(Throwable t)
		{
			System.out.println(t);
		}
		driver.quit();
	}
	//@Test(priority=3)
	//public void Logout() {
	//	System.out.println("Logout.");

	//}
	//@Test(priority=2,dependsOnMethods={"Login"})
	//public void Navigate() {
	//	System.out.println("Navigate.");

	//}
}
