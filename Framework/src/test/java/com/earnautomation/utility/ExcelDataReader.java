package com.earnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	XSSFWorkbook wb;

	public ExcelDataReader() {

		File src = new File("./TestData/Data.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {

			System.out.println("Unable to read data" + e.getMessage());
		}

	}

	public String getStringData(String sheetName, int row, int col) 
	{
		return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
	}

	public String getStringData(int sheetIndex, int row, int col) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();

	}

	public double getNumericData(String sheetName, int row, int col) {
		return wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue();
	}

}
