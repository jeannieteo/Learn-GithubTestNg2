package TestNgLearn;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class Grouptests {
	
	@Test(groups={"dropdown"})
	public void testDropdownContents() {
		
	    int v;
	    String[] dropdownContents =new String[3];
		dropdownContents[0]="Please select an option";
		dropdownContents[1]="Option 1";
		dropdownContents[2]="Option 2";
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\testdata\\msedgedriver.exe");
		System.out.println("the internet.herokuapp.com Dropdown test");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		//click on the dropdown
		driver.findElement(By.id("dropdown")).click();
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
	    //assign all the options in dropdown to the list
		List<WebElement> options = dropdown.findElements(By.tagName("option"));
	    System.out.println("There are " + options.size() + " options in the dropdown.");
	    //verify options are expected.
	    for(v=0; v < options.size();v++)	{
	    	System.out.println(options.get(v).getText());
	    	Assert.assertEquals(options.get(v).getText(),dropdownContents[v]);
	    }
	    driver.quit();
	}
	
	@Test(groups={"dropdown"})
	public void testDropdownSelection() {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\testdata\\msedgedriver.exe");
		System.out.println("the internet.herokuapp.com Dropdown test 2");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.findElement(By.id("dropdown")).click();
		WebElement option1 = driver.findElement(By.xpath("//*[@id='dropdown']/option[2]"));
		//*[@id="dropdown"]/option[2]
		option1.click();
		
		Assert.assertTrue(option1.isSelected());
		driver.quit();
	}
	
	
	
	
	
	@Test(groups={"hovers"})
	public void testhovers() {
		System.out.println("the internet.herokuapp.com hovers test");
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\testdata\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		WebElement hoverable = driver.findElement(By.cssSelector("#content > div > div:nth-child(3) > img"));
		new Actions(driver)
			.moveToElement(hoverable)
			.perform();
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5")).isDisplayed());
		driver.quit();
		
	}
	
	@Test(groups={"context_menu"})
	public void testcontext_menu() {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\testdata\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		System.out.println("the internet.herokuapp.com context_menu test");
		
		WebElement hotspot = driver.findElement(By.id("hot-spot"));
		new Actions(driver)
			.contextClick(hotspot)
			.perform();
		String alerttext = driver.switchTo().alert().getText();
		System.out.println("The alert text is: "+ alerttext);
		driver.switchTo().alert().accept();
		driver.quit();
		
	}

}
