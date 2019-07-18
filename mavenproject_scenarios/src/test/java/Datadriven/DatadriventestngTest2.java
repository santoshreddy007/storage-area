package Datadriven;

import org.testng.annotations.Test;

import com.graphbuilder.struc.Stack;

import org.testng.annotations.DataProvider;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DatadriventestngTest2 {

	private static Object[] Workbook;
	static WebDriver driver;
	
	private static Sheet sheet;
	private static Object row;
  @Test(dataProvider = "Authenitization")
  public void test(String susername, String spassword) {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(susername);
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys(spassword);
	  driver.findElement(By.id("userNavigationLabel")).click();
	  
  }
  

  @DataProvider(name="Authenitization")
  public static Object[][] credentials() {
    return new Object[][] {
    	
   Workbook wb=null;
    Sheet st=null;
    Row AWQ=null;
    Cell cell=null;
    for(int i=1; i=st.getLastRowNum(); i++)
    {
    	cell=sheet.getRow(i).getCell(1);
    	cell.setCellType(cell.CELL_TYPE_STRING);
    	  driver.findElement(By.id("email")).clear();
    	  driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue());
    	  cell=sheet.getRow(i).getCell(2);
    	  cell.setCellType(Cell.CELL_TYPE_STRING);
    	  driver.findElement(By.id("pass")).clear();
    	  driver.findElement(By.id("pass")).sendKeys(cell.getStringCellValue());
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
