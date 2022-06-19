package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignIn_FeedbackPage extends Commands {

    JavascriptExecutor js = (JavascriptExecutor) MyDriver.getDriver();

    By feedBackBtn = By.xpath("//div[contains(@style,'menu-off')]//div[@class='uitk-list']//a[@target='_blank']");
    By submitBtn = By.xpath("//button[@id='submit-button']");
    By errorText = By.xpath("//p[text()='Please fill in the required information highlighted below.']");
    By dottedError = By.xpath("//fieldset[@style='padding: 5px; border: 2px dotted rgb(204, 0, 0);']");

    public void clickFeedBackBtn() {
        MyDriver.getDriver().findElement(feedBackBtn).click();
        switchToCurrentWindow();
    }

    public void clickSubmitBtn() {
        js.executeScript("scrollBy(0,200)");
        MyDriver.getDriver().findElement(submitBtn).click();
    }

    public void verifyErrorTextDisplayed() {
        String errorTextDisplayed = MyDriver.getDriver().findElement(errorText).getText();
        System.out.println(errorTextDisplayed);
        Assert.assertEquals(errorTextDisplayed, "Please fill in the required information highlighted below.", "error text not displayed");
    }

    @Test
    public void verifyPageRatingIsDotted() {
        String dotted = MyDriver.getDriver().findElement(dottedError).getAttribute("style");
        String[] split = dotted.split(" ");
        String isDotted = "false";
        for (String word : split)
            if (word.equals("dotted"))
                isDotted="true";
        System.out.println(isDotted);
        Assert.assertEquals(isDotted,"true","page rating is not dotted");
    }
}







