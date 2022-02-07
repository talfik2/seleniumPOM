package tests.day19;

import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebTableDynamicLocate {
    // 3 test metodu olusturalim
    // 1.method satir numarasi verildiginde o satir datalarini yazdirsin
    // 2.method satir ve sutun numarasi girildiginde hucreyi yazdirsin
    // 3.method sutun numarasi verildiginde tum sutunu yazdirsin

    HotelMyCampPage hotelMyCampPage;
    HMCWebTablePage hmcWebTablePage;
    @Test
    public void Test01() {
    hotelMyCampPage=new HotelMyCampPage();
    hmcWebTablePage= new HMCWebTablePage();

    hotelMyCampPage.girisyap();
        // 1.method satir numarasi verildiginde o satir datalarini yazdirsin
    hmcWebTablePage.satirYazdir(2);
        Driver.closeDriver();
    }
    @Test
    public void Test02() {
        // 2.method satir ve sutun numarasi girildiginde hucreyi yazdirsin
        hotelMyCampPage=new HotelMyCampPage();
        hmcWebTablePage= new HMCWebTablePage();

        hotelMyCampPage.girisyap();

        System.out.println(hmcWebTablePage.hucreWebelementGetir(3, 5));
        Driver.closeDriver();
    }


}
