package com.MyTests;

import org.testng.annotations.Test;

public class D10DataDrivenTesting {
	@Test (dataProviderClass = com.MyTests.MyData.class, dataProvider = "getMyData")
	public void myTest(int n, String s) {
		System.out.println(n);
		System.out.println(s);
	}
}
