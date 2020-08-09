package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.DashboardPageObject;

public class DashboardSteps {
	
	DashboardPageObject dashboardobject;

	@Step
	public void Enter_the_deals_page() throws Exception
	{
		
		
		dashboardobject.deals_board_click();
		Thread.sleep(3000);
		dashboardobject.Enter_the_deals_page();
		
	}
	
	  @Step
	    public void LogOutTheApplication() throws Exception{

		  dashboardobject.logoutApplication();
	    }
	
}
