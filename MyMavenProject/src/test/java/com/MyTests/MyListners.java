package com.MyTests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners implements ITestListener {
	public void onStart(ITestContext result) {
		System.out.println("Test case started (Before Test)");
	}

	public void onFinish(ITestContext result) {
		System.out.println("Test case Finished (After Test)");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + "Test case Fail");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + "Test case Skiped");
	}

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + "Test case Starts");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "Test case Pass");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}
}
