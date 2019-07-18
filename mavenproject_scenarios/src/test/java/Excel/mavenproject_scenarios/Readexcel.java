package Excel.mavenproject_scenarios;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
//import com.mysql.cj.result.Row;

public class Readexcel {



	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
     String filepath=System.getProperty("user.dir")+"\\testdata\\readexceldata.xlsx";
     String sheetname="test";
     File f=new File(filepath);
     FileInputStream fis=new FileInputStream(f);
     Workbook wb=null;
     Sheet st=null;
     Row row=null;
     Cell cell=null;
    if(filepath.endsWith(".xls")) wb=new HSSFWorkbook(fis);
    else if(filepath.endsWith(".xlsx")) wb=new XSSFWorkbook(fis);
    
    st=wb.getSheet(sheetname);
    Thread.sleep(10000);
    
   System.out.println(st.getLastRowNum()+1);
    row=st.getRow(0);
    cell=row.getCell(2);
    System.out.println(cell.getStringCellValue());
	}
    
	}


