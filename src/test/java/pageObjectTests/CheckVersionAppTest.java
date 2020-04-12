package pageObjectTests;

import common.CommonTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckVersionAppTest extends CommonTest {

    @Epic(value = "Подключение аллюра")
    @Feature(value = "Проверка страницы о приложении")
    @Description(value = "Проверка версии приложения")
    @Parameters({"version"})
    @Test
    public void CheckVersionApp(String version){
        onboadringPage.skipOnboarding();
        homePage.waitElementPresent(homePage.getBurger(), 5);
        homePage.openBurger();
        burgerPage.waitElementPresent(burgerPage.getAbout(), 5);
        burgerPage.openAbout();
        aboutPage.waitElementPresent(aboutPage.getVersionElement(), 5);
        String versionApp = aboutPage.getVersion();
        aboutPage.backToHomePage();
        Assert.assertEquals(versionApp, version);
    }
}
