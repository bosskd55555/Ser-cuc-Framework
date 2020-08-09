package pageObjects;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
//import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import utilities.DefaultPageObject;

public class DealsPageObject extends DefaultPageObject {
	
	 Properties prop = new Properties();
	
	 @FindBy(xpath="//*[@id=\"main-nav\"]/a[5]/span")
	 private WebElementFacade deals;

	
	/* @FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")
	 @CacheLookup	
	 private WebElementFacade new_button;*/


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
	        
	       Thread.sleep(3500);
	      //  getDriver().manage().timeouts().implicitlyWait(20, SECONDS);
	        
	        logger.info("before new button clicked");
	        
	        Thread.sleep(3500);
	        
	      //  new_button.click();
	        
	        
	        
	       WebElement test= getDriver().findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button"));
	       
	       Thread.sleep(3500);
	       
	      test.click();
	        
	        logger.info(" after new button clicked");
	        
	        Thread.sleep(1500);
	    }
	 
	 public void Enter_the_deals_details() throws Exception{

	        prop=loadThePropertiesFile();
	     
	        deals_title.sendKeys(prop.getProperty("title")); 
	        deals_amount.sendKeys(prop.getProperty("amount"));
	        deals_probability.sendKeys(prop.getProperty("probability"));
	        deals_commision.sendKeys(prop.getProperty("Commission"));
	        logger.info("Deals values entered");
	        deals_save_button.click();
	       // getDriver().manage().timeouts().implicitlyWait(20, SECONDS);
	        Thread.sleep(500);
	    }
	 
	 public void Enter_the_deals_datatable(String title, String amount, String probability, String commision) throws Exception{

	        prop=loadThePropertiesFile();
	     
	        deals_title.sendKeys(title); 
	        deals_amount.sendKeys(amount);
	        deals_probability.sendKeys(probability);
	        deals_commision.sendKeys(commision);
	        logger.info("Deals values entered");
	        //getDriver().manage().timeouts().implicitlyWait(20, SECONDS);
	        Thread.sleep(500);
	    }

	
}
