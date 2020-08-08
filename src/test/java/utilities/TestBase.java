package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

    public static WebDriver driver;
    public static WebDriver bak_chrome;
    public static WebDriver bak_firefox;
    public static WebDriver bak_IE;
    public static Properties pro;
    public static Logger logger;

    public TestBase() {

        logger = LogManager.getLogger();
//File src=new File("./Configuration/config.properties");

        File src = new File("C:\\Users\\Smart\\eclipse-workspace\\Framework\\src\\test\\resources\\config.properties");


        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
            logger.info("Property file loaded");
        } catch (Exception e) {

            System.out.println("Exception is" + e.getMessage());

        }

    }


    public static void initialization() throws InterruptedException {
        String browserName = pro.getProperty("browser");

        if (browserName.equals("chrome") && bak_chrome != null) {
            driver = bak_chrome;
            return;
        } else if (browserName.equals("firefox") && bak_firefox != null) {

            driver = bak_firefox;
            return;
        } else if (browserName.equals("IE") && bak_IE != null) {

            driver = bak_IE;
            return;

        }


        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", pro.getProperty("chromepath"));

            //System.setProperty("webdriver.chrome.driver","F://sel//Selenium//drivers//chromedriver.exe");
            driver = new ChromeDriver();
            bak_chrome = driver;

            logger.info(" chrome browser opened");


        } else if (browserName.equals("firefox")) {

            System.setProperty("webdriver.gecko.driver", pro.getProperty("chromepath"));
            driver = new FirefoxDriver();
            bak_firefox = driver;

        } else if (browserName.equals("ie")) {

            System.setProperty("webdriver.ie.driver", pro.getProperty("chromepath"));
            driver = new InternetExplorerDriver();
            bak_IE = driver;

        }


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
        //	driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);

        //driver.get(pro.getProperty("baseURL"));
        //logger.info("URL opened");
        //driver.get("http://demo.guru99.com/v4/index.php");
        Thread.sleep(4000);


    }


    public static void GetUrl() throws InterruptedException {

        driver.get(pro.getProperty("baseURL"));
        logger.info("URL opened");
        Thread.sleep(4000);

    }


}
