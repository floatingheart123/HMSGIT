package project_saaho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Informationcommands {
	public WebDriver driver;
  @Test
  public void google() throws Exception {
	  
	 String str = driver.findElement(By.linkText("Gmail")).getText();
	 System.out.println(str);
	 
	 String str1 = driver.findElement(By.id("hplogo")).getAttribute("title");
	 
	 System.out.println(str1);
	 
String str2 = driver.findElement(By.name("btnK")).getAttribute("value");
	 
	 System.out.println(str2);
	 }
  
  @BeforeTest
  public void beforeTest() throws Exception {

  
   System.setProperty("webdriver.gecko.driver", "E:\\traning work space\\software\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com"); 
		Thread.sleep(3000);
	  
  }

  
  @AfterTest
  public void afterTest() {
  }

}
