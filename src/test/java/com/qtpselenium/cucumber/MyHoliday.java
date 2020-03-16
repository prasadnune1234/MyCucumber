package com.qtpselenium.cucumber;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//import java.util.Hashtable;
//import java.util.Map;
//import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyHoliday {
	
	@Before("@BookflightTickets")
	public void before() {
		SoftAssert sa = new SoftAssert();
		System.out.println("######################### Before Test ###################");
	}
	
	@After("@BookflightTickets")
	public void after() {
		System.out.println("##################  After Test  #####################");
	}

	@Given("^I Live in ([a-zA-Z]{1,})$")
	public void I_Live(String cityName) {
		System.out.println("I Live in "+cityName);
	}
	
	@And("^I work for an MNC$")
    public void I_Work() {
		System.out.println("I work for an MNC");
	}

	@And("^we are around (\\d+) Members$")
    public void We_Ten(int mem, List<Map<String, String>> names) {
		System.out.println("we are around "+mem+ " Members "+names.toString());
			
	}
	
	@And("^we want to book from ([^\"]*) to ([^\"]*)$")
    public void I_Want(String fromDate, String toDate) {
		System.out.println("we want to book from "+fromDate+ " to " +toDate);
	}
 
	@When("^I open the travel website$")
	public void Open_Site() {
		System.out.println("I open the travel website");
			}

	@And("^search for flights to Goa$")
    public void GoaFlight() {
		System.out.println("search for flights to Goa");
			}

    @Then("^I should be able to book the tickets within the budget of (\\d+) INR$")
    public void budget(int Budgi) {
    	System.out.println("I should be able to book the tickets within the budget of "+Budgi+ " INR");
    	//assertThat("A").isEqualTo("B");
    }
    
    @But("^all of my team members should be accommodated in the same flight$")
    public void accomodate() {
    	System.out.println("all of my team members should be accommodated in the same flight");
    }
    @And("^we would like to stay from ([^\"]*)$")
    public void stay(String fromDate) {
    	System.out.println("we would like to stay from "+fromDate);
    }
    @And("^would like to leave ([a-zA-Z]{1,}) on ([^\"]*)$")
    public void returnDate(String city, String onDate) {
    	System.out.println("would like to leave "+city+" on "+onDate);
    }
}


