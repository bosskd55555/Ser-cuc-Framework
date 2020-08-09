package pageObjects;

import java.util.Properties;

import org.openqa.selenium.support.CacheLookup;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import utilities.DefaultPageObject;
import utilities.TestUtil;

public class DashboardPageObject  extends DefaultPageObject{

	Properties prop = new Properties();

    TestUtil til = new TestUtil();

    @FindBy(xpath="//*[@id=\"main-nav\"]/a[5]/span")
	 private WebElementFacade Deals;

    @FindBy(xpath = "//*[@id=\"top-header-menu\"]/div[3]/div[2]/div/i")
    private WebElementFacade Logout_link;
    
    @FindBy(xpath = "//*[@id=\"top-header-menu\"]/div[3]/div[2]/div/div/a[5]/span")
    private WebElementFacade Logout;
    
  
    
    public void deals_board_click() throws InterruptedException
    {
    	Thread.sleep(3000);
    	logger.info("before deals link click");
    	Deals.click();
    	logger.info("after deals link click");
    	Thread.sleep(3000);
    }
    
    
	
    
    public void logoutApplication () throws InterruptedException{
    	
    	Thread.sleep(3000);
    	
    	Logout_link.click();
    	
    	Thread.sleep(2000);
    	Logout.click();
    	
    	
    }
    
}
