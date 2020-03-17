package pageObjects;

import org.openqa.selenium.By;
import utils.DriverManager;

public class BurgerPage extends CommonPage{

    By settings = By.xpath("//*[@text = 'Settings']");
    By customizeFeed = By.xpath("//*[@text = 'Customize the feed']");
    By support = By.xpath("//*[@text = 'Support Wikipedia']");
    By about = By.xpath("//*[@text = 'About']");
    By help = By.xpath("//*[@text = 'Help']");

    public void openCustomizeFeed(){
        DriverManager.getDriver().findElement(customizeFeed).click();
    }
    public void openSupport(){
        DriverManager.getDriver().findElement(support).click();
    }
    public void openAbout(){
        DriverManager.getDriver().findElement(about).click();
    }
    public void openHelp(){
        DriverManager.getDriver().findElement(help).click();
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
