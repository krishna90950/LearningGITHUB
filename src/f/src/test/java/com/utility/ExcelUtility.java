package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public static String getTestdata(int r, int c) throws InvalidFormatException, IOException {
		
		//create file class object
		
		File file = new File("C:\\Users\\Krishna\\Desktop\\TestData.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		Sheet sheet = book.getSheetAt(0);
		
		return sheet.getRow(r).getCell(c).getStringCellValue();
			
	}

}
