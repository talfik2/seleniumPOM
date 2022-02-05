package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {



  public static WebDriver driver;


    public static WebDriver getDriver() {


        // Driver.getDriver method'u her calistiginda
        // driver= new ChromeDriver(); komutundan oturu yeni bir driver olusturuyor
        // Biz Driver class'dan getDriver'i ilk calistirdigimizda new atamasi olsun
        // sonraki calistirmalarda atama olmasin istiyoruz
        // bunun icin driver= new ChromeDriver(); satiri bir if blogu icine alacagiz

        if (driver==null) {
           switch (ConfigReader.getProperty("browser")){
               case "chorome":
                   WebDriverManager.chromedriver().setup();
                   driver = new ChromeDriver();
                   break;
               case "opera":
                   WebDriverManager.operadriver().setup();
                   driver = new OperaDriver();
                   break;
               case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driver = new FirefoxDriver();
                   break;
               case "safari":
                   WebDriverManager.safaridriver().setup();
                   driver = new SafariDriver();
                   break;
               case "edge":
                   WebDriverManager.edgedriver().setup();
                   driver = new EdgeDriver();
                   break;
           }
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
