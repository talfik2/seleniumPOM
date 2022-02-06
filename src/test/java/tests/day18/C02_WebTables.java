package tests.day18;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C02_WebTables {

    //● Bir class oluşturun : C02_WebTables
    //● login( ) metodun oluşturun ve oturum açın.

    //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
    //			○ Username : manager
    //			○ Password : Manager1!

    HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
    @Test
    public void test01() {
        //● Bir class oluşturun : C02_WebTables
        //● login( ) metodun oluşturun ve oturum açın.

        //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //			○ Username : manager
        //			○ Password : Manager1!

        hotelMyCampPage.girisyap();


    }
        @Test
    public void test02 (){
  //● table( ) metodu oluşturun
 //	○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
 // header kisminda birinci satir ve altindaki datalari locate edelim



        }
    }




