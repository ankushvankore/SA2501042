package com.MyTests;

import org.testng.annotations.Test;

public class D09TimeoutDemo {
  @Test(timeOut = 2000)
  public void myTest() throws InterruptedException {
	  Thread.sleep(3000);
	  System.out.println("Test case pass");
  }
}
