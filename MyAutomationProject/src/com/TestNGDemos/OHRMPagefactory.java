package com.TestNGDemos;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OHRMPagefactory {
	WebDriver driver;

	// Constructor
	OHRMPagefactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	// By Username = By.xpath("//input[@id='txtCustomerID']");
	// By Password = By.xpath("//input[@id='txtPassword']");
	// By Login_btn = By.xpath("//input[@id='Butsub']");

	@FindBy(how = How.XPATH, using = "//input[@id='txtCustomerID']") // alternate way to locate elements
	WebElement Username;
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement Password; // Simple way
	@FindBy(xpath = "//input[@id='Butsub']")
	WebElement Button;

	@FindBy(tagName = "a")
	List<WebElement> links; // For multiple elements

	// Actions
	public void Give_Username(String usr) {
		Username.sendKeys(usr);
	}

	public void Give_Password(String pas) {
		Password.sendKeys(pas);
	}

	public void Click_Login() {
		Button.click();
	}

	public void allinks() {
		for (WebElement ref : links) {
			System.out.println(ref.getText());
		}
	}
}
