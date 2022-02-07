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

    DemoqaPage demoqaPage;
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));
        demoqaPage = new DemoqaPage();
//2. Headers da bulunan department isimlerini yazdirin
        System.out.println(demoqaPage.headers.getText());

//3. 3.sutunun basligini yazdirin
        System.out.println("3. sutunun basligi --> "+demoqaPage.basliklarListesi.get(2).getText());

        System.out.println("\n<<=======>>");

        System.out.println(demoqaPage.tumListe.getText());

        Driver.closeDriver();


    }



}
