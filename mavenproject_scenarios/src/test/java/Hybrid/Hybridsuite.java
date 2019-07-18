package Hybrid;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.testng.annotations.Test;

public class Hybridsuite {
  

@Test
  public void datadriven() throws Exception {
	// TODO Auto-generated method stub
    String filepath=System.getProperty("user.dir")+"\\testdata\\readexceldata.xlsx";
    File f=new File(filepath);
	  FileInputStream fis=new FileInputStream("filepath");
	  Thread.sleep(10000);
  }
@Test
public void datawriting() throws Exception {
	String 	// TODO Auto-generated method stub
    String=System.getProperty("user.dir")+"\\testdata\\readexceldata.xlsx";
	File f=new File(String);
	FileOutputStream fos=new FileOutputStream(f);
	Thread.sleep(10000);
}
}
