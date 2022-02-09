package tests.day16;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_HotelMyCampPositiveTest {

    HotelMyCampPage myHotelCampPage ;
    @Test(groups = "miniRegression")
    public void test01() {

        Driver.getDriver().get("https://www.hotelmycamp.com/");
        myHotelCampPage = new HotelMyCampPage();
        myHotelCampPage.ilkLoginButton.click();

        Actions actions = new Actions(Driver.getDriver());

        actions.click(myHotelCampPage.usernameBox)
                .sendKeys("manager")
                .sendKeys(Keys.TAB)
                .sendKeys("Manager1!")
                .perform();

        myHotelCampPage.loginButton.click();
        Driver.closeDriver();
    }

}
