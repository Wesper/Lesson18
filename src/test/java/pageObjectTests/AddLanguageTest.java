package pageObjectTests;

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

    @Test(dataProvider = "languages")
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
