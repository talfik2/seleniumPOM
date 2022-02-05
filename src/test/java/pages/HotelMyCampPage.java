package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {

    public HotelMyCampPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement ilkLoginButton;

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@value='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='Try again please']")
    public WebElement incorrectPassword;

    @FindBy(xpath = "//span[@class='username username-hide-on-mobile']")
    public WebElement managerButton;
}

