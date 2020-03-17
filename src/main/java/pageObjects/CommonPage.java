package pageObjects;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;

public class CommonPage {

    public MobileElement waitElementPresent(By by, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), timeoutInSeconds);
        return (MobileElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

}
