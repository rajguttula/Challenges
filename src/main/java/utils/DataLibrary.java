package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class DataLibrary {

	public static Object[][] readExcelData(String excelSheetName) throws IOException {
		//XSSFWorkbook wbook = new XSSFWorkbook("./data/"+excelfileName+".xlsx");
		HSSFWorkbook wbook=new HSSFWorkbook(new FileInputStream("./data/Data.xls"));
		HSSFSheet sheet = wbook.getSheet(excelSheetName);
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count is: "+rowCount);
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Col Count is: "+colCount);
		Object[][] data = new Object[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {
			HSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				HSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				data[i-1][j] = stringCellValue;
				System.out.println(stringCellValue);
			} 
		}
		wbook.close();
		return data;
		
	}
}







