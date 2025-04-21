package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class D09POM_Client {
	RediffUtility r1;
	WebDriver driver;
	@Test
	public void createAccount() {
		r1.setFullName("Anand Kumar");
		r1.setRediffId("adnandkumar");
		r1.enterPassword("anand123");
		r1.enterConfirmPassword("anand123");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		r1 = new RediffUtility(driver);
	}

	@AfterTest
	public void afterTest() {
	}

}
