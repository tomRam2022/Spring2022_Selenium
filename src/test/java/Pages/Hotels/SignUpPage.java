package Pages.Hotels;

import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SignUpPage extends Commands {
    By signUp = By.xpath("//a[contains(@data-stid,'signup')]");
    By termsAndConditionsBtn = By.xpath("//a[text()='Terms and Conditions']");
    By privacyStatementBtn = By.xpath("//a[text()='Privacy Statement']");
    By termsAndConditionsHeading = By.xpath("//h1[text()='Terms and Conditions']");
    By privacyStatementHeading = By.xpath("//h2[text()='Privacy Statement']");
    public void clickSignUpBtn() {
        //MyDriver.pause(5);
        MyDriver.getDriver().findElement(signUp).click();
    }

    public void clickTermsAndConditionsLink() {
        MyDriver.getDriver().findElement(termsAndConditionsBtn).click();
        switchToCurrentWindow();
        String currentWindow = MyDriver.getDriver().getWindowHandle();
        System.out.println("currentWindow = " + currentWindow);
    }

    public void clickPrivacyStatementLink() {
        MyDriver.getDriver().findElement(privacyStatementBtn).click();
        switchToCurrentWindow();
        String currentWindow = MyDriver.getDriver().getWindowHandle();
        System.out.println("currentWindow = " + currentWindow);
    }

    public void verifyTermAndConditionsPage() {
        String pageHeading = MyDriver.getDriver().findElement(termsAndConditionsHeading).getText();
        System.out.println(pageHeading);
        Assert.assertEquals(pageHeading, "Terms and Conditions", "Incorrect page");
    }
    public void verifyPrivacyStatementsPage() {
        String pageHeading = MyDriver.getDriver().findElement(privacyStatementHeading).getText();
        System.out.println(pageHeading);
        Assert.assertEquals(pageHeading, "Privacy Statement", "Incorrect page");
    }
}
