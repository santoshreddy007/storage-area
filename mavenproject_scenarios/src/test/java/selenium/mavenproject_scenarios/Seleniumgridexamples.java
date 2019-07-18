package selenium.mavenproject_scenarios;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xerces.impl.io.MalformedByteSequenceException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class Seleniumgridexamples {
	WebDriver driver;
	String baseurl,nodeurl;
	public void setup() throws MalformedURLException,InterruptedException
	{
		 baseurl="http://www.newtours.demoaut.com/";
		 nodeurl="http://192.168.0.18:5679/wd/hub";
		 DesiredCapabilities capability=DesiredCapabilities.chrome();
		 capability.setBrowserName("chrome");
		 capability.setPlatform(Platform.VISTA);
		 driver=new RemoteWebDriver(new URL(nodeurl),capability);
		 Thread.sleep(10000);
		
	}
	public void simpletest() {
		driver.get(baseurl);
		Assert.assertEquals("welcome:Mercury Tours",driver.getTitle());
        driver.quit();
	}
	
	

	public static void main(String[] args) throws Exception,Exception {
		// TODO Auto-generated method stub
		Seleniumgridexamples s=new Seleniumgridexamples();
		s.setup();
		s.simpletest();

	}

}
