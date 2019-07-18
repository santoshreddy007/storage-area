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

public class OhrmsfileuploadwithAutoitTest {
  WebDriver driver;
  private void TakesScreenshot(String str)throws Exception {
		// TODO Auto-generated method stub
	  DateFormat df=new SimpleDateFormat("yyyy_mmm_dd hh_mm_ss");
	  Date d=new Date(0);
	  String time=df.format(d);
	  System.out.println(time);
	  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		FileHandler.copy(f,new File(".\\Screenshot\\"+str+time+".png"));
	}


@Test(priority = 0)
  public void login() throws Exception{
	TakesScreenshot("login");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.className("button")).click();
}
@Test(priority = 2)
public void logout() throws Exception {
	TakesScreenshot("logout");
	driver.findElement(By.xpath("//a[@id='welcome']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='branding']/div[@id='welcome-menu']/ul/li[2]")).click();
	
}

@Test(priority=1)
	public void fileupload() throws Exception {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
	driver.findElement(By.id("btnAdd")).click();
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("bramaramba");
	driver.findElement(By.name("middleName")).sendKeys("basu");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("reddy");
	driver.findElement(By.id("employeeId")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	TakesScreenshot("fileupload");
}

@BeforeTest
public void browser() {
	  System.setProperty("webdriver,chrome,driver","E:\\selenium softwares\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
  }

 

}
