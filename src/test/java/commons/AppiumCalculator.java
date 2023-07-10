package commons;

import datas.Datas;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumCalculator {
    static AppiumDriver<MobileElement> driver;
    public static void main(String[] args) throws MalformedURLException {
        Datas datas = new Datas();
        openAppium(datas.deviceName1, datas.uid1, datas.platformName1, datas.platformVersion1, datas.app1, datas.automationName1);
//        openAppium(datas.deviceName2, datas.uid2, datas.platformName2, datas.platformVersion2, datas.app2, datas.automationName2);

    }

    public static void openAppium(String deviceName, String uid, String platformName, String platformVersion, String app, String automationName) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", deviceName);
        desiredCapabilities.setCapability("uid", uid);
        desiredCapabilities.setCapability("platformName", platformName);
        desiredCapabilities.setCapability("platformVersion", platformVersion);
        desiredCapabilities.setCapability("app", app);
        desiredCapabilities.setCapability("automationName", automationName);
        driver = new AppiumDriver<MobileElement>(desiredCapabilities);
        System.out.println("Application started");

    }
}
