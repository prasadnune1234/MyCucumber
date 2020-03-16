package com.qtpselenium.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		dryRun = false,
		strict = true,
		monochrome = true,
		features = {"src/test/resources/"},
		glue = {"com.qtpselenium.cucumber"},
		
		plugin = {     //"pretty",
				"html:target/site/cucumber-html",
				"json:target/cucumber1.json"
		} 
			//tags = {"@BookHotelTickets"}
		
		
		)
public class MyRunner {
	
	

}
