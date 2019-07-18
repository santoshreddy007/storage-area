package selenium.mavenproject_scenarios;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukripopupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver;
       System.setProperty("webdriver.chrome.driver","E:\\selenium softwares\\chromedriver.exe");
       driver=new ChromeDriver();
       driver.get("https://www.naukri.com/");
       driver.manage().window().maximize();
       System.out.println(driver.getTitle());
       String Mainwindow=driver.getWindowHandle();
       System.out.println(Mainwindow);		
		Set<String>s1=driver.getWindowHandles();
		
       Iterator<String>	i1=s1.iterator();
       System.out.println(s1);
      
         while(i1.hasNext())			
       {		
           String ChildWindow=i1.next();		
           		
           if(!Mainwindow.equalsIgnoreCase(ChildWindow))			
           {    		
               driver.switchTo().window(ChildWindow);
               Thread.sleep(2000);
               driver.findElement(By.cssSelector("#qsb-keyskill-sugg")).click();
               Thread.sleep(20000);
           }
           
       }
         driver.close();
	}
}