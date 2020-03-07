package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class OnboadringPage{

    AppiumDriver<MobileElement> driver;
    By skipButton = By.id("org.wikipedia:id/fragment_onboarding_skip_button");
    By addLanguageButton = By.id("org.wikipedia:id/add_lang_container");

    public OnboadringPage(AppiumDriver<MobileElement> driver){
        this.driver = driver;
    }

    public void skipOnboarding(){
        driver.findElement(skipButton).click();
    }

    public void openAddLanguage(){
        driver.findElement(addLanguageButton).click();
    }

    public By getSkipButton() {
        return skipButton;
    }
}
