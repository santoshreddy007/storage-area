package Excel.mavenproject_scenarios;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IteatorExcel {

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
		    Iterator <Row > rowite=st.iterator();
		    while(rowite.hasNext()){
		    Iterator <Cell> cellite=rowite.next().iterator();
		    while(cellite.hasNext()) {
		    cell=cellite.next();
		    Thread.sleep(10000);
		    switch(cell.getCellTypeEnum()) {
		    case NUMERIC:
		    	System.out.println(cell.getNumericCellValue()+"(Integer)\t");
		        break;
		    	case STRING:
		    		System.out.println(cell.getNumericCellValue()+"(String)\t");
		    		break;
		    	case BOOLEAN:
		    		System.out.println(cell.getNumericCellValue()+"(true/false)\t");
		    		break;
		    		default:
		    			System.out.println("unknown");
		    		break;
		    		
		    		
		    }
		    }
		    }
	}

}
