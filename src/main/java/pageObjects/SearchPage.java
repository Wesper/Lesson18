package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import utils.DriverManager;

import java.util.List;

public class SearchPage extends CommonPage{

    By searchInput = By.id("org.wikipedia:id/search_src_text");
    By backButton = By.className("android.widget.ImageButton");
    By clearSearch = By.id("org.wikipedia:id/search_close_btn");
    By resultTitles = By.id("org.wikipedia:id/page_list_item_title");


    public void searchText(String text){
        DriverManager.getDriver().findElement(searchInput).sendKeys(text);
    }

    public void clearSearch(){
        DriverManager.getDriver().findElement(clearSearch).click();
    }

    public void backToHomePage(){
        DriverManager.getDriver().findElement(backButton).click();
    }

    public Boolean checkAvailabilityElementInTop(String text){
        List<MobileElement> results = DriverManager.getDriver().findElements(resultTitles);
        Boolean mark = false;
        for(int i = 0; i < results.size(); i++){
            if(results.get(i).getText().equals(text)) {
                mark = true;
                break;
            }
        }
        return mark;
    }

    public By getSearchInput() {
        return searchInput;
    }

    public By getBackButton() {
        return backButton;
    }

    public By getClearSearch() {
        return clearSearch;
    }

    public By getResultTitles() {
        return resultTitles;
    }
}
