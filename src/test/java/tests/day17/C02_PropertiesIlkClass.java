package tests.day17;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesIlkClass {

    @Test
    public void positiveLoginTest() {
        // Hotel my camp sitesine positive login testini POM'a tam
        // uygun olarak yapiniz
        //		 https://www. hotelmycamp.com/ adresine git
        //		login butonuna bas
        //	test data username: manager ,
        //	test data password : Manager1!
        //	Degerleri girildiginde sayfaya girilemedigini test et
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.ilkLoginButton.click();
        hotelMyCampPage.usernameBox.sendKeys("manager",Keys.TAB,"Manager1!");
        hotelMyCampPage.loginButton.click();

        Assert.assertTrue(hotelMyCampPage.managerButton.isEnabled());

    }
}
