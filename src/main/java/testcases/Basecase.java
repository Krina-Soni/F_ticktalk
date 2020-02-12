package testcases;

import constants.ConstantVar;
import constants.ContantBIDS;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import reports.ReportsClass;

public class Basecase {

    public static WebDriver driver;

    @Before
    public void initialize(){

        System.getProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"chromedriver");
        driver=new ChromeDriver();
        ConstantVar constantVar= new ConstantVar();
        driver.get(ConstantVar.url);
        driver.manage().window().maximize();

    }
}
