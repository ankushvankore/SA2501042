package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D19HandlingListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		// WebElement listBox = driver.findElement(By.id("multiselect1"));
		// Select cars = new Select(listBox);
		Select cars = new Select(driver.findElement(By.id("multiselect1")));

		List<WebElement> carList = cars.getOptions();
		System.out.println("All Cars in the list are");

		for (int i = 0; i < carList.size(); i++)
			System.out.println(carList.get(i).getText());

		System.out.println("--------------------------");

		if (cars.isMultiple()) {
			cars.selectByContainsVisibleText("Vol");
			cars.selectByIndex(2);

			List<WebElement> selectedCars = cars.getAllSelectedOptions();
			System.out.println("List  of all cars");
			for (WebElement sc : selectedCars)
				System.out.println(sc.getText());
		}
		
		cars.deselectByIndex(2);
	}

}
