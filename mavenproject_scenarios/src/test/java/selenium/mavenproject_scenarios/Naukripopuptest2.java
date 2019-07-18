package selenium.mavenproject_scenarios;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukripopuptest2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","E:\\selenium softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		System.out.println("drivetabs.getTitle()");
		 String mainwindow=driver.getWindowHandle();
		 System.out.println("mainwindow id is:"+mainwindow);
		 Set<String> allwindows = driver.getWindowHandles();
		 int count=allwindows.size();
		 System.out.println("allwindows id's are"+allwindows);
		 System.out.println("total windows is"+count);
		 ArrayList<String> tabs=new ArrayList<String>(allwindows);
		 driver.switchTo().window(tabs.get(3));
		 driver.close();
		 driver.switchTo().window(tabs.get(2));
		 driver.close();
		 driver.switchTo().window(tabs.get(1));
		 driver.findElement(By.xpath("//input[@id='qsb-keyskill-sugg']"));
		 driver.close();
		 driver.switchTo().window(mainwindow);
		 System.out.println("main window is:"+driver.getTitle());

	}

}
