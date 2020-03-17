package pageObjects;

import org.openqa.selenium.By;
import utils.DriverManager;

public class AboutPage extends CommonPage {
    By versionElement = By.id("org.wikipedia:id/about_version_text");
    By backButton = By.className("android.widget.ImageButton");

    public String getVersion(){
        return DriverManager.getDriver().findElement(versionElement).getText();
    }

    public void backToHomePage(){
        DriverManager.getDriver().findElement(backButton).click();
    }

    public By getVersionElement() {
        return versionElement;
    }
}
