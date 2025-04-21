package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D12CreateLoginData {
	String fPath = "ExcelFiles\\LoginData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;	
	int index = 0;
	
	@Test(dataProvider = "getLoginData")
	public void writeToExcelFile(String un, String ps) {
		sheet.createRow(index).createCell(0).setCellValue(un);
		sheet.getRow(index).createCell(1).setCellValue(ps);
		sheet.getRow(index).createCell(2).setCellValue("Not Run");
		index++;
	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { "student", "Password123" },
			new Object[] { "shardul", "shardul123" },
			new Object[] { "ritik", "ritik123" },
			new Object[] { "student", "Password123" },
		};
		
	}
	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("Login Data");
		
		sheet.createRow(index).createCell(0).setCellValue("User Name");
		sheet.getRow(index).createCell(1).setCellValue("Password");
		sheet.getRow(index).createCell(2).setCellValue("Result");
		index++;
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
