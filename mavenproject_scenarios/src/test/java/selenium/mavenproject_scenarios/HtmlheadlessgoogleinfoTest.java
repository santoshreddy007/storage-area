package selenium.mavenproject_scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HtmlheadlessgoogleinfoTest<webElement> {
	WebDriver driver;
	@Test(priority = 1)
	public void getattribute() {
		String str3=driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnI']")).getAttribute("value");
		System.out.println(str3);
		List<WebElement>str4= driver.findElements(By.tagName("input"));
		System.out.println(str4);
	List<WebElement>str5=driver.findElements(By.tagName("a"));
	System.out.println(str5);
	List<WebElement>str6=driver.findElements(By.tagName("div"));
	System.out.println(str6);
	}
  @Test(priority = 0)
  public void getTest() {
	  String str=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).getText();
	 System.out.println(str);
	 String str1=driver.findElement(By.className("gb_d")).getText();
	 System.out.println(str1);
	String str2=driver.findElement(By.linkText("Gmail")).getText();
	System.out.println(str2);
	  
  }
  @BeforeTest
  public void browser()
  {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium softwares\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
  }
}
