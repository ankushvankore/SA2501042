package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D30DemoQARegistration {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.id("firstName")).sendKeys("Ankush");
		driver.findElement(By.id("lastName")).sendKeys("Vankore");
		driver.findElement(By.id("userEmail")).sendKeys("ankushvankore@gmail.com");
		
		driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL + "A");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("29 Jan 1979" + Keys.ENTER);
		
		js.executeScript("window.scrollBy(0, 600)", "");
		
		driver.findElement(By.xpath("//*[local-name()=\"svg\" and @viewBox=\"0 0 20 20\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"react-select-3-option-1\"]")).click();
	}

}
