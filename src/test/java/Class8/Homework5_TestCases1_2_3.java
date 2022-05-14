package Class8;

import Commands.DarkSky;
import Commands.Facebook;
import Helper.Misc;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class Homework5_TestCases1_2_3 {

    /**
     * darksky.net
     * Verify the current date is highlighted in Time Machine's calendar
     */

    @Test
    public void verifyCurrentDateIsHighlightedTM () {

        DarkSky.launchDark();

        Misc.JavaScriptExecute("scrollBy(0,700)");

        Misc.pause(5);

        Misc.getDriver().findElement(By.xpath("(//div[@class='buttonContainer'])//a[@class='button']")).click();

        String dayCurrentlySelected = Misc.getDriver().findElement(By.xpath("(//table[@class='pika-table'])//td[@class='is-today']")).getText();

        String currentDate = Misc.CurrentFormattedDateStlye("d");

        System.out.println(dayCurrentlySelected);

        System.out.println(Misc.CurrentFormattedDateStlye("d"));

        Assert.assertEquals(dayCurrentlySelected,currentDate,"Current date not highlighted");

        Misc.quitWindows();
    }
    /**
     * darksky.net
     * Verify same values are displayed in the Today's data
     */
    @Test
    public void verifySameValTodaysDate () {
        DarkSky.launchDark();

        Misc.JavaScriptExecute("scrollBy(0,200)");

        Misc.getDriver().findElement(By.xpath("(//span[@class='skycon'])[1]")).click();

        String todayMinTemp = Misc.getDriver().findElement(By.xpath("((//span[@class='tempRange'])[1])//span[@class='minTemp']")).getText().replaceAll("\\D+","");

        String todayMaxTemp = Misc.getDriver().findElement(By.xpath("((//span[@class='tempRange'])[1])//span[@class='maxTemp']")).getText().replaceAll("\\D+","");

        System.out.println(todayMinTemp);

        System.out.println(todayMaxTemp);

        String todaySwipMinTemp = Misc.getDriver().findElement(By.xpath("(//span[@class='highTemp swip']//span[@class='temp'])[1]")).getText().replaceAll("\\D+","");

        String todaySwipMaxTemp = Misc.getDriver().findElement(By.xpath("(//span[@class='lowTemp swap']//span[@class='temp'])[1]")).getText().replaceAll("\\D+","");

        System.out.println(todaySwipMinTemp);

        System.out.println(todaySwipMaxTemp);

        Assert.assertEquals(todayMinTemp,todaySwipMinTemp,"Min temp. data not the same value");

        Assert.assertEquals(todayMaxTemp,todaySwipMaxTemp,"Min temp. data not the same value");
    }
    /**
     * facebook.com/
     * Launch facebook.com
     * Click on Facebook Pay, Oculus, Instagram, Portal and Bulletin
     * Close ALL windows except Instagram
     * Verify number of window-Handles is 1
     * Verify Page Title is Instagram
     * Verify Log in button on Instagram is disabled by default
     */
    @Test
    public void verifyStuff () {

        Facebook.launchFacebook();
        Misc.pause(2);
        System.out.println("parent ->" + Misc.getDriver().getWindowHandle());
        String parent = Misc.getDriver().getWindowHandle();

        Misc.getDriver().findElement(By.linkText("Facebook Pay")).click();
        Misc.pause(2);

        Misc.getDriver().findElement(By.linkText("Oculus")).click();
        Misc.pause(2);

        Misc.getDriver().findElement(By.linkText("Instagram")).click();
        Misc.pause(2);

        Misc.getDriver().findElement(By.linkText("Portal")).click();
        Misc.pause(2);

        Misc.getDriver().findElement(By.linkText("Bulletin")).click();
        Misc.pause(2);

        Set<String> winHandles = Misc.getDriver().getWindowHandles();
        System.out.println(winHandles);

        System.out.println("Istagram ->" + Misc.getWinHandle("Instagram",winHandles));
        String win2 = Misc.getWinHandle("Instagram",winHandles);

        Misc.switchWin(win2);
        System.out.println(Misc.getDriver().getTitle());
        Misc.pause(5);
        System.out.println(Misc.getDriver().getWindowHandle());
        Misc.closeAllExept(win2,winHandles);
        Misc.pause(5);
        winHandles = Misc.getDriver().getWindowHandles();
        int numOfWinOpen = winHandles.size();
        System.out.println(numOfWinOpen);
        Misc.switchWin(win2);
        String currWinTitle = Misc.getDriver().getTitle();
        System.out.println(currWinTitle);

        Boolean isEnabled = Misc.getDriver().findElement(By.xpath("(//button[@type='button'])[1]")).isEnabled();
        System.out.println("log in button is enabled -> " + isEnabled);

        Assert.assertEquals(numOfWinOpen,1,"more than 1 window is open");
        Assert.assertEquals(currWinTitle,"Instagram","current window title page is not Instagram");
        Assert.assertTrue(isEnabled,"login butoon is not enabled");












    }








}
