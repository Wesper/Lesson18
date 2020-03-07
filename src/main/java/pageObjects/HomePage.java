package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class HomePage {

    AppiumDriver<MobileElement> driver;
    By burger = By.id("org.wikipedia:id/drawer_icon_menu");
    By searchInput = By.id("org.wikipedia:id/search_container");
    By exploreButton = By.name("Explore");
    By listsButton = By.name("My lists");
    By historyButton = By.name("History");
    By nearbyButton = By.name("Nearby");

    public HomePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void openBurger() {
        driver.findElement(burger).click();
    }

    public void openExplore() {
        driver.findElement(exploreButton).click();
    }

    public void openMyLists() {
        driver.findElement(listsButton).click();
    }

    public void openHistory() {
        driver.findElement(historyButton).click();
    }

    public void openNearby() {
        driver.findElement(nearbyButton).click();
    }

    public void openSearchPage() {
        driver.findElement(searchInput).click();
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
