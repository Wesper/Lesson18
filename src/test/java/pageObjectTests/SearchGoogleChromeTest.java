package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Common;
import pageObjects.HomePage;
import pageObjects.OnboadringPage;
import pageObjects.SearchPage;

public class SearchGoogleChromeTest extends Common {

    String text = "Google Chrome";

    @Test
    public void searchGoogleChrome(){
        OnboadringPage onboadringPage = new OnboadringPage(driver);
        onboadringPage.skipOnboarding();
        HomePage homePage = new HomePage(driver);
        waitElementPresent(homePage.getSearchInput(), 5);
        homePage.openSearchPage();
        SearchPage searchPage = new SearchPage(driver);
        waitElementPresent(searchPage.getSearchInput(), 10);
        searchPage.searchText(text);
        Boolean mark = searchPage.checkAvailabilityElementInTop(text);
        mark.equals(true);
    }
}
