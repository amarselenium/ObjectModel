package com.Myproject.PageObjectModel.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	
	
	public static void ExcelReader(String Filepath, int row, String Sheetname, int cell) throws IOException
	{
		
			FileInputStream fs = new FileInputStream(new File(Filepath));
		
		
		 XSSFWorkbook wb = new XSSFWorkbook(fs);
		 XSSFSheet sheet = wb.getSheet(Sheetname);
		 String stringCellValue = sheet.getRow(row).getCell(cell).getStringCellValue();
		 System.out.println(stringCellValue);
	}
	
	
}


