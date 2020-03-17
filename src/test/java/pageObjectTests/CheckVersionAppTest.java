package pageObjectTests;

import common.CommonTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.*;

public class CheckVersionAppTest extends CommonTest {

    @Epic(value = "Подключение аллюра")
    @Feature(value = "Проверка страницы о приложении")
    @Description(value = "Проверка версии приложения")
    @Parameters({"version"})
    @Test
    public void CheckVersionApp(String version){
        OnboadringPage onboadringPage = new OnboadringPage();
        onboadringPage.skipOnboarding();
        HomePage homePage = new HomePage();
        homePage.waitElementPresent(homePage.getBurger(), 5);
        homePage.openBurger();
        BurgerPage burgerPage = new BurgerPage();
        burgerPage.waitElementPresent(burgerPage.getAbout(), 5);
        burgerPage.openAbout();
        AboutPage aboutPage = new AboutPage();
        aboutPage.waitElementPresent(aboutPage.getVersionElement(), 5);
        String versionApp = aboutPage.getVersion();
        aboutPage.backToHomePage();
        Assert.assertEquals(versionApp, version);
    }
}
