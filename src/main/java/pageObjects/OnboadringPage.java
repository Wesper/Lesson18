package pageObjects;

import org.openqa.selenium.By;
import utils.DriverManager;

public class OnboadringPage extends CommonPage{

    By skipButton = By.id("org.wikipedia:id/fragment_onboarding_skip_button");
    By addLanguageButton = By.id("org.wikipedia:id/add_lang_container");


    public void skipOnboarding(){
        DriverManager.getDriver().findElement(skipButton).click();
    }

    public void openAddLanguage(){
        DriverManager.getDriver().findElement(addLanguageButton).click();
    }

    public By getSkipButton() {
        return skipButton;
    }
}
