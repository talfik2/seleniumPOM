package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

   public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@value='1'])[3]")
    public WebElement acceptCookiesButton;

   @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(className = "_9ay7")
    public WebElement wrongEntry;

}
