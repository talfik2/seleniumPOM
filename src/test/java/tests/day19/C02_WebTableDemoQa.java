package tests.day19;

import org.testng.annotations.Test;

import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.ObjectInputFilter;
import java.util.Properties;

public class C02_WebTableDemoQa {
//https://demoqa.com/webtables” sayfasina gidin
//2. Headers da bulunan department isimlerini yazdirin
//3. 3.sutunun basligini yazdirin
//4. Tablodaki tum datalari yazdirin
//5. Tabloda kac cell (data) oldugunu yazdirin
//6. Tablodaki satir sayisini yazdirin
//7. Tablodaki sutun sayisini yazdirin
//8. Tablodaki 3.kolonu yazdirin
//9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
//10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini
//girdigimde bana datayi yazdirsin

    @Test
    public void demoqaTest(){
        //  1. “https://demoqa.com/webtables” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));

        DemoqaPage demoqaPage=new DemoqaPage();
        //  2. Headers da bulunan department isimlerini yazdirin
        //  normlde //thead//th olurdu ancak bu tablo class isimleri ile organize edilmis
        System.out.println("baslik satiri elementi : "+demoqaPage.baslikSatiriElementi.getText());

        // ikinci yontem olarak basliklari bir listeye koyabilirim
        // basliklarWebelementiListesi

        //  3. 3.sutunun basligini yazdirin

        System.out.println("3.sutun basligi : "+demoqaPage.basliklarWebelementiListesi.get(2).getText());

        //  4. Tablodaki tum datalari yazdirin
        System.out.println("===========Tum body==========");
        System.out.println(demoqaPage.bodyTekWebelement.getText());
        //  5. Tabloda kac cell (data) oldugunu yazdirin
        System.out.println("Tablodaki data sayisi : "+demoqaPage.tumDataWebelementList.size());
        //  6. Tablodaki satir sayisini yazdirin
        System.out.println("Tum satir sayisi : "+demoqaPage.tumSatirlarWebelementList.size());
        //  7. Tablodaki sutun sayisini yazdirin
        //     farkli yollardan hesaplanabilir ama biz hucre sayisi / satir sayisi yapalim
        System.out.println("tablodaki sutun sayisi : " +
                (demoqaPage.tumDataWebelementList.size()/demoqaPage.tumSatirlarWebelementList.size()));
        //  8. Tablodaki 3.kolonu yazdirin
        demoqaPage.sutunYazdir(2);


        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        demoqaPage.ismeGoreMaasYazdir("Alden");
        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin

        demoqaPage.hucreYazdir(3,2);

        Driver.closeDriver();
    }



}
