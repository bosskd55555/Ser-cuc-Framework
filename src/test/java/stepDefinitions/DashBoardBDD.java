package stepDefinitions;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.DashboardSteps;
import steps.DealsSteps;


public class DashBoardBDD {

	@Steps
	DashboardSteps dashboardsteps;
	DealsSteps DealsSteps;
	
	@Then("user enters the deals")
	public void user_enters_the_deals() throws Exception {
		
		dashboardsteps.Enter_the_deals_page();
	   
	}
	
	
	
	 @Then("Logout from the application page")
    public void validate_Homepage_title()throws Exception {

		dashboardsteps.LogOutTheApplication();
    }
}
