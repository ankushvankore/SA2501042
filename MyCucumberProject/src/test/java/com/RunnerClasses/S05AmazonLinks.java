package com.RunnerClasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/F05AmazonLinks.feature",
					glue = "com.StepDef",
					tags = "@AmazonTest",
					publish = true)
public class S05AmazonLinks {
	/*
	 * Execute Single Scenario 		tags = "@FashionLink"
	 * Execute Multiple Scenarios	tags = "@FashionLink or @SmokeTest"
	 * Skip Single Scenario			tags = "not @BestSellerLink"
	 * Skip Multiple Scenarios		tags = "not @BestSellerLink and not @SmokeTest"
	 * Execute All Scenarios		
	 */
}
