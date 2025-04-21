package com.TestNGDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D11CreateFriendsData {
	String fPath = "ExcelFiles\\FriendsData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	
	@Test
	public void createData() {
		row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue("Deepak");
		
		//row = sheet.createRow(0);
		cell = row.createCell(1);
		cell.setCellValue("Kumar");
		
		sheet.createRow(1).createCell(0).setCellValue("Soumya");
		sheet.getRow(1).createCell(1).setCellValue("N M");
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("FriendsData");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
