package stepDefinitions;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.DealsSteps;


public class DealsPageBDD {
	
	@Steps
    DealsSteps DealsSteps;
	
	
	
	@Then("user enters the deals")
	public void user_enters_the_deals() throws Exception {
		
		DealsSteps.Enter_the_deals_page();
	   
	}

	@Then("Entering all the details in deals Page")
	public void entering_all_the_details_in_deals_Page() throws Exception {
	    
		DealsSteps.Enter_the_deals_details();
	}
	

	
	
	/*@Then("Then user creates new deals of {string} and {string} and {string} and {string}")
	public void then_user_creates_new_deals_of_and_and_and(DataTable credentials) {
	  
		List<List<String>> rows = credentials.asLists(String.class);
		
		for (List<String> columns : rows) {
	      //  DealsSteps.Enter_the_deals(new (columns.get(0),columns.get(1),));
	    }
		
	}*/
	

	


	
	@Given("the list string lecture details are")
	public void theListStringLectureDetailsAre(List<List<String>> lectures) throws Exception {
		System.out.println("");
		System.out.println(lectures);
		String title=lectures.get(1).get(0);
		String amount=lectures.get(1).get(1);
		String probability=lectures.get(1).get(2);
		String commision=lectures.get(1).get(3);
		
		System.out.println("my output is "+title);
		
		DealsSteps.Enter_the_deals(title, amount, probability, commision);

		
	}
}
