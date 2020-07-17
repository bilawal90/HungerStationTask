package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class StepDefination {
	
	@Given("Add Pet Payload")
	public void add_Pet_Payload() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		given().header("Content-Type","application/json")
		.body("{\r\n" + 
				"  \"id\": 998855221,\r\n" + 
				"  \"category\": {\r\n" + 
				"    \"id\": 0,\r\n" + 
				"    \"name\": \"string\"\r\n" + 
				"  },\r\n" + 
				"  \"name\": \"afnan\",\r\n" + 
				"  \"photoUrls\": [\r\n" + 
				"    \"string\"\r\n" + 
				"  ],\r\n" + 
				"  \"tags\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 0,\r\n" + 
				"      \"name\": \"string\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"status\": \"available\"\r\n" + 
				"}");
		
	    throw new cucumber.api.PendingException();
	}

	@When("user calls AddPetAPI with Post https request")
	public void user_calls_AddPetAPI_with_Post_https_request() {
		
		when().post("pet");
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("the API Call is success with status code {int}")
	public void the_API_Call_is_success_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	 
		
	}



}
