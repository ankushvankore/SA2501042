package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A06FacebookLogin_ClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.className("inputtext")).sendKeys("ankushvankore@gmail.com");
		driver.findElement(By.className("_9npi")).sendKeys("123456");
		driver.findElement(By.className("selected")).click();
	}

}
