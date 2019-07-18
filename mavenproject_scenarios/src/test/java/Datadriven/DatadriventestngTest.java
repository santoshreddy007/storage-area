package Datadriven;

import org.testng.annotations.Test;

//import com.graphbuilder.struc.Stack;

import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DatadriventestngTest {
	WebDriver driver;
  @Test(dataProvider = "Authenitization")
  public void test(String susername, String spassword) {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(susername);
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys(spassword);
  }

  @DataProvider(name="Authenitization")
  public static Object[][] credentials() {
    return new Object[][] {
      { "mindSelenium@gmail.com", "test@3412" },
      { "abc13@gmail.com", "test@6789" },
      {"baby34@gmail.com","Test@9876"},
      {"san@1234@gmail.com","Test@08634578"}
    };	  
      
    }
  
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium softwares\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
  }

}
