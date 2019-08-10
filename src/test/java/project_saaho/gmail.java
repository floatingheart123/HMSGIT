package project_saaho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gmail {
	public WebDriver driver;
  @Test
  public void login() throws Exception {
	  
	  driver.findElement(By.id("identifierId")).sendKeys("laddugopu1995@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Laddu@1995");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		Thread.sleep(3000);
	  
  }
  @BeforeTest
	 
	  public void openurl() throws Exception {
		  System.setProperty("webdriver.gecko.driver", "E:\\traning work space\\software\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get("http://gmail.com"); 
			Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
  }

}
