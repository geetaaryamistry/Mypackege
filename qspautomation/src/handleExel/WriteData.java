package handleExel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./Data/ActiTimeValidCred.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("ValidCred");
		Row row = sh.getRow(3);
		 Cell cell = row.createCell(3);
		 cell.setCellValue("shreya");
		 FileOutputStream fos = new FileOutputStream("./Data/ActiTimeValidCred.xlsx");
		 wb.write(fos);
	}

}
