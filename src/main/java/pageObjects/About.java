package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class About {
    AppiumDriver<MobileElement> driver;
    By versionElement = By.id("org.wikipedia:id/about_version_text");
    By backButton = By.className("android.widget.ImageButton");

    public About(AppiumDriver<MobileElement> driver){
        this.driver = driver;
    }

    public String getVersion(){
        return driver.findElement(versionElement).getText();
    }

    public void backToHomePage(){
        driver.findElement(backButton).click();
    }

    public By getVersionElement() {
        return versionElement;
    }
}
