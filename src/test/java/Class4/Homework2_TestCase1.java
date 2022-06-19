package Class4;

import Web.MyDriver;
import org.openqa.selenium.By;
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
        MyDriver.launchUrlOnNewWindow("https://facebook.com/");

        MyDriver.getDriver().findElement(By.linkText("Messenger")).click();

        //MyDriver.pause(5);

       // Misc.getDriver().findElement(By.xpath("//label[@class='uiInputLabelInput']")).isSelected();
        boolean keepMeSignedInCheckBoxNotSelected =  MyDriver.getDriver().findElement(By.xpath("//label[@class='uiInputLabelInput']")).isSelected();
        Assert.assertFalse(keepMeSignedInCheckBoxNotSelected, "keep me signed in is selected");

        MyDriver.quitWindows();

    }
    @Test
    public void VerifyIncorrectEmailOrPhoneNumberIsDisplyed () {
        MyDriver.launchUrlOnNewWindow("https://facebook.com/");

        MyDriver.getDriver().findElement(By.linkText("Messenger")).click();
        //MyDriver.pause(5);

        MyDriver.getDriver().findElement(By.xpath("//button[@id='loginbutton']")).click();
        //MyDriver.pause(5);

        //Misc.getDriver().findElement(By.xpath("//div[text()='Incorrect email or phone number']")).isDisplayed();
        boolean incorrectEmailOrPhoneNumberIsDisplayed =  MyDriver.getDriver().findElement(By.xpath("//div[text()='Incorrect email or phone number']")).isDisplayed();
        Assert.assertTrue(incorrectEmailOrPhoneNumberIsDisplayed, "incorrect email or phone number message not displayed");

        MyDriver.quitWindows();
    }
    @Test
    public void VerifyContinueBtnIsEnabled () {
        MyDriver.launchUrlOnNewWindow("https://facebook.com");

        MyDriver.getDriver().findElement(By.linkText("Messenger")).click();

        //MyDriver.pause(5);

        MyDriver.getDriver().findElement(By.xpath("//button[@id='loginbutton']")).click();

        //MyDriver.pause(5);

        //Misc.getDriver().findElement(By.xpath("//button[@name='login']")).isEnabled();
        boolean continueBtnIsEnabled = MyDriver.getDriver().findElement(By.xpath("//button[@name='login']")).isEnabled();
        Assert.assertTrue(continueBtnIsEnabled);

        MyDriver.quitWindows();

    }






}
