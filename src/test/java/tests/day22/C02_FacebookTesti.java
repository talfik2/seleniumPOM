package tests.day22;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_FacebookTesti extends TestBaseRapor {

    @Test
    public void test01() throws InterruptedException {
        extentTest = extentReports.createTest("Facebook Login Test", "Fake address ile facebook giris testi");
        // 1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        extentTest.info("Facebook sayfasina gidildi");
        FacebookPage facebookPage=new FacebookPage();
        facebookPage.facebookCookies.click();
        extentTest.info("Cookie handle edildi");
        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin

        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker=new Faker();
        facebookPage.emailKutusu.sendKeys("asda");
        facebookPage.passKutusu.sendKeys(faker.internet().password());
        facebookPage.loginButonu.click();
        extentTest.info("Fake email ve sifre ile giris yapimak istendi");
        //4- Basarili giris yapilamadigini test edin

        Assert.assertTrue(facebookPage.girilemediYazisiElemnti.isDisplayed());
        extentTest.pass("Yanlis email ve sifre ile giris yapilamadi");
        Thread.sleep(5000);
        Driver.closeDriver();
    }
}
