package Class4;

import Helper.Misc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class Homework2_TestCase2 {


    /**
     * Testcase-2:
     * On Create new account page:
     *
     * Verify the "Sign Up" button is enabled when user lands on the form
     *
     * Enter the below details in Sign Up form EXCEPT DOB
     * First name
     * Last name
     * email
     * re-enter email
     * new password
     * click Sign Up
     *
     * Verify "Please choose a gender. You can change who can see this later." is displayed
     *
     */
    @Test
    public void verifySignUpIsEnabled () {
        Misc.launchUrlOnNewWindow("https://facebook.com/");

        Misc.getDriver().findElement(By.xpath("//a [@rel='async']")).click();

        Misc.pause(5);

        //Misc.getDriver().findElement(By.xpath("//button[@name='websubmit']")).isEnabled();
        boolean signUpBtnIsEnabled =  Misc.getDriver().findElement(By.xpath("//button[@name='websubmit']")).isEnabled();
        Assert.assertTrue(signUpBtnIsEnabled, "sign up button is not enabled");

        Misc.quitWindows();
    }
    @Test
    public void VerifyPleaseChooseAGenderMsgIsDispled () {
        Misc.launchUrlOnNewWindow("https://facebook.com/");

        Misc.getDriver().findElement(By.xpath("//a [@rel='async']")).click();

        Misc.pause(5);

        Misc.getDriver().findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tomas");

        Misc.getDriver().findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ramirez");

        Misc.getDriver().findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("memin170@yahoo.com");

        Misc.getDriver().findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("memin170@yahoo.com");

        Misc.getDriver().findElement(By.xpath( "//input[@autocomplete='new-password']")).sendKeys("abcd1234");

        Misc.getDriver().findElement(By.xpath( "//button[@name='websubmit']")).click();

        //Misc.getDriver().findElement(By.xpath("//div[text()='Please choose a gender. You can change who can see this later.']")).isDisplayed();
        boolean pleaseChooseAGenderIsDispled =  Misc.getDriver().findElement(By.xpath("//div[text()='Please choose a gender. You can change who can see this later.']")).isDisplayed();
        Assert.assertTrue(pleaseChooseAGenderIsDispled, "choose a gender message not displayed");

        Misc.quitWindows();







    }
}
