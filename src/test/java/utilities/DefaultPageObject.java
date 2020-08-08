package utilities;

import net.thucydides.core.pages.PageObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DefaultPageObject extends PageObject {

    public Logger logger=LogManager.getLogger();

    public Properties loadThePropertiesFile() throws IOException{

        Properties prop = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
        prop.load(inputStream);
        return prop;
    }






}
