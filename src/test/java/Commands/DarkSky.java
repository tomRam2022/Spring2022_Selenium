package Commands;

import Helper.Misc;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DarkSky {



    public void launchDark () {
        Misc.launchUrlOnNewWindow("https://darksky.net/");
    }
    public void clickOnTimeMachineButton() {
        Misc.getDriver().findElement(By.xpath("(//div[@class='buttonContainer'])//a[@class='button']")).click();
    }
    public void scrollDown() {
        Misc.JavaScriptExecute("scrollBy(0,700)");
    }
    public boolean verifyCurrentDateIsSelectedByDefault() {
        String dayCurrentlySelected = Misc.getDriver().findElement(By.xpath("(//table[@class='pika-table'])//td[@class='is-today']")).getText();

        String currentDate = Misc.CurrentFormattedDateStlye("d");

        System.out.println(dayCurrentlySelected);

        System.out.println(Misc.CurrentFormattedDateStlye("d"));

        Assert.assertEquals(dayCurrentlySelected,currentDate,"Current date not highlighted");
        return false;
    }



}
