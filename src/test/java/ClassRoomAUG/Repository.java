package ClassRoomAUG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Repository {
	public static WebDriver driver;
	
  @Test
  public static void Login() {
	  driver.findElement(Locators.username1).sendKeys(TestData.username3);
	  driver.findElement(Locators.password2).sendKeys(TestData.password4);
	  driver.findElement(Locators.submit).click();
  }
  @Test
  public static void logout() {
  
	  driver.findElement(Locators.logout).click();
  }
	  
	  @BeforeTest
  public void OpenURL() throws Exception {
	  
	  System.setProperty("webdriver.gecko.driver", "E:\\traning work space\\software\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(TestData.url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
