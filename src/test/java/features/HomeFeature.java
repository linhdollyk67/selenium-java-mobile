package features;

import commons.BaseTest;
import io.appium.java_client.AppiumDriver;
import pages.HomePage;

public class HomeFeature extends BaseTest {
    HomePage homePage = new HomePage(driver);
    public HomeFeature(AppiumDriver driver){
        super(driver);
    }
    public void turnOnAcceptJob(){
        homePage.turnOnAcceptJobMode();
        //lay api vehicle de verify driver online in odrd
        //thử lấy token theo api, nếu ko đc thì dùng cmd
    }


}
