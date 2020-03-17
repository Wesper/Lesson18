package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import utils.DriverManager;

public class HomePage extends CommonPage{

    By burger = By.id("org.wikipedia:id/drawer_icon_menu");
    By searchInput = By.id("org.wikipedia:id/search_container");
    By exploreButton = By.name("Explore");
    By listsButton = By.name("My lists");
    By historyButton = By.name("History");
    By nearbyButton = By.name("Nearby");

    public void openBurger() {
        DriverManager.getDriver().findElement(burger).click();
    }

    public void openExplore() {
        DriverManager.getDriver().findElement(exploreButton).click();
    }

    public void openMyLists() {
        DriverManager.getDriver().findElement(listsButton).click();
    }

    public void openHistory() {
        DriverManager.getDriver().findElement(historyButton).click();
    }

    public void openNearby() {
        DriverManager.getDriver().findElement(nearbyButton).click();
    }

    public void openSearchPage() {
        DriverManager.getDriver().findElement(searchInput).click();
    }

    public By getBurger() {
        return burger;
    }

    public By getSearchInput() {
        return searchInput;
    }

    public By getExploreButton() {
        return exploreButton;
    }

    public By getListsButton() {
        return listsButton;
    }

    public By getHistoryButton() {
        return historyButton;
    }

    public By getNearbyButton() {
        return nearbyButton;
    }
}
