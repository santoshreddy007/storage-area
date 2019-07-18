package selenium.mavenproject_scenarios;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleDemo {
	WebDriver driver;
	public void TakesScreenshot(String str)throws Exception{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		FileHandler.copy(f,new File("E:\\selenium_worksace\\mavenproject_scenarios\\Screenshot"+str+".png"));
	//Runtime.getRuntime().exec("E:\\selenium_worksace\\mavenproject_scenarios\\src\\test\\java\\selenium\\mavenproject_scenarios\\flieupload.exe");
	}
 @Test(priority=0)
  public void login()throws Exception {
	  TakesScreenshot("login");
	  Thread.sleep(2000);
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
  }
  @Test(priority=1)
  public void logout()throws Exception{
	  TakesScreenshot("logout");
	  driver.findElement(By.linkText("Welcome Admin")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Logout")).click();
  }
  
  @BeforeTest
  public void browser() {
   System.setProperty("webdriver.chrome.driver","E:\\selenium softwares\\chromedriver.exe");
   ChromeOptions options=new ChromeOptions();
   options.addArguments("1300,700");
   options.addArguments("headless");
   driver=new ChromeDriver(options);
   driver.get("https://opensource-demo.orangehrmlive.com/");
   driver.manage().window().maximize();
  }

  

}
