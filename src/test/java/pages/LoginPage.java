package pages;

import commons.BaseTest;
import commons.CommonKeyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {
    CommonKeyword commonKeyword = new CommonKeyword();
    public LoginPage(AppiumDriver driver){
        super(driver);
    }
    public String agreeTC= "//*[@resource-id='android:id/button1']";

    public String loginButton ="//android.widget.Button[@content-desc=\"เข้าสู่ระบบ\"]";

    public String mobileNumberTxt = "//*[@text='0xx-xxx-xxxx']";
    public String confirmBtn = "//android.view.View[@content-desc=\"ยืนยัน\"]";
    public String pinCode = "//android.widget.Button[@content-desc=\"0\"]";

    public void clickOnLoginBtn() {
        commonKeyword.pause(3000);
        commonKeyword.clickElement(agreeTC);
        commonKeyword.pause(1000);
        commonKeyword.clickElement(loginButton);

    }
    public void inputMobileNumber(String number){
        commonKeyword.pause(1000);
        commonKeyword.sendKey(mobileNumberTxt, number);
        commonKeyword.clickElement(confirmBtn);
    }

    public void inputOTP(String OTP){
        commonKeyword.pause(1000);
        driver.getKeyboard().sendKeys(OTP);
    }
    public void inputPIN(){
        commonKeyword.pause(1000);
        boolean elementExist = true;
        while (elementExist == true){
            System.out.println(elementExist);
            try {
                driver.findElement(By.xpath(pinCode)).click();
            } catch (Exception e) {
                elementExist = false;
            }
        }
    }
}
