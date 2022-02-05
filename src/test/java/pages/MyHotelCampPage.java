package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyHotelCampPage {

    public MyHotelCampPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement ilkLoginButton;

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@value='Log in']")
    public WebElement loginButton;
}

