package pageObjectTests;

import common.CommonTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utils.DriverManager.getDriver;
import static utils.RestApi.lockDevice;
import static utils.RestApi.unlockDevice;

public class LockUnlockTest extends CommonTest {

    @Test
    public void LockUnlock() throws InterruptedException {
        onboadringPage.openAddLanguage();
        lockDevice();
        unlockDevice();
        Assert.assertTrue(getDriver().findElements(languagesPage.getHeaderLanguagesPage()).size() == 1);
    }
}
