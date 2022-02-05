package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {



  public static WebDriver driver;


    public static WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();

        // Driver.getDriver method'u her calistiginda
        // driver= new ChromeDriver(); komutundan oturu yeni bir driver olusturuyor
        // Biz Driver class'dan getDriver'i ilk calistirdigimizda new atamasi olsun
        // sonraki calistirmalarda atama olmasin istiyoruz
        // bunun icin driver= new ChromeDriver(); satiri bir if blogu icine alacagiz

        if (driver==null) {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }

    public static void closeDriver() {
        if (driver!=null) {
            driver.quit();
            driver=null;
        }


    }

}
