package selenium.mavenproject_scenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.BeforeTest;

public class HtmlunitdriverTest {
	public static void main(String args[]) {
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");
		String str=driver.getCurrentUrl();
		System.out.println(str);
		String str1=driver.getTitle();
		System.out.println(str);
		
	}

	
		
		
	
  
}

