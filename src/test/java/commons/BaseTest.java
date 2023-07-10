package commons;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    int timeoutExWait = 30;
    int timeoutImWait = 5;
    public static WebDriverWait waitDriverApp;
    public static AppiumDriver<MobileElement> driver;
    public BaseTest(AppiumDriver driver){
        this.driver = driver;
        waitDriverApp = new WebDriverWait(driver, timeoutExWait);
    }
    public BaseTest(){

    }
}
