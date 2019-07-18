package selenium.mavenproject_scenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class KeyToardactionsOHRMSest {
WebDriver driver;
  @Test
  public void login(){
	  driver.findElement(By.xpath("//span[@class='form-hint'][contains(text(),'Username')]")).sendKeys("username");
	  driver.findElement(By.id("txtPassword")).sendKeys("passwoed");
	  driver.findElement(By.className("txtPassword")).click();
  }
  @BeforeTest
  public void browser(){
	  System.setProperty("webdriver.chrome.driver","E:\\selenium softwares\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  
  }

}