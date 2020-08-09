package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.DashboardPageObject;
import pageObjects.DealsPageObject;

public class DashboardSteps {
	
	DashboardPageObject dashboardobject;
	DealsPageObject Dealspageobject;

	@Step
	public void Enter_the_deals_page() throws Exception
	{
		
		
		dashboardobject.deals_board_click();
		Thread.sleep(3000);
		
		Dealspageobject.Enter_the_deals_page();
		
	}
	
	  @Step
	    public void LogOutTheApplication() throws Exception{

		  dashboardobject.logoutApplication();
	    }
	
}
