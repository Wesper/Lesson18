package pageObjectTests;

import io.qameta.allure.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import common.CommonTest;
import pageObjects.LanguagesPage;

public class AddLanguageTest extends CommonTest {

    @DataProvider
    public Object[][] languages() {
        return new Object[][]{
                {"Русский", "Русский"}
        };
    }

    @Issue(value = "A-1")
    @TmsLink(value = "Test-1")
    @Epic(value = "Подключение аллюра")
    @Feature(value = "Проверка страницы онбординга")
    @Description(value = "Добавление языка на странице онбординга")
    @Test(dataProvider = "languages")
    @Link(value = "https://wikipedia.org")
    public void AddLanguage(String actual, String expected){
        onboadringPage.openAddLanguage();
        languagesPage.waitElementPresent(languagesPage.getHeaderLanguagesPage(), 10);
        languagesPage.openLanguagesList();
        languagesPage.waitElementPresent(languagesPage.getHeaderLanguages(), 10);
        languagesPage.addLanguage(actual);
        languagesPage.waitElementPresent(languagesPage.getHeaderLanguagesPage(), 10);
        languagesPage.getLanguage(expected).isDisplayed();
    }
}
