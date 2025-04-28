package com.StepDef;

import java.util.List;
import java.util.Map;

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
		{
			System.out.println(d);
			for(int i = 0; i < d.size(); i++)
				System.out.println(d.get(i));
		}
	}

	@Then("Registration process should successful")
	public void registration_process_should_successful() {
	    System.out.println("Registration successful!!!");
	}
	
	
	@When("Enter data as follows")
	public void enter_data_as_follows(io.cucumber.datatable.DataTable dataTable) {
	    //System.out.println(dataTable);
		List<Map<String, String>> data = dataTable.asMaps();
		
		System.out.println(data);
		
		for(Map<String, String> d : data)
		{
			System.out.println("First Name: " + d.get("FirstName"));
			System.out.println("Last  Name: " + d.get("LastName"));
			System.out.println("Email   Id: " + d.get("EmailId"));
			System.out.println("Contact No: " + d.get("ContactNo"));
			System.out.println("Address   : " + d.get("Address"));
		}
	}

	@Then("Registration process should be successful")
	public void registration_process_should_be_successful() {
		System.out.println("Registration successful!!!");
	}

}
