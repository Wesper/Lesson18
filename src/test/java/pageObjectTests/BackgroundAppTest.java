package pageObjectTests;

import common.CommonTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static utils.DriverManager.getDriver;
import static utils.RestApi.*;

public class BackgroundAppTest extends CommonTest {

    @Test
    public void BackgroundApp() throws InterruptedException {
        onboadringPage.openAddLanguage();
        backgroundApp(10);
        Assert.assertTrue(getDriver().findElements(languagesPage.getHeaderLanguagesPage()).size() == 1);
    }
}
