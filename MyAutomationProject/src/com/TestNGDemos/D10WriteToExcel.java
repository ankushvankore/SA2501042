package com.TestNGDemos;

import org.testng.annotations.Test;
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

public class D10WriteToExcel {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test
	public void writeToExcel() {
		row = sheet.createRow(0);		//Create 1st row
		cell = row.createCell(0);		//Create 1st cell in 1st row
		
		cell.setCellValue("Welcome to Excel");
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("ExcelFiles\\MyFirstExcel.xlsx");
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("My Sheet");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);				//This will physically write the data to file.
		wb.close();
		fos.close();
	}

}
