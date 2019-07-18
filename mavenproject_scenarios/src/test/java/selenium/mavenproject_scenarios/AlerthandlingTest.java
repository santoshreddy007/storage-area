package selenium.mavenproject_scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlerthandlingTest {

	    WebDriver driver;	
		String str;
		@Test(priority = 0)
		public void browser() {
			System.setProperty("webdriver.chrome.driver","E:\\selenium softwares\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com");
			driver.manage().window().maximize();
		}
		@Test(priority = 1)
		public void alert() throws Exception {
			Thread.sleep(100000);
			driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/button[1]")).click();
			str=driver.switchTo().alert().getText();
			System.out.println("str");
			driver.switchTo().alert().accept();
			//driver.switchTo().alert().dismiss();
		}
			
	
	  @AfterTest
	  public void afterTest() {
	  }
	
	}

