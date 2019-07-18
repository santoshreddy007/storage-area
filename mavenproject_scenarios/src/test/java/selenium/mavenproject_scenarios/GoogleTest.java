package selenium.mavenproject_scenarios;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class GoogleTest {
	WebDriver driver;
  @Test(priority = 0)
  public void getattribute() {
	List<WebElement> dropdown=new Select(driver.findElement(By.name("birthday_day"))).getOptions();
	for(int i=0;i<dropdown.size();i++) {
		System.out.println(i);
		List<WebElement> dropdown1=new Select(driver.findElement(By.id("month"))).getOptions();
		for(int j=0;j<dropdown1.size();j++) {
			System.out.println(j);
		}
	}
  }
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium softwares\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	 
  }

}
