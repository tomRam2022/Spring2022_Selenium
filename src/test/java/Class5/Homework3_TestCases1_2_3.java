package Class5;

import Helper.Misc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework3_TestCases1_2_3 {

        /**
     * TC-1:  darksky.net
     * Verify correct temperature value is displayed after changing temperature units
     */

        @Test
        public void verifyCorrTempValDisplyd () {
        Misc.launchUrlOnNewWindow("https://darksky.net/");

        String  temp = Misc.getDriver().findElement(By.xpath("//span[@class='summary swap']")).getAttribute("innerHTML").replaceAll("\\D+","");

        int tempF = Integer.valueOf(temp);

        int tempFToC = (int) Misc.fahToCelTemp(tempF);

        Misc.getDriver().findElement(By.xpath("(//div[@class='options']//div)[1]")).click();

        Misc.pause(5);

        Misc.getDriver().findElement(By.xpath("((//div[contains(@class,'selectric-open')])//li)[4]")).click();

        String  temp2 = Misc.getDriver().findElement(By.xpath("//span[@class='summary swap']")).getAttribute("innerHTML").replaceAll("\\D+","");

        int tempC = Integer.valueOf(temp2);

        Assert.assertEquals(tempC,tempFToC,"fahrenheit temp to celsius is incorrect");

        Misc.quitWindows();

}

        /**
         * TC-2: facebook.com
         * Verify current date is selected in the dropdown when user lands on the Create new account form
         */

        @Test
        public void verifyCurrentDateSelected () {

        Misc.launchUrlOnNewWindow("https://facebook.com/");

        Misc.getDriver().findElement(By.xpath("//a [@rel='async']")).click();

        Misc.pause(5);

        String monthCurrentlySelected = Misc.getDriver().findElement(By.xpath("(//select[@name='birthday_month'])//option[@selected=\"1\"]")).getAttribute("innerHTML");
        String dayCurrentlySelected = Misc.getDriver().findElement(By.xpath("(//select[@name='birthday_day'])//option[@selected=\"1\"]")).getAttribute("innerHTML");
        String yearCurrentlySelected = Misc.getDriver().findElement(By.xpath("(//select[@name='birthday_year'])//option[@selected=\"1\"]")).getAttribute("innerHTML");
        String dateCurrentlySelected = monthCurrentlySelected + " " + dayCurrentlySelected + " " + yearCurrentlySelected;
                System.out.println(dateCurrentlySelected);

                Date now = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("MMM d yyyy");
                String formattedDate = sdf.format(now);
                System.out.println(formattedDate);

                Assert.assertEquals(dateCurrentlySelected,formattedDate,"Current date not displayed correctly");

                Misc.quitWindows();
}
        /**
         * TC-3: https://classroomessentialsonline.com/
         * Verify user lands on Economy Church Chairs page after clicking the option from Church Chairs
         */

        @Test
        public void verifyUserLandsCorrectPage () {

            Misc.launchUrlOnNewWindow("https://classroomessentialsonline.com/");

            Misc.pause(5);

            WebElement churcChairs = Misc.getDriver().findElement(By.xpath("(//li[@class='navPages-item'])[1]"));

            Actions action = new Actions(Misc.getDriver());

            action.moveToElement(churcChairs).perform();

            Misc.pause(5);

            String tabSelected = Misc.getDriver().findElement(By.xpath("//li[contains(@class,'item-child')]//a[text()='Economy Church Chairs']")).getAttribute("innerHTML");

            Misc.getDriver().findElement(By.xpath("//li[contains(@class,'item-child')]//a[text()='Economy Church Chairs']")).click();

            boolean currentTabContainsEcoChurchChairs = Misc.getDriver().getTitle().contains(tabSelected);

            Assert.assertTrue(currentTabContainsEcoChurchChairs,"current tab does not contain Economy Church Chairs");

            Misc.quitWindows();
        }

}
