package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S05AmazonLinks {
	WebDriver driver;
	
	@Given("Launch {string}")
	public void launch(String url) {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get(url);
	}

	@When("I Click on Sell Link")
	public void i_click_on_sell_link() {
	    driver.findElement(By.linkText("Sell")).click();
	}

	@Then("Sell Page should open")
	public void sell_page_should_open() {
	    System.out.println(driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("All Categories"));
	}

	@When("I Click on Best Sellers link")
	public void i_click_on_best_sellers_link() {
	    driver.findElement(By.linkText("Bestsellers")).click();
	}

	@Then("Best Sellers page should open")
	public void best_sellers_page_should_open() {
	    System.out.println(driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Bestsellers"));
	}

	@When("I Click on Mobile Link")
	public void i_click_on_mobile_link() {
	    driver.findElement(By.linkText("Mobiles")).click();
	}

	@Then("Mobiles Page should open")
	public void mobiles_page_should_open() {
	    System.out.println(driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Mobiles"));
	}
	
	@When("I Click on Fashion Link")
	public void i_click_on_fashion_link() {
		driver.findElement(By.linkText("Fashion")).click();
	}

	@Then("Fashion page should open")
	public void fashion_page_should_open() {
		System.out.println(driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Fashiotore"));
	}
}
