package pageObjects;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.Properties;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import utilities.DefaultPageObject;

public class DealsPageObject extends DefaultPageObject {
	
	 Properties prop = new Properties();
	
	 @FindBy(xpath="//*[@id=\"main-nav\"]/a[5]/span")
	 private WebElementFacade deals;

	 @FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")
	 private WebElementFacade new_button;


		@FindBy(name="title")
		private WebElementFacade deals_title;
		
		
		@FindBy(name="amount")
		private WebElementFacade deals_amount;
		
		@FindBy(name="probability")
		private WebElementFacade deals_probability;


		@FindBy(name="commission")
		private WebElementFacade deals_commision;
		
		
		@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
		private WebElementFacade deals_save_button;
	 

	 public void Enter_the_deals_page() throws Exception{

	      prop=loadThePropertiesFile();
	      
	     
	      Thread.sleep(3500);
	        deals.click();
	        logger.info("Deals link clicked");
	        
	        getDriver().manage().timeouts().implicitlyWait(20, SECONDS);
	        
	        new_button.click();
	        
	        Thread.sleep(500);
	    }
	 
	 public void Enter_the_deals_details() throws Exception{

	        prop=loadThePropertiesFile();
	     
	        deals_title.sendKeys(prop.getProperty("title")); 
	        deals_amount.sendKeys(prop.getProperty("amount"));
	        deals_probability.sendKeys(prop.getProperty("probability"));
	        deals_commision.sendKeys(prop.getProperty("Commission"));
	        logger.info("Deals values entered");
	        deals_save_button.click();
	        getDriver().manage().timeouts().implicitlyWait(20, SECONDS);
	        Thread.sleep(500);
	    }
	 
	 public void Enter_the_deals_datatable(String title, String amount, String probability, String commision) throws Exception{

	        prop=loadThePropertiesFile();
	     
	        deals_title.sendKeys(title); 
	        deals_amount.sendKeys(amount);
	        deals_probability.sendKeys(probability);
	        deals_commision.sendKeys(commision);
	        logger.info("Deals values entered");
	        getDriver().manage().timeouts().implicitlyWait(20, SECONDS);
	        Thread.sleep(500);
	    }

	
}
