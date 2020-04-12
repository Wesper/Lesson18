package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    private static AppiumDriver<MobileElement> driver;

    private final static File app = new File("src/test/resources/apps/wiki.apk");
    private final static String url = "http://127.0.0.1:4723/wd/hub";

    private static DesiredCapabilities setCapabilitys(){
    DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_10");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.wikipedia");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.wikipedia.main.MainActivity");
        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        caps.setCapability("newCommandTimeout", "300000");
        return caps;
    }

    private static URL setUrl() throws MalformedURLException {
        URL appiumURL = new URL(url);
        return appiumURL;
    }

    public static AppiumDriver<MobileElement> getDriver(){
        return driver;
    }

    public static void initializeDriver() throws MalformedURLException{
        driver = new AppiumDriver<MobileElement>(setUrl(), setCapabilitys());
    }

    public static String getUrl(){
        return url;
    }



}
