package selenium.mavenproject_scenarios;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SbialerthandlingTest {
	WebDriver driver;
  @Test
  public void login() throws Exception {
	  driver.findElement(By.className("classicTxt")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
	  driver.findElement(By.name("userName")).sendKeys("bramaramab");
	  driver.findElement(By.name("password")).sendKeys("0856789");
	  
  }
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium softwares\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.onlinesbi.com/");
	  driver.manage().window().maximize();
	  
  }

}
