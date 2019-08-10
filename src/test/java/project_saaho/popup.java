package project_saaho;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class popup {
	public WebDriver Driver;
	
	@Test(priority = 1)
	public void login() throws Exception {
		
		Driver.findElement(By.name("username")).sendKeys("admin");
		Driver.findElement(By.name("password")).sendKeys("admin");
		Driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
	}
	
  @Test(priority = 2)
  public void feedback() throws Exception {
	  
	  Driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[3]/a")).click();
	  String parent = Driver.getWindowHandle();
	  for (String child : Driver.getWindowHandles()) {
	  Driver.switchTo().window(child);
	  }
	  Driver.findElement(By.id("name")).sendKeys("feedback");
	  Driver.findElement(By.id("email")).sendKeys("email@gmail.com");
	  new Select(Driver.findElement(By.id("car"))).selectByVisibleText("Mercedes");
	  Driver.findElement(By.name("radio")).click();
	  Driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[5]/label/input")).click();
	  Driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[6]/input")).sendKeys("C:\\Users\\laddy\\Desktop\\error\\error 1.png");
	 // Runtime.getRuntime().exec("C:\\Users\\laddy\\Desktop\\autoit\\new.exe");
	  Thread.sleep(4000);
	  Driver.findElement(By.id("message")).sendKeys("file uploaded");
	  Driver.findElement(By.xpath("/html/body/div[2]/div/div/form/p/button[1]")).click();
	  Driver.close();
	  
	  
	  Driver.switchTo().window(parent);
	  Driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[1]/div")).click();
	  Driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[1]/ul/li[3]/a")).click();
	  
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
