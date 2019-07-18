package selenium.mavenproject_scenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class HeadlesswithchromeTest extends SampleDemo{
	WebDriver driver;

	
  @Test(priority = 0)
  @Override
  public void login() throws Exception {
	  super.login();
  }
  @Test(priority = 1)
  @Override
  public void logout() throws Exception{
	  super.logout();
	  
  }
  
  @BeforeTest
  public void browser() {
	  super.browser();
	  
  }

}
