package Excel.mavenproject_scenarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Existingexcelfile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method 
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
		int nr=st.getLastRowNum()+1;
		for(int i=1;i<nr;i++) {
			row=st.getRow(i);
			cell=row.getCell(6);
			if(cell==null)
				cell=row.createCell(6);
			cell.setCellValue("old");
		}
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		wb.close();

	}

	
		// TODO Auto-generated method stub
		
	

}
