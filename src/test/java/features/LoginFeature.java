package features;

import commons.BaseTest;
import io.appium.java_client.AppiumDriver;
import pages.LoginPage;

public class LoginFeature extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);
    public LoginFeature(AppiumDriver driver){
        super(driver);
    }
    public void loginToDriver(String mobileNumber, String OTP){
        loginPage.clickOnLoginBtn();
        loginPage.inputMobileNumber(mobileNumber);
        loginPage.inputOTP(OTP);
        loginPage.inputPIN();
    }
}
