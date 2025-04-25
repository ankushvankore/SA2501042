package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S04RediffRegistration {
	WebDriver driver;

	@Given("Launch Rediffmail site")
	public void launch_rediffmail_site() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@When("Enter fullName as {string}")
	public void enter_full_name_as(String fullName) {
		driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(fullName);
	}

	@When("Enter rediffid as {string}")
	public void enter_rediffid_as(String rId) {
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Rediffmail ID\"]")).sendKeys(rId);
	}

	@When("Enter choose password as {string}")
	public void enter_choose_password_as(String ps) {
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys(ps);
	}

	@When("Enter Confirm Password as {string}")
	public void enter_confirm_password_as(String ps) {
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys(ps);
	}

	@When("Click on Check Availablity")
	public void click_on_check_availablity() {
		driver.findElement(By.xpath("//input[@value=\"Check availability\"]")).click();
	}

	@Then("Availablity message should display")
	public void availablity_message_should_display() {
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[5]/div/div[1]/div/span")).getText());
	}

	@When("I Enter fullName as {string}")
	public void i_enter_full_name_as(String fName) {
		driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(fName);
	}

	@When("I Enter rediffid {string}")
	public void i_enter_rediffid(String rId) {
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Rediffmail ID\"]")).sendKeys(rId);
	}

	@When("I Enter choose password {string}")
	public void i_enter_choose_password(String ps) {
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys(ps);
	}

	@When("I Enter Confirm Password {string}")
	public void i_enter_confirm_password(String ps) {
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys(ps);
	}

	@When("I Click on Check Availablity")
	public void i_click_on_check_availablity() {
		driver.findElement(By.xpath("//input[@value=\"Check availability\"]")).click();
	}

	@Then("I should get Availablity message")
	public void i_should_get_availablity_message() {
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[5]/div/div[1]/div/span")).getText());
	}
}
