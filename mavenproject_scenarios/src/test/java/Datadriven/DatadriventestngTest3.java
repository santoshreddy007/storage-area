package Datadriven;

import org.testng.annotations.Test;

import com.graphbuilder.struc.Stack;

import org.testng.annotations.DataProvider;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DatadriventestngTest3 {
	private static boolean condition1;
	private static boolean condition2;
	private static boolean condition3;
	private static boolean condition4;
	WebDriver driver;
  @Test(dataProvider = "Authenitization")
  public void test(String susername, String spassword) {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(susername);
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys(spassword);
	  driver.findElement(By.id("logoutMenu")).click();
	  
  }
  

  @DataProvider(name="Authenitization")
  public static Object[][] credentials() {
    return new Object[][] {
    	{"babyreddyvenna@gmail.com","08649257160"},
      { "mindSelenium@gmail.com", "test@3412" },
       {"baby34@gmail.com","Test@9876"},
      {"san@1234@gmail.com","Test@08634578"}
    };
    if(condition1) {
    	System.out.println("babyreddyvenna@gmail.com");
    	System.out.println("08649251760");
    	
    }
    else if(condition2){
    	System.out.println("san@1234@gmail.com");
    	System.out.println("Test@08634578");
    }
    else if(condition3) {
    	System.out.println("baby34@gmail.com");
    	System.out.println("Test@9876");
    	
    }
    else if(condition4) {
    	System.out.println("abc13@gmail");
    	System.out.println("test@6789");
    }
    else {
    	System.out.println("");
    }
    Driver.close();
    } 
    
  
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium softwares\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
  }

}
