package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D33RightClick_DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		
		WebElement rightClickBtn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		//act.moveToElement(rightClickBtn).contextClick().perform();
		act.contextClick(rightClickBtn).perform();
	
		driver.findElement(By.xpath("//*[@id=\"authentication\"]")).click();
		
		WebElement dblClickBtn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		//act.moveToElement(dblClickBtn).doubleClick().perform();
		act.doubleClick(dblClickBtn).perform();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

}
