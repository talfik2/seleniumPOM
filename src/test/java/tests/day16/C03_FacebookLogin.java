package tests.day16;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_FacebookLogin {

    FacebookPage facebookPage = new FacebookPage();
    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get("https://www.facebook.com");
        facebookPage.acceptCookiesButton.click();
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.driver);
        actions.click(facebookPage.emailBox)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        Assert.assertTrue(facebookPage.wrongEntry.isEnabled());
    }
}
