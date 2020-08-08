package runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin= {"pretty","html:target"},
	    		  features = ".\\src\\test\\resources\\features\\Deals.feature",
	    		  glue= {"stepDefinitions"},
	    		  dryRun=false,
		          monochrome=true)
public class TestRunner {
		
	}

