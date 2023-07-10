package commons;

import datas.Datas;
import datas.Locators;
import features.HomeFeature;
import features.LoginFeature;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup extends BaseTest{
    public Locators locators ;
    public Datas datas;
    public LoginFeature loginFeature;
    public HomeFeature homeFeature;
    int newCommandTimeout = 600;
    @BeforeMethod
    public void openApp(){
        locators = new Locators();
        datas = new Datas();
        openAppWithDeviceInfo(datas.deviceName1, datas.uid1, datas.platformName1, datas.platformVersion1, datas.app1, datas.automationName1);
    }

    public AppiumDriver<MobileElement> openAppWithDeviceInfo(String deviceName, String uid, String platformName, String platformVersion, String app, String automationName){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", deviceName);
        desiredCapabilities.setCapability("uid", uid);
        desiredCapabilities.setCapability("platformName", platformName);
        desiredCapabilities.setCapability("platformVersion", platformVersion);
        desiredCapabilities.setCapability("app", app);
        desiredCapabilities.setCapability("automationName", automationName);
        desiredCapabilities.setCapability("newCommandTimeout", newCommandTimeout);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
        System.out.println("Application started");
        try {
            URL url = new URL("http://0.0.0.0:4723/wd/hub");
            driver = new AndroidDriver<>(url, desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(timeoutImWait, TimeUnit.SECONDS);
            waitDriverApp = new WebDriverWait(driver, timeoutExWait);
            loginFeature = new LoginFeature(driver);
            homeFeature = new HomeFeature(driver);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
    @AfterMethod
    public void closeApp(){
//        driver.quit();
    }
}
