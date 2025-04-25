package com.StepDef;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S07RegistrationProcess {
	
	@Given("Launch registration page")
	public void launch_registration_page() {
	    System.out.println("Launching Registration page");
	}

	@When("Enter following data")
	public void enter_following_data(io.cucumber.datatable.DataTable dataTable) {
	    //System.out.println(dataTable);
		List<List<String>>data = dataTable.asLists();
		
		for(List<String>d : data)
			System.out.println(d);
	}

	@Then("Registration process should successful")
	public void registration_process_should_successful() {
	    System.out.println("Registration successful!!!");
	}

}
