package com.MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;

@Listeners(com.MyTests.MyListners.class)
public class D06ForListners {
	@Test
	public void testForPass() {
		System.out.println("Test case pass");
		Assert.assertTrue(true);
	}
	
	@Test
	public void testForFail() {
		System.out.println("Test case Fail");
		Assert.assertFalse(true, "Making this test case fail");
	}
	
	@Test
	public void testForSkip() {
		System.out.println("Test case Skip");
		throw new SkipException("Skiping for testing purpose");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Test stats");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Test ends");
	}

}
