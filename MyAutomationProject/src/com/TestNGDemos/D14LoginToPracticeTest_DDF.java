package com.TestNGDemos;

import org.testng.annotations.Test;

import graphql.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D14LoginToPracticeTest_DDF {
	String fPath = "ExcelFiles\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index = 1;
	
	WebDriver driver;

	@Test(dataProvider = "getLoginData")
	public void login(String un, String ps) {
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(ps);
		driver.findElement(By.id("submit")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("successfully"));
	}

	@AfterMethod
	public void afterMethod() {
		row = sheet.getRow(index);
		cell = row.getCell(2);
		
		if(driver.getCurrentUrl().contains("successfully"))
		{
			driver.findElement(By.linkText("Log out")).click();
			cell.setCellValue("Pass");
		}
		else
		{
			System.out.println("Invalid user name / password");
			cell.setCellValue("Fail");
		}
		index++;
	}

	@DataProvider
	public Object[][] getLoginData() {
		int rows = sheet.getPhysicalNumberOfRows();
		String[][] loginData = new String[rows - 1][2];

		for (int i = 0; i < rows - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < 2; j++) {
				cell = row.getCell(j);
				loginData[i][j] = cell.getStringCellValue();
			}
		}
		return loginData;
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		fos = new FileOutputStream(file); //Configure fileoutputstream only after 
											//Configuration of sheet
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fis.close();
		
		driver.close();
	}

}
