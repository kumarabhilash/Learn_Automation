package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData_Config {
	
	XSSFWorkbook wkb;
	XSSFSheet sheet;
	
	public ExcelData_Config(String filepath) throws Exception{
		
		try {
			File src = new File(filepath);
			FileInputStream fis = new FileInputStream(src);
			wkb = new XSSFWorkbook(fis);
		} 
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(int sheetnumber, int row, int column){
		
		sheet = wkb.getSheetAt(0);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	public int getRowCount(int sheetindex){
		
		int row = wkb.getSheetAt(sheetindex).getLastRowNum();
		row = row + 1;
		return row;
	}
	
}
