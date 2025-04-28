package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class S08DataDrivenTesting {
	WebDriver driver;
	
	@Given("Launch {string} in browser")
	public void launch_in_browser(String url) {
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get(url);
	}

	@When("I Enter {string}")
	public void i_enter(String firstName) {
	    driver.findElement(By.id("fname")).sendKeys(firstName);
	}

	@When("I Enter the {string}")
	public void i_enter_the(String lastName) {
	    driver.findElement(By.id("lname")).sendKeys(lastName);
	}

	@When("I Select the {string}")
	public void i_select_the(String gender) {
	    if(gender.equals("Male"))
	    	driver.findElement(By.id("male")).click();
	    else if(gender.equals("Female"))
	    	driver.findElement(By.id("female")).click();
	    else if(gender.equals("Other"))
	    	driver.findElement(By.id("other")).click();
	}

	@Then("Process should complete")
	public void process_should_complete() {
	    System.out.println("Process complete");
	}
	@After
	public void closeBrowser()
	{
		driver.close();
	}
}
