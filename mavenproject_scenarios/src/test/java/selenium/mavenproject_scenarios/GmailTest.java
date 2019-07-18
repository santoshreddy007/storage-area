package selenium.mavenproject_scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GmailTest {
	WebDriver driver;
	@Test(priority = 0)
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = 1)
    public void login() throws Exception{

	driver.findElement(By.name("identifier")).sendKeys("venna.bramaramba2012@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("08649257160");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	driver.findElement(By.className("gb_xa gbii")).click();
	driver.findElement(By.linkText("Sign out")).click();
}
}