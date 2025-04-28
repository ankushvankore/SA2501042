package com.MyTests;

import org.testng.annotations.DataProvider;

public class MyData {
	@DataProvider
	public Object[][]getMyData()
	{
		Object[][] data = { {1, "Meena"},
				{2, "Shardul"},
				{3, "Rajeshwar"}};

		return data;
	}
}
