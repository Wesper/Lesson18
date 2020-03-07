package pageObjectTests;

import io.qameta.allure.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.Common;
import pageObjects.LanguagesPage;
import pageObjects.OnboadringPage;

public class AddLanguageTest extends Common {

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
        OnboadringPage onboadringPage = new OnboadringPage(driver);
        onboadringPage.openAddLanguage();
        LanguagesPage languagesPage = new LanguagesPage(driver);
        waitElementPresent(languagesPage.getHeaderLanguagesPage(), 10);
        languagesPage.openLanguagesList();
        waitElementPresent(languagesPage.getHeaderLanguages(), 10);
        languagesPage.addLanguage(actual);
        languagesPage.getLanguage(expected).isDisplayed();
    }
}
