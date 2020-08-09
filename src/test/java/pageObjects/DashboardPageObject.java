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
    
    @FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")
	 @CacheLookup	
	 private WebElementFacade new_button;
    
    public void deals_board_click() throws InterruptedException
    {
    	
    	Deals.click();
    	Thread.sleep(3000);
    }
    
    
	 public void Enter_the_deals_page() throws Exception{

	      prop=loadThePropertiesFile();
	      
	     
	      Thread.sleep(3500);
	     
	        
	      
	      //  getDriver().manage().timeouts().implicitlyWait(20, SECONDS);
	        
	      
	      new_button.click();
	      
	        logger.info("before new button clicked");
	        
	        Thread.sleep(3500);
	      
	        
	       // new_button.waitUntilEnabled();
	        //new_button.waitUntilVisible();
	      
	        
	        
	        
	     //  WebElement test= getDriver().findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button"));
	       
	       Thread.sleep(3500);
	       
	      //test.click();
	        
	        logger.info(" after new button clicked");
	        
	        Thread.sleep(1500);
	    }
    
    public void logoutApplication () throws InterruptedException{
    	
    	Thread.sleep(3000);
    	
    	Logout_link.click();
    	
    	Thread.sleep(2000);
    	Logout.click();
    	
    	
    }
    
}
