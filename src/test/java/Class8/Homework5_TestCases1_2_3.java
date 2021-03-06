package Class8;

import Helper.Misc;
import Web.MyDriver;
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

        MyDriver.launchUrlOnNewWindow("https://darksky.net/");

        Misc.JavaScriptExecute("scrollBy(0,900)");
        Misc.pause(5);

        MyDriver.getDriver().findElement(By.xpath("(//div[@class='buttonContainer'])//a[@class='button']")).click();

        String dayCurrentlySelected = MyDriver.getDriver().findElement(By.xpath("(//table[@class='pika-table'])//td[@class='is-today']")).getText();

        String currentDate = Misc.CurrentFormattedDateStlye("d");

        System.out.println(dayCurrentlySelected);

        System.out.println(Misc.CurrentFormattedDateStlye("d"));

        Assert.assertEquals(dayCurrentlySelected,currentDate,"Current date not highlighted");


        //Misc.quitWindows();
    }
    /**
     * darksky.net
     * Verify same values are displayed in the Today's data
     */
    @Test
    public void verifySameValTodaysDate () {
        MyDriver.launchUrlOnNewWindow("https://darksky.net/");
        Misc.JavaScriptExecute("scrollBy(0,400)");

        MyDriver.getDriver().findElement(By.xpath("(//span[@class='skycon'])[1]")).click();

        String todayMinTemp = MyDriver.getDriver().findElement(By.xpath("((//span[@class='tempRange'])[1])//span[@class='minTemp']")).getText().replaceAll("\\D+","");

        String todayMaxTemp = MyDriver.getDriver().findElement(By.xpath("((//span[@class='tempRange'])[1])//span[@class='maxTemp']")).getText().replaceAll("\\D+","");

        System.out.println(todayMinTemp);

        System.out.println(todayMaxTemp);

        String todaySwipMinTemp = MyDriver.getDriver().findElement(By.xpath("(//span[@class='highTemp swip']//span[@class='temp'])[1]")).getText().replaceAll("\\D+","");

        String todaySwipMaxTemp = MyDriver.getDriver().findElement(By.xpath("(//span[@class='lowTemp swap']//span[@class='temp'])[1]")).getText().replaceAll("\\D+","");

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

        //Facebook.launchFacebook();
        Misc.pause(2);
        System.out.println("parent ->" + MyDriver.getDriver().getWindowHandle());
        String parent = MyDriver.getDriver().getWindowHandle();

        MyDriver.getDriver().findElement(By.linkText("Facebook Pay")).click();
        //MyDriver.pause(2);

        MyDriver.getDriver().findElement(By.linkText("Oculus")).click();
        //MyDriver.pause(2);

        MyDriver.getDriver().findElement(By.linkText("Instagram")).click();
        //MyDriver.pause(2);

        MyDriver.getDriver().findElement(By.linkText("Portal")).click();
        //MyDriver.pause(2);

        MyDriver.getDriver().findElement(By.linkText("Bulletin")).click();
        //MyDriver.pause(2);

        Set<String> winHandles = MyDriver.getDriver().getWindowHandles();
        System.out.println(winHandles);

        System.out.println("Istagram ->" + Misc.getWinHandle("Instagram",winHandles));
        String win2 = Misc.getWinHandle("Instagram",winHandles);

        Misc.switchWin(win2);
        System.out.println(MyDriver.getDriver().getTitle());
        Misc.pause(5);
        System.out.println(MyDriver.getDriver().getWindowHandle());
        Misc.closeAllExept(win2,winHandles);
        Misc.pause(5);
        winHandles = MyDriver.getDriver().getWindowHandles();
        int numOfWinOpen = winHandles.size();
        System.out.println(numOfWinOpen);
        Misc.switchWin(win2);
        String currWinTitle = MyDriver.getDriver().getTitle();
        System.out.println(currWinTitle);

        Boolean isEnabled = MyDriver.getDriver().findElement(By.xpath("(//button[@type='button'])[1]")).isEnabled();
        System.out.println("log in button is enabled -> " + isEnabled);

        Assert.assertEquals(numOfWinOpen,1,"more than 1 window is open");
        Assert.assertEquals(currWinTitle,"Instagram","current window title page is not Instagram");
        Assert.assertTrue(isEnabled,"login butoon is not enabled");












    }








}
