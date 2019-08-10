package project_saaho;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Azax {
	public WebDriver driver;
	
	
  @Test
  public void Googlesearch() throws Exception {
	  if (driver.findElement(By.xpath("//span[@id='spclearDate']")).isEnabled()) {
			
			System.out.println("Its not a bug because particular field is not displaying");

		} else {
			System.out.println("Application having bug");


		}
	}
			
		
		  
		  
		
	
	  
  
  @BeforeTest
  public void openurl() throws Exception {
	  
	  System.setProperty("webdriver.gecko.driver","E:\\traning work space\\software\\geckodriver.exe" );
	    driver = new FirefoxDriver();
	    driver.get("http://www.spicejet.com");
	    Thread.sleep(3000);
	    		
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
