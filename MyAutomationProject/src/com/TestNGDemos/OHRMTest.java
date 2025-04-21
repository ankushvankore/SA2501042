package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OHRMTest {
	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		driver.manage().window().maximize();
	}

	@Test
	void testLogin() {
		OHRMPagefactory ohrm = new OHRMPagefactory(driver);
		ohrm.Give_Username("admin");
		ohrm.Give_Password("Admin123");
		ohrm.Click_Login();
		ohrm.allinks();
	}

	@AfterTest
	void close() {
		driver.close();
	}

}
