package pages;

import commons.BaseTest;
import commons.CommonKeyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseTest {
    CommonKeyword commonKeyword = new CommonKeyword();

    public HomePage(AppiumDriver driver) {
        super(driver);
    }

    public String startAcceptJobBtn = "//android.view.View[@content-desc=\"เริ่มรับงาน\"]";
    public String onlineBtn = "//android.widget.ImageView[@content-desc=\"ออนไลน์\"]";
    public String takePhotoBtn = "//android.view.View[2]/android.widget.ImageView";

    public void clickStartAcceptJobBtn() {
        commonKeyword.clickElement(startAcceptJobBtn);
    }

    public void takePhoTo() {
        commonKeyword.clickElement(takePhotoBtn);
    }
    public void turnOnAcceptJobMode(){
        boolean elementExist = true;
        while (elementExist == true){
            try {
                WebElement startAcceptJob = driver.findElement(By.xpath(startAcceptJobBtn));
                if (startAcceptJob.isDisplayed() == true) {
                    clickStartAcceptJobBtn();
                    WebElement takePhoto = driver.findElement(By.xpath(takePhotoBtn));
                    if(takePhoto.isDisplayed()){
                        takePhoTo();
                    }
                }
            }
            catch (Exception e){
                elementExist =false;
            }
        }
        WebElement online = driver.findElement(By.xpath(onlineBtn));
        online.isDisplayed();
    }

}
