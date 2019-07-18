package selenium.mavenproject_scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class OhrmsfileuploadwithAutoitTest2 {
  WebDriver driver;
  private void TakesScreenshot(String str)throws Exception {
		
	  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		FileHandler.copy(f,new File("E:\\selenium_worksace\\mavenproject_scenarios\\Screenshot"+str+".png"));
	}


@Test(priority = 0)
  public void login() throws Exception{
	TakesScreenshot("login");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.className("button")).click();
	
}
@Test(priority = 2)
public void fileupload1() throws Exception{
Thread.sleep(20000);
driver.findElement(By.linkText("PIM")).click();
driver.findElement(By.xpath("//input[@id='btnAdd'][@value='Add']")).click();
driver.findElement(By.xpath("//input[@id='firstName'][@class='formInputText']")).sendKeys("bramaramba");
driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("basu");
driver.findElement(By.xpath("//input[@id='employeeId'][@class='formInputText valid']")).sendKeys("086492");
driver.findElement(By.xpath("//input[@id='photofile']")).click();
Thread.sleep(3000);
Runtime.getRuntime().exec("E:\\selenium_worksace\\mavenproject_scenarios\\src\\test\\java\\selenium\\mavenproject_scenarios\\flieupload.exe");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='btnSave']")).click();
TakesScreenshot("fileupload");
}
@Test(priority = 1)
public void logout() throws Exception{
	Thread.sleep(2000);
	driver.findElement(By.linkText("Welcome Admin")).click();
	 
	  driver.findElement(By.linkText("Logout")).click();
	
}

@BeforeTest
public void browser() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium softwares\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com");
	  driver.manage().window().maximize();
 
}
}
