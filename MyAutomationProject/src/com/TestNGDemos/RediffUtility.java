package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RediffUtility {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@placeholder='Enter your full name']") WebElement fullName;
	@FindBy(xpath = "/html/body/div[2]/div[2]/form/div/div[3]/div/input") WebElement rediffId;
	
	public RediffUtility(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	public void setFullName(String fn)
	{
		//driver.findElement(By.xpa
		th("//input[@placeholder='Enter your full name']")).sendKeys(fn);
		fullName.sendKeys(fn);
	}
	public void setRediffId(String rId)
	{
		//driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[3]/div/input")).sendKeys(rId);
		rediffId.sendKeys(rId);
	}
	public void enterPassword(String ps)
	{
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys(ps);
	}
	public void enterConfirmPassword(String ps)
	{
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys(ps);
	}

}
