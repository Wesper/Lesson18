package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.*;

public class CheckVersionAppTest extends Common {

    @Parameters({"version"})
    @Test
    public void CheckVersionApp(String version){
        OnboadringPage onboadringPage = new OnboadringPage(driver);
        onboadringPage.skipOnboarding();
        HomePage homePage = new HomePage(driver);
        waitElementPresent(homePage.getBurger(), 5);
        homePage.openBurger();
        BurgerPage burgerPage = new BurgerPage(driver);
        waitElementPresent(burgerPage.getAbout(), 5);
        burgerPage.openAbout();
        About about = new About(driver);
        waitElementPresent(about.getVersionElement(), 5);
        String versionApp = about.getVersion();
        about.backToHomePage();
        Assert.assertEquals(versionApp, version);
    }
}
