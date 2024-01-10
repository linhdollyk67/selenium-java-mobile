package pages;

import commons.BaseTest;
import commons.CommonKeyword;
import io.appium.java_client.AppiumDriver;

public class LoginPage extends BaseTest {
    CommonKeyword commonKeyword = new CommonKeyword();
    public LoginPage(AppiumDriver driver){
        super(driver);
    }
    public String username= "//*[@resource-id='ph.com.bdo.pay.tst:id/authenticationJourney_usernameScreen_usernameField']";

    public String password ="//*[@resource-id='ph.com.bdo.pay.tst:id/authenticationJourney_usernameScreen_passwordField']";

    public String loginBtn  = "//*[@resource-id='ph.com.bdo.pay.tst:id/authenticationJourney_usernameScreen_loginButton']";


    public void inputUserName(String data){
        commonKeyword.clickElement(username);
        commonKeyword.sendKey(username, data);

    }

    public void inputPassWord(String data){
        commonKeyword.clickElement(password);
        commonKeyword.sendKey(password, data);

    }
    public void clickLoginBtn() {
        commonKeyword.clickElement(loginBtn);

    }

    public void inputOTP(String OTP){
        commonKeyword.pause(7000);
        driver.getKeyboard().sendKeys(OTP);
    }
//    public void inputPIN(){
//        commonKeyword.pause(1000);
//        boolean elementExist = true;
//        while (elementExist == true){
//            System.out.println(elementExist);
//            try {
//                driver.findElement(By.xpath(pinCode)).click();
//            } catch (Exception e) {
//                elementExist = false;
//            }
//        }
//    }
}
