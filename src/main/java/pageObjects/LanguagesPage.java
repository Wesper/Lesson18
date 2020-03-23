package pageObjects;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import utils.DriverManager;

public class LanguagesPage extends CommonPage{

    By addButton = By.xpath("//*[@text = 'ADD LANGUAGE']");
    By backButton = By.className("android.widget.ImageButton");
    By headerLanguages = By.xpath("//*[@text = 'Add a language']");
    By headerLanguagesPage = By.xpath("//*[@text = 'Wikipedia languages']");
    By russian = By.xpath("//*[@text = 'Русский']");

    public void openLanguagesList(){
        DriverManager.getDriver().findElement(addButton).click();
    }

    public void addLanguage(String language){
        DriverManager.getDriver().findElement(By.xpath("//*[@text = '" + language + "']")).click();
    }

    public MobileElement getLanguage(String language) {
        return DriverManager.getDriver().findElement(By.xpath("//*[@text = '" + language + "']"));
    }

    public void goBack(){
        DriverManager.getDriver().findElement(backButton).click();
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
}
