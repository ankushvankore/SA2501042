package com.Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trials {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sampleapp.tricentis.com/101/index.php");

		Robot rbt = new Robot();
		driver.findElement(By.linkText("Automobile")).click();
		driver.findElement(By.linkText("Enter Insurant Data")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");

		driver.findElement(By.id("open")).click();


		for (int i = 1; i <= 9; i++) {
			Thread.sleep(500);
			rbt.keyPress(KeyEvent.VK_TAB);
		}
		Thread.sleep(500);
		rbt.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		rbt.keyPress(KeyEvent.VK_TAB);

		for (int i = 1; i <= 23; i++) {
			Thread.sleep(500);
			rbt.keyPress(KeyEvent.VK_DOWN);

		}
		Thread.sleep(500);
		rbt.keyPress(KeyEvent.VK_ENTER);

		// ".style.display='block'" is one of the method to display blocked content.

		// js.executeScript("arguments[0].style.display='block';", upload);

		// upload.sendKeys("C:\\Users\\Pranadharthi Haran
		// V\\OneDrive\\Pictures\\Screenshots\\Screenshot 2025-01-10 180400.png");
	}

}
