package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String readDataFromProperties(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

	public String readDataFromExcel(String sheetName,int row,int cell) throws IOException {
		FileInputStream fis=new FileInputStream("/Automation/TestData/TestDataExcel.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String cellValue = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
	}
}
