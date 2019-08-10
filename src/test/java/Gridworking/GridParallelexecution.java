package Gridworking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GridParallelexecution {
	
	
public WebDriver driver;
	
	@Test
	@org.testng.annotations.Parameters("browser")
	public void VerifyTitlepage(String browserName)
	{
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver","E:\\traning work space\\software\\geckodriver.exe" );
			  driver = new FirefoxDriver();
		}

		
	else if (browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","E:\\traning work space\\software\\chromedriver.exe" );
		  driver = new ChromeDriver();
			
		}
		
	else if (browserName.equalsIgnoreCase("IE")) 
	{
			System.setProperty("webdriver.IE.driver", "D:\\workspace\\lib\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
	}
	
	}
}