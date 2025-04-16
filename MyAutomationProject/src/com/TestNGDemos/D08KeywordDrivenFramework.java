package com.TestNGDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D08KeywordDrivenFramework {
	File file;
	FileInputStream fis;
	Properties prop;
	WebDriver driver;
	JavascriptExecutor js;
	
	@Test
	public void login() {
		js.executeScript("window.scrollBy(0, 600)", "");
		driver.findElement(By.id(prop.getProperty("unTxBxId"))).sendKeys("practice");
		driver.findElement(By.name(prop.getProperty("psTxBxName"))).sendKeys("SuperSecretPassword!");
		driver.findElement(By.cssSelector(prop.getProperty("loginBtnCss"))).click();
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.linkText(prop.getProperty("logoutLink"))).click();
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("D:\\StarAgile\\Demos\\SA2501042\\MyAutomationProject\\src\\com\\TestNGDemos\\MyLocators.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);			//Load all the properties from .properties file
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(prop.getProperty("URL"));
		
		js = (JavascriptExecutor) driver;
	}

	@AfterTest
	public void afterTest() {
	}

}
