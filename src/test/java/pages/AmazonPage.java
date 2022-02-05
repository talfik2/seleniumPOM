package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    // Bir page class'i actigimizda ilk yapmamiz gereken sey
    // parametresiz bir constructor olusturup
    // bu constructor icerinde PageFoctory ile driver'a ilk deger atamsi yapmak olmalidir


    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement amazonAramaKutusu;


    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElementi;


}
