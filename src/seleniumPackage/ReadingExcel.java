package seleniumPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadingExcel {

	public static void main(String[] args) throws FileNotFoundException {

		File src = new File("C:\\Users\\GOD\\eclipse-workspace\\Online_Training_2023\\user.xlsx");

		// load file
		FileInputStream fis = new FileInputStream(src);

		//XSSFWorkbook wb = new XSSFWorkbook(fis);

	}

}
