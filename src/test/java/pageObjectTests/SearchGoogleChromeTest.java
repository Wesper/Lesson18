package pageObjectTests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Flaky;
import org.testng.annotations.Test;
import common.CommonTest;
import pageObjects.HomePage;
import pageObjects.OnboadringPage;
import pageObjects.SearchPage;

public class SearchGoogleChromeTest extends CommonTest {

    String text = "Google Chrome";

    @Flaky
    @Epic(value = "Подключение аллюра")
    @Feature(value = "Проверка функционала поиска")
    @Description(value = "Поиск статьи")
    @Test
    public void searchGoogleChrome(){
        OnboadringPage onboadringPage = new OnboadringPage();
        onboadringPage.skipOnboarding();
        HomePage homePage = new HomePage();
        homePage.waitElementPresent(homePage.getSearchInput(), 5);
        homePage.openSearchPage();
        SearchPage searchPage = new SearchPage();
        searchPage.waitElementPresent(searchPage.getSearchInput(), 10);
        searchPage.searchText(text);
        Boolean mark = searchPage.checkAvailabilityElementInTop(text);
        mark.equals(true);
    }
}
