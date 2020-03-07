package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Common {

    public AppiumDriver<MobileElement> driver;
    private File app = new File("src/test/resources/apps/wiki.apk");

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_10");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.wikipedia");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.wikipedia.main.MainActivity");
        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        URL appiumURL = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(appiumURL, caps);
    }

    @AfterClass
    public void  tearDown() {
        driver.quit();
    }

    public MobileElement waitElementPresent(By by, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        return (MobileElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

}
