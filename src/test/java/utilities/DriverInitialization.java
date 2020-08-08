package utilities;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;

public class DriverInitialization implements DriverSource {
	@Override
	public WebDriver newDriver(){

		WebDriver driver = null;


		return driver;
	}

	@Override
	public boolean takesScreenshots(){
		return true;
	}

}
	
	
	
	

