package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_multiple");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
		//driver.findElement(By.id("files")).sendKeys("C:\\Users\\Dell\\Downloads\\02 4x6  1.jpg");
		//driver.findElement(By.id("files")).sendKeys("C:\\Users\\Dell\\Downloads\\Appium.webp");
		
		driver.findElement(By.id("files")).sendKeys("C:\\Users\\Dell\\Downloads\\02 4x6  1.jpg" +"\n" + "C:\\Users\\Dell\\Downloads\\Appium.webp");
	}

}
