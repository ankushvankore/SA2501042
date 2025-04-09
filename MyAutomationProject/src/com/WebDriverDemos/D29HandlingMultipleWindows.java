package com.WebDriverDemos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D29HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.naukri.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300)", "");
		
		driver.findElement(By.xpath("//*[@id=\"trending-naukri-wdgt\"]/div/div[1]/a[1]/span")).click();
		
		System.out.println("Title: " + driver.getTitle());
		
		Set<String>windows = driver.getWindowHandles();
		
		Iterator<String>itr = windows.iterator();
		String win1 = itr.next();	//Read id of 1st window
		String win2 = itr.next();	//Read id of 2nd window
		
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		System.out.println("Title: " + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"search-result-container\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/label/i")).click();
		
		driver.switchTo().window(win1);
		js.executeScript("window.scrollBy(0, -300)", "");
		driver.findElement(By.cssSelector("input[placeholder=\"Enter skills / designations / companies\"]")).sendKeys("Automation Testing");
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
