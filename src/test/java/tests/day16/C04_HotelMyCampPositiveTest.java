package tests.day16;

import org.checkerframework.checker.units.qual.Acceleration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.MyHotelCampPage;
import utilities.Driver;

public class C04_HotelMyCampPositiveTest {

    MyHotelCampPage myHotelCampPage = new MyHotelCampPage();
    @Test
    public void test01() {
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        myHotelCampPage.ilkLoginButton.click();

        Actions actions = new Actions(Driver.driver);

        actions.click(myHotelCampPage.usernameBox)
                .sendKeys("manager")
                .sendKeys(Keys.TAB)
                .sendKeys("Manager1!")
                .perform();

        myHotelCampPage.loginButton.click();
    }

}
