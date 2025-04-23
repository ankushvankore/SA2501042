package com.RunnerClasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/F01GoogleTitle.feature",
					glue = "com.StepDef")
public class R01GoogleTitle {
	//glue = "name of the package where you have stored the step definition"
}
