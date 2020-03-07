package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LanguagesPage {

    AppiumDriver<MobileElement> driver;
    By addButton = By.xpath("//*[@text = 'ADD LANGUAGE']");
    By backButton = By.className("android.widget.ImageButton");
    By headerLanguages = By.xpath("//*[@text = 'Add a language']");
    By headerLanguagesPage = By.xpath("//*[@text = 'Wikipedia languages']");
    By russian = By.xpath("//*[@text = 'Русский']");

    public LanguagesPage(AppiumDriver<MobileElement> driver){
        this.driver = driver;
    }

    public void openLanguagesList(){
        driver.findElement(addButton).click();
    }

    public void addLanguage(By by){
        driver.findElement(by).click();
    }

    public void goBack(){
        driver.findElement(backButton).click();
    }

    public By getAddButton() {
        return addButton;
    }

    public By getBackButton() {
        return backButton;
    }

    public By getHeaderLanguages() {
        return headerLanguages;
    }

    public By getHeaderLanguagesPage() {
        return headerLanguagesPage;
    }

    public By getRussian() {
        return russian;
    }
}
