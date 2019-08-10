package ClassRoomAUG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class extendsRepository {
	public WebDriver Driver;

	@Test(priority = 1)
	public void verifylogin() throws InterruptedException {
		Repository.Login();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	}
	
		@Test(priority = 2)
		public void verifylogout() throws InterruptedException {
			Repository.logout();
			Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
  }
}
