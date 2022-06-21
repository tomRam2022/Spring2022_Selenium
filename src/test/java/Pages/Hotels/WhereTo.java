package Pages.Hotels;

import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class WhereTo extends Commands {

    JavascriptExecutor js = (JavascriptExecutor) MyDriver.getDriver();

    By goingToBox = By.xpath("//button[@aria-label='Going to']");
    By whereAreYouGoingBox = By.xpath("//button[@aria-label='Going to']");
    By boraBora = By.xpath("(//button[contains(@aria-label,'Bora Bora Lee')])");
    By checkInBox = By.xpath("//button[@id='date_form_field-btn']");
    By nextMonthArrowBtn = By.xpath("(//div[contains(@class,'n uitk-date-picker')]//button)[2]");
    By aug1_2022 = By.xpath("//button[contains(@aria-label,'Aug 1, 2022')]");
    By aug10_2022 = By.xpath("//button[contains(@aria-label,'Aug 10, 2022')]");
    By doneBtn2 = By.xpath("//button[contains(@class,'g-done')]");
    By searchBtn = By.id("submit_button");
    By howCanWeImproveOurSite = By.xpath("//span[text()='Tell us how we can improve our site']");
    By shareFeedbackBtn = By.xpath("//a[text()='Share feedback']");
    By addChildrenBtn = By.xpath("(//div[contains(@class,'controls')]//button)[4]");
    By addAdultBtn = By.xpath("(//div[contains(@class,'controls')]//button)[2]");
    By travelersBtn = By.xpath("(//div[contains(@class,'uitk-menu-mounted')])[5]");
    By doneBtn = By.xpath("//button[text()='Done']");
    By child1AgeTab = By.xpath("//select[contains(@name,'-0-0')]");
    By child1AgeDDSel2 = By.xpath("//select[contains(@name,'-0-0')]//option[@value='2']");
    By child2AgeTab = By.xpath("//select[contains(@name,'-0-1')]");
    By child2AgeDDSelUnder1 = By.xpath("//select[contains(@name,'-0-1')]//option[@value='0']");







    public void clickGoingToBox() {
        MyDriver.getDriver().findElement(goingToBox).click();
    }

    public void clickWhereAreYouGoingBox() {
        MyDriver.getDriver().findElement(whereAreYouGoingBox).click();
    }

    public void whereAreYouGoingInput() {
        MyDriver.getDriver().findElement(whereAreYouGoingBox).sendKeys("bora bora");
    }

    public void clickOnBoraBoraResult() {
        MyDriver.getDriver().findElement(boraBora).click();
    }

    public void clickOnCheckInBox() {
        MyDriver.getDriver().findElement(checkInBox).click();
    }

    public void clickNextMonthArrowBnt() {
        MyDriver.getDriver().findElement(nextMonthArrowBtn).click();
        ;
    }

    public void clickAug1() {
        MyDriver.getDriver().findElement(aug1_2022).click();
    }

    public void clickAug10() {
        MyDriver.getDriver().findElement(aug10_2022).click();
    }

    public void clickDoneBtn2() {
        MyDriver.getDriver().findElement(doneBtn2).click();
    }

    public void clickSearchBtn() {
        MyDriver.getDriver().findElement(searchBtn).click();
    }

    public void scrollToElementView() {
        js.executeScript("arguments[0].scrollIntoView(true);", MyDriver.getDriver().findElement(howCanWeImproveOurSite));

    }

    public void verifyTextIsDisplayed() {
        boolean textIsDisplayed = MyDriver.getDriver().findElement(howCanWeImproveOurSite).isDisplayed();
        Assert.assertTrue(textIsDisplayed, "text is not displayed");
    }

    public void verifyShareFeedbackBtnDisplayed() {;
        boolean shareFeedbackBtnDisplayed = MyDriver.getDriver().findElement(shareFeedbackBtn).isDisplayed();
        Assert.assertTrue(shareFeedbackBtnDisplayed, "Shared feedback button not displayed");
    }

    public void verifyShareFeedbackBtnEnabled() {
        boolean shareFeedbackBtnEnabled = MyDriver.getDriver().findElement(shareFeedbackBtn).isEnabled();
        Assert.assertTrue(shareFeedbackBtnEnabled, "Shared feedback button not enabled");
    }
    public void clickOnTravelersBtn() {
        ;
        MyDriver.getDriver().findElement(travelersBtn).click();
    }

    public void clickChild1AgeTab() {
        MyDriver.getDriver().findElement(child1AgeTab).click();
    }

    public void clickChild2Age2() {
        MyDriver.getDriver().findElement(child1AgeDDSel2).click();
    }

    public void clickChild2AgeTab() {
        MyDriver.getDriver().findElement(child2AgeTab).click();
    }

    public void clickChild2AgeUnder1() {
        MyDriver.getDriver().findElement(child2AgeDDSelUnder1).click();
    }

    public void clickDoneBtn() {
        MyDriver.getDriver().findElement(doneBtn).click();
    }

    public void clickAddChildNUmTimes() {
        for (int i = 0; i < 2; ++i) {
            MyDriver.getDriver().findElement(addChildrenBtn).click();
        }
    }

    public void clickAddAdultNUmTimes() {
        for (int i = 0; i < 4; ++i) {
            MyDriver.getDriver().findElement(addAdultBtn).click();
        }
    }
    public void verifyNumOfTravelersIsCorrect() {
        String travelersText = MyDriver.getDriver().findElement(By.xpath("((//div[contains(@class,'uitk-menu-mounted')])[5]//div//input)[1]")).getAttribute("value");
        String[] travelersTextSplit = travelersText.split(" ");
        int numOfTravelers = Integer.parseInt(travelersTextSplit[0]);
        Assert.assertEquals(numOfTravelers,8,"number of travelers is incorrect");
        System.out.println(numOfTravelers);
    }
}
