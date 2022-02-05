package tests.day17;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyHotelCampPage;
import utilities.Driver;

public class C01_NegativeLoginTest {

    //1 ) Bir Class olustur : NegativeTest
    //2) Bir test method olustur NegativeLoginTest()
    //		 https://www. hotelmycamp.com/ adresine git
    //		login butonuna bas
    //	test data username: manager1 ,
    //	test data password : manager1!
    //	Degerleri girildiginde sayfaya girilemedigini test et

    MyHotelCampPage myHotelCampPage = new MyHotelCampPage();
    @Test
    public void negativeTestLogin() throws InterruptedException {
        //		 https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get(" https://www.hotelmycamp.com/");
        //		login butonuna bas
        myHotelCampPage.ilkLoginButton.click();
        Actions actions = new Actions(Driver.driver);
        actions.click(myHotelCampPage.usernameBox)
                .sendKeys("manager1")
                .sendKeys(Keys.TAB)
                .sendKeys("manager1!")
                .perform();
        myHotelCampPage.loginButton.click();

        Assert.assertTrue(myHotelCampPage.incorrectPassword.isEnabled());

        Thread.sleep(3000);
        Driver.closeDriver();
    }
}
