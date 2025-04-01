package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08LocateByCssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.cssSelector("input[data-testid=\"royal-email\"]"));
		userName.sendKeys("ankushvankore@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input[aria-label=\"Password\"]"));
		password.sendKeys("1234567890");
		WebElement loginBtn = driver.findElement(By.cssSelector("button[type=\"submit\"][data-testid=\"royal-login-button\"]"));
		loginBtn.click();
	}

}
