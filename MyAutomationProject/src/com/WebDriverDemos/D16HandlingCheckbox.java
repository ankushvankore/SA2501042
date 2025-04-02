package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D16HandlingCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement altEmail = driver.findElement(By.cssSelector("input[name^=\"chk_altemail\"]"));
		
		System.out.println("Before");
		System.out.println("Selected: " + altEmail.isSelected());
		System.out.println("Visible : " + altEmail.isDisplayed());
		System.out.println("Enable  : " + altEmail.isEnabled());
		
		if(altEmail.isSelected() == false)
			altEmail.click();
		
		System.out.println("\nAfter...");
		System.out.println("Selected: " + altEmail.isSelected());
		System.out.println("Visible : " + altEmail.isDisplayed());
		System.out.println("Enable  : " + altEmail.isEnabled());
	}

}
