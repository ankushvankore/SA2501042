package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D18HandlingDropdownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement drpList = driver.findElement(By.id("country"));
		
		Select countries = new Select(drpList);
		//An object countries is now representing that drop down list on the page.
		//To perform any action on drop down list you have to use this object only.
		
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		List<WebElement>countryList = countries.getOptions();
		//This list is holding the list of elements from drop down list
		//not the drop down list
		//This list can be used to display the options of find the total no of elements
		System.out.println("Total no of countries: " + countryList.size());
		
		int i = 0;
		for(WebElement c : countryList)
		{
			System.out.println(i + ". " + c.getText());
			i++;
		}
		
		//countries.selectByVisibleText("United Kingdom");
		//countries.selectByValue("221");
		countries.selectByIndex(218);
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
	}

}
