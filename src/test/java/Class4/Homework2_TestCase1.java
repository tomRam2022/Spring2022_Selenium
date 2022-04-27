package Class4;

import Helper.Misc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework2_TestCase1 {

    /**
     * Testcase-1:
     *
     * Verify "Keep me signed in" is NOT selected for messenger login page
     *
     * Click "Log in" button
     *
     * Verify "Incorrect email or phone number" is displayed
     *
     * Verify "Continue" button is enabled
     *
     */
    @Test
    public void VerifyKeepMeSingedInIsNotSelected () {
        Misc.launchUrlOnNewWindow("https://facebook.com/");

        Misc.getDriver().findElement(By.linkText("Messenger")).click();

        Misc.pause(5);

       // Misc.getDriver().findElement(By.xpath("//label[@class='uiInputLabelInput']")).isSelected();
        boolean keepMeSignedInCheckBoxNotSelected =  Misc.getDriver().findElement(By.xpath("//label[@class='uiInputLabelInput']")).isSelected();
        Assert.assertFalse(keepMeSignedInCheckBoxNotSelected, "keep me signed in is selected");

        Misc.quitWindows();

    }
    @Test
    public void VerifyIncorrectEmailOrPhoneNumberIsDisplyed () {
        Misc.launchUrlOnNewWindow("https://facebook.com/");

        Misc.getDriver().findElement(By.linkText("Messenger")).click();
        Misc.pause(5);

        Misc.getDriver().findElement(By.xpath("//button[@id='loginbutton']")).click();
        Misc.pause(5);

        //Misc.getDriver().findElement(By.xpath("//div[text()='Incorrect email or phone number']")).isDisplayed();
        boolean incorrectEmailOrPhoneNumberIsDisplayed =  Misc.getDriver().findElement(By.xpath("//div[text()='Incorrect email or phone number']")).isDisplayed();
        Assert.assertTrue(incorrectEmailOrPhoneNumberIsDisplayed, "incorrect email or phone number message not displayed");

        Misc.quitWindows();
    }
    @Test
    public void VerifyContinueBtnIsEnabled () {
        Misc.launchUrlOnNewWindow("https://facebook.com/");

        Misc.getDriver().findElement(By.linkText("Messenger")).click();

        Misc.pause(5);

        Misc.getDriver().findElement(By.xpath("//button[@id='loginbutton']")).click();

        Misc.pause(5);

        //Misc.getDriver().findElement(By.xpath("//button[@name='login']")).isEnabled();
        boolean continueBtnIsEnabled = Misc.getDriver().findElement(By.xpath("//button[@name='login']")).isEnabled();
        Assert.assertTrue(continueBtnIsEnabled);

        Misc.quitWindows();

    }






}
