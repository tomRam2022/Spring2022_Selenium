package Pages.Hotels;

import Web.MyDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInPages {

    By signInHomePageBtn = By.xpath("//button[text()='Sign in']");
    By signInDDBtn = By.xpath("//a[text()='Sign in']");
    By emailBox = By.xpath("//input[@type='email']");
    By passwordBox = By.xpath("//input[@type='password']");
    By signInBtnDD2 = By.xpath("//button[@type='submit']");
    By tryAgainErrorTextDD2 = By.xpath("//h3[contains(@class,'error-summary')]");




    public void clickSignInBtn() {
        MyDriver.getDriver().findElement(signInHomePageBtn).click();
    }

    public void clickSignInDD() {
        MyDriver.getDriver().findElement(signInDDBtn).click();
    }
    public void emailBoxInput() {
        MyDriver.getDriver().findElement(emailBox).sendKeys("abcd@abcd.com");
    }

    public void passwordInput() {
        MyDriver.getDriver().findElement(passwordBox).sendKeys("abcd");
    }

    public void clickSignInDD2() {
        MyDriver.getDriver().findElement(signInBtnDD2).click();
    }public void verifyTryAgainTextIsDisplayed() {
        String tryAgainErrorText = MyDriver.getDriver().findElement(tryAgainErrorTextDD2).getText();
        System.out.println(tryAgainErrorText);
        Assert.assertEquals(tryAgainErrorText,"Email and password don't match. Try again.","Error text not displayed correctly");

    }





}
