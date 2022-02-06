package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {

    // POM'da farkli class lara farkli sekilde ulasilmasi benimsenmistir
    // Driver class'i icin static yontemi kullaniyoruz
    // Page class lari icin ise obje uzerinden kullanilmasi tercih edilmistir

    @Test
    public void test01() {
        // amazon a gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //arama kutusuna nutella yazalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("nutella", Keys.ENTER);
        // sonucun nutella icerdigini kontrol edelim
        String actualResult = amazonPage.sonucYazisiElementi.getText();
        String expectedResult = "nutella";
        Assert.assertTrue(actualResult.contains(expectedResult));

        Driver.closeDriver();
    }

    @Test
    public void test02() {
        // amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //java icin arama yapalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("java" + Keys.ENTER);
        // sonucun java icerdigini test edelim
        String sonucYazisiStr = amazonPage.sonucYazisiElementi.getText();

        Assert.assertTrue(sonucYazisiStr.contains("java"));
        Driver.closeDriver();
    }
}