package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class BurgerPage {

    AppiumDriver<MobileElement> driver;
    By settings = By.xpath("//*[@text = 'Settings']");
    By customizeFeed = By.xpath("//*[@text = 'Customize the feed']");
    By support = By.xpath("//*[@text = 'Support Wikipedia']");
    By about = By.xpath("//*[@text = 'About']");
    By help = By.xpath("//*[@text = 'Help']");

    public BurgerPage(AppiumDriver<MobileElement> driver){
        this.driver = driver;
    }

    public void openCustomizeFeed(){
        driver.findElement(customizeFeed).click();
    }
    public void openSupport(){
        driver.findElement(support).click();
    }
    public void openAbout(){
        driver.findElement(about).click();
    }
    public void openHelp(){
        driver.findElement(help).click();
    }

    public By getSettings() {
        return settings;
    }

    public By getCustomizeFeed() {
        return customizeFeed;
    }

    public By getSupport() {
        return support;
    }

    public By getAbout() {
        return about;
    }

    public By getHelp() {
        return help;
    }
}
