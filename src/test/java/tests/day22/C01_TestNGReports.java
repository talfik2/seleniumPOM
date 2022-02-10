package tests.day22;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class C01_TestNGReports extends TestBaseRapor {


    @Test
    public void windowHandlereusableTest() throws IOException {
      extentTest=extentReports.createTest("Window Handle","title ile 2.sayfaya gecis yapildi");
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        extentTest.info("herokuapp sayfasina gidildi");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        extentTest.info("ÿeni window linkine tiklandi");
        ReusableMethods.switchToWindow("New Window");

        String expectedTitle="New Window";
        extentTest.info("Reusable method ile 2.sayfaya gecildi");
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
        extentTest.pass("Title'in beklenen deger ile ayni oldugu test edildi");
        ReusableMethods.getScreenshot("WindowSwitch");
        Driver.closeDriver();
    }
}
