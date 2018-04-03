package Feb14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Data1 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
		Workbook w = WorkbookFactory.create(new FileInputStream("./test-output/sheet.xlsx"));
		//FileInputStream fis=new FileInputStream(file);
		String v = w.getSheet("Sheet1").getRow(1).getCell(0).toString();
			System.out.println(v);	
		

	
	}
}
