package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D07DependsOnDemo {
  @Test
  public void login() {
	  System.out.println("Login Test case");
	  Assert.assertFalse(true);
  }
  
  @Test (dependsOnMethods = "login")
  public void logout() {
	  System.out.println("Logout Test case");
  }
}
