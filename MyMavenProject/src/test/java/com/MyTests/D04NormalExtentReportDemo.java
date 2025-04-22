package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D04NormalExtentReportDemo {

	public static void main(String[] args) {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("MyFirstReport.html");
		// This is the file that will store the report
		ExtentReports report = new ExtentReports();
		// This is an object which is generating the report

		report.attachReporter(htmlReport);
		// The report should be saved to the html file

		ExtentTest test;
		// This is an object which will refer to the test case of your script

		// Add environment information
		report.setSystemInfo("Machine", "Dell");
		report.setSystemInfo("Operating System", "Windows 10");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("User", "Meena");
		report.setSystemInfo("Application", "Google");

		// Configuration of Report
		htmlReport.config().setDocumentTitle("My First Extent Report");
		htmlReport.config().setReportName("Google Test");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("dd-MMMM-yyy");

		test = report.createTest("First Test: Google Title");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.co.in");

		driver.close();

		test.log(Status.PASS, MarkupHelper.createLabel("Test Pass", ExtentColor.GREEN));

		test = report.createTest("Second Test: Google Search");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.co.in");

		driver.close();

		test.log(Status.FAIL, MarkupHelper.createLabel("Test Fail", ExtentColor.RED));

		report.flush();
		// This will generate the physical report
	}

}
