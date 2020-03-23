package common;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageObjects.*;
import utils.DriverManager;

import java.net.MalformedURLException;

public class CommonTest {

    public AboutPage aboutPage;
    public BurgerPage burgerPage;
    public HomePage homePage;
    public LanguagesPage languagesPage;
    public OnboadringPage onboadringPage;
    public SearchPage searchPage;

    public void init() throws MalformedURLException {
        DriverManager.initializeDriver();
        this.aboutPage = new AboutPage();
        this.burgerPage = new BurgerPage();
        this.homePage = new HomePage();
        this.languagesPage = new LanguagesPage();
        this.onboadringPage = new OnboadringPage();
        this.searchPage = new SearchPage();

    }

    public static void closeDriver() {
        DriverManager.getDriver().quit();
    }

    @BeforeClass
    public void setUp() throws MalformedURLException {
        init();
    }

    @AfterClass
    public void tearDown(){
        CommonTest.closeDriver();
    }

}
