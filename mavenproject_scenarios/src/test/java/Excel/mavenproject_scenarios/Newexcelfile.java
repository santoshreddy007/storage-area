package Excel.mavenproject_scenarios;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;


public class Newexcelfile {

	private static Object driver;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
    String filepath=System.getProperty("user.dir")+"\\testdata\\test.xlsx";
   
    File f=new File(filepath);
    Workbook wb=null;
    Sheet st=null;
    Row row=null;
    Cell cell=null;
    if(filepath.endsWith(".xls")) wb=new HSSFWorkbook();
	else if(filepath.endsWith(".xlsx")) wb=new XSSFWorkbook(f);
    st=wb.createSheet("testsheet");
    Thread.sleep(10000);
    for(int i=0;i<10;i++) {
    	row=st.createRow(i);
    	for(int j=0;j<10;j++) {
    		cell=row.createCell(j);
    		cell.setCellValue("test"+i+j);
    	}
    	
    }
    FileOutputStream fos=new FileOutputStream(f);
    wb.write(fos);
    wb.close();
    
	}

}
