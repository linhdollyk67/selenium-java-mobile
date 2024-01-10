package testcases;
import commons.Setup;
import org.testng.annotations.Test;

public class BookingFlow extends Setup {
    @Test(priority = 0)
    public void loginToDriverApp(){
        loginFeature.loginToDriver("0335334155", "000000");
        homeFeature.turnOnAcceptJob();
    }
}
