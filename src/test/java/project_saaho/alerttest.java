package project_saaho;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class alerttest {
	public WebDriver Driver;

	@Test
	public void alert() throws Exception {
		
		  Driver.findElement(By.name("username")).sendKeys("admin");
		  Thread.sleep(1000); 
		  Driver.findElement(By.name("password")).sendKeys("admi");
		  Thread.sleep(1000); 
		  Driver.findElement(By.name("submit")).click();
		  Thread.sleep(3000);
		  
		  Driver.switchTo().alert().accept(); Thread.sleep(3000);
		 

		Driver.findElement(By.name("username")).sendKeys("admin");
		Driver.findElement(By.name("password")).sendKeys("admin");
		Driver.findElement(By.name("submit")).click();
		Thread.sleep(4000);
	}

	@BeforeTest
	public void beforeTest() throws Exception {

		System.setProperty("webdriver.gecko.driver", "E:\\traning work space\\software\\geckodriver.exe");
		Driver = new FirefoxDriver();
		Driver.get("http://www.computechis.com/DemoSite");
		Thread.sleep(3000);
	}

	@AfterTest
	public void afterTest() {
	}

}
