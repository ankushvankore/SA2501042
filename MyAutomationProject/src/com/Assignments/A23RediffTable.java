package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A23RediffTable {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");

		// driver.get("https://money.rediff.com/gainers");

		Thread.sleep(5000);

		// Alert alert = driver.switchTo().alert();
		// System.out.println(alert.getText());
		// alert.dismiss();

		//driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/a[2]")).click();
		driver.findElement(By.linkText("Money")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/span[6]/a")).click();

		List<WebElement> headings = driver.findElements(By.tagName("th"));

	}

}
