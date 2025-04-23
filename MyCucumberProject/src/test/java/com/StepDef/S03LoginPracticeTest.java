package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S03LoginPracticeTest {
	WebDriver driver;
	@Given("Launch Practice Test site")
	public void launch_practice_test_site() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("Enter valid user name")
	public void enter_valid_user_name() {
	   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
	}

	@When("Enter valid password")
	public void enter_valid_password() {
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("Home page should display")
	public void home_page_should_display() {
	    System.out.println("Title:" + driver.getTitle());
	}

	//Invalid data
	@When("Enter invalid user name")
	public void enter_invalid_user_name() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ssstudent");
	}

	@When("Enter invalid password")
	public void enter_invalid_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sassword123");
	}

	@When("Click on Submit button")
	public void click_on_submit_button() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("Error message should display")
	public void error_message_should_display() {
	    System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());
	}

}
