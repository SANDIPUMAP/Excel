package basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class writeExcelFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream(new File("user.dir","\\write.xlsx" ));
		XSSFWorkbook workbook = new XSSFWork (file);
		
		
		
	}

}
