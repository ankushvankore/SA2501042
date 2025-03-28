package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04ReadURL {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.tricentis.com/software-testing-tool-trial-demo?utm_source=selectorshub&utm_medium=affiliate&pap_aid=selectorshub");
		String url = driver.getCurrentUrl();
		
		System.out.println("URL: " + url);
		
		driver.close();
	}

}
