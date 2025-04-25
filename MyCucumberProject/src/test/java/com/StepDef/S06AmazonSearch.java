package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class S06AmazonSearch {
	WebDriver driver;
	
	/*@Before
	public void launchAmazon()
	{
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://www.amazon.in/");
	}
	
	@After
	public void closeBrowser()
	{
		driver.close();
	}*/
	
	@Given("Launch Amazon site")
	public void launch_amazon_site() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://www.amazon.in/");
	}

	@When("Enter {string} and {int}")
	public void enter_and(String product, Integer price) {
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product + price);
	}

	@When("Hit the enter key")
	public void hit_the_enter_key() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	}

	@Then("The correct products should display")
	public void the_correct_products_should_display() {
	   System.out.println(driver.getTitle());
	}
	
	@When("I Enter {string} and {int}")
	public void i_enter_and(String product, Integer price) {
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product + price);
	}

	@When("I Hit the enter key")
	public void i_hit_the_enter_key() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	}

	@Then("Correct products should display")
	public void correct_products_should_display() {
		System.out.println(driver.getTitle());
	}
}
