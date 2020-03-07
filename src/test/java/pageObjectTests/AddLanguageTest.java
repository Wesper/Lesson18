package pageObjectTests;

import org.testng.annotations.Test;
import pageObjects.Common;
import pageObjects.LanguagesPage;
import pageObjects.OnboadringPage;

public class AddLanguageTest extends Common {

    @Test
    public void AddLanguage(){
        OnboadringPage onboadringPage = new OnboadringPage(driver);
        onboadringPage.openAddLanguage();
        LanguagesPage languagesPage = new LanguagesPage(driver);
        waitElementPresent(languagesPage.getHeaderLanguagesPage(), 10);
        languagesPage.openLanguagesList();
        waitElementPresent(languagesPage.getHeaderLanguages(), 10);
        languagesPage.addLanguage(languagesPage.getRussian());
        driver.findElement(languagesPage.getRussian()).isDisplayed();
    }
}
