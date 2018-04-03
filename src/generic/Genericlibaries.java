package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import com.google.common.collect.Table.Cell;

public class Genericlibaries {
	
		public static String getCellValue(String path,String sheet,int row,int cell)
		{
			String v=" ";
			try{
				FileInputStream fis=new FileInputStream(path);
				Workbook wb = WorkbookFactory.create(fis);
				Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
				v=c.getStringCellValue();
			}
			catch(Exception e)
			{
				
			}
			return v;
		}

	
		
		
		
	}


