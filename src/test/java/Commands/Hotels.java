package Commands;

import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Hotels extends Commands {
    JavascriptExecutor js = (JavascriptExecutor) MyDriver.getDriver();
    By addChildrenBtn = By.xpath("(//div[contains(@class,'controls')]//button)[4]");
    By addAdultBtn = By.xpath("(//div[contains(@class,'controls')]//button)[2]");
    By travelersBtn = By.xpath("//div[contains(@class,'span-large-3')]");
    By doneBtn = By.xpath("//button[text()='Done']");
    By child1AgeTab = By.xpath("//select[@id='child-age-input-0-0']");
    By child2AgeDDSel2 = By.xpath("//select[@id='child-age-input-0-0']//option[@value='2']");
    By child2AgeTab = By.xpath("//select[@id='child-age-input-0-1']");
    By child2AgeDDSelUnder1 = By.xpath("//select[@id='child-age-input-0-1']//option[@value='0']");
    By signInHomePageBtn = By.xpath("//button[text()='Sign in']");
    By feedBackBtn = By.xpath("//div[contains(@style,'menu-off')]//div[@class='uitk-list']//a[@target='_blank']");
    By submitBtn = By.xpath("//button[@id='submit-button']");
    By goingToBox = By.xpath("//div[@class='uitk-typeahead']");
    By whereAreYouGoingBox = By.id("location-field-destination");
    By boraBora = By.xpath("(//button[contains(@aria-label,'Bora Bora Lee')])");
    By checkInBox = By.xpath("//button[@id='d1-btn']");
    By nextMonthArrowBtn = By.xpath("(//div[contains(@class,'n uitk-date-picker')]//button)[2]");
    By aug1_2022 = By.xpath("//button[contains(@aria-label,'Aug 1, 2022')]");
    By aug10_2022 = By.xpath("//button[contains(@aria-label,'Aug 10, 2022')]");
    By doneBtn2 = By.xpath("//button[contains(@class,'g-done')]");
    By searchBtn = By.xpath("//button[text()='Search']");
    By howCanWeImproveOurSite = By.xpath("//span[text()='Tell us how we can improve our site']");
    By shareFeedbackBtn = By.xpath("//a[text()='Share feedback']");
    By signUp = By.xpath("//a[contains(@data-stid,'signup')]");
    By termsAndConditionsBtn = By.xpath("//a[text()='Terms and Conditions']");
    By privacyStatementBtn = By.xpath("//a[text()='Privacy Statement']");
    By termsAndConditionsHeading = By.xpath("//h1[text()='Terms and Conditions']");
    By privacyStatementHeading = By.xpath("//h2[text()='Privacy Statement']");
    By signInDDBtn = By.xpath("//a[text()='Sign in']");
    By emailBox = By.xpath("//input[@type='email']");
    By passwordBox = By.xpath("//input[@type='password']");
    By signInBtnDD2 = By.xpath("//button[@type='submit']");
    By tryAgainErrorTextDD2 = By.xpath("//h3[contains(@class,'error-summary')]");

    public void launchHotelsPage() {
        MyDriver.launchUrlOnNewWindow("https://hotels.com/");
        MyDriver.getDriver().manage().window().fullscreen();
        String parentWindow = MyDriver.getDriver().getWindowHandle();
        System.out.println("parentWindow = " + parentWindow);
    }

    public void clickOnTravelersBtn() {
        ;
        MyDriver.getDriver().findElement(travelersBtn).click();
    }

    public void clickChild1AgeTab() {
        MyDriver.getDriver().findElement(child1AgeTab).click();
    }

    public void clickChild2Age2() {
        MyDriver.getDriver().findElement(child2AgeDDSel2).click();
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

    public void clickSignInBtn() {
        MyDriver.getDriver().findElement(signInHomePageBtn).click();
    }

    public void clickFeedBackBtn() {
        //MyDriver.pause(5);
        MyDriver.getDriver().findElement(feedBackBtn).click();
        switchToCurrentWindow();
    }

    public void click() {
        switchToCurrentWindow();
        //MyDriver.pause(5);
    }

    public void switchToCurrentWindow() {
        for (String winHandle : MyDriver.getDriver().getWindowHandles()) {
            MyDriver.getDriver().switchTo().window(winHandle);
        }
    }

   // public void scrollToElement(By locator) {
   //     for (int i = 0; i <= 15; i++) {
   //         try {
   //             MyDriver.getDriver().findElement(locator);
   //            break;
   //         } catch (ElementClickInterceptedException | NoSuchElementException e) {
   //             JavascriptExecutor js = (JavascriptExecutor) MyDriver.getDriver();
   //             js.executeScript("scrollBy(0,100)");
   //         }
   //     }
   // }

    public void clickSubmitBtn() {
        //switchToCurrentWindow();
        js.executeScript("scrollBy(0,200)");
        //MyDriver.pause(5);
        MyDriver.getDriver().findElement(submitBtn).click();
    }

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
        //MyDriver.pause(5);
        MyDriver.getDriver().findElement(boraBora).click();
    }

    public void clickOnCheckInBox() {
        MyDriver.getDriver().findElement(checkInBox).click();
    }

    public void clickNextMonthArrowBnt() {
        //MyDriver.pause(5);
        MyDriver.getDriver().findElement(nextMonthArrowBtn).click();
        ;
    }

    public void clickAug1() {
        //MyDriver.pause(5);
        MyDriver.getDriver().findElement(aug1_2022).click();
    }

    public void clickAug10() {
        //MyDriver.pause(5);
        MyDriver.getDriver().findElement(aug10_2022).click();
    }

    public void clickDoneBtn2() {
        //MyDriver.pause(5);
        MyDriver.getDriver().findElement(doneBtn2).click();
    }

    public void clickSearchBtn() {
        MyDriver.getDriver().findElement(searchBtn).click();
    }

    public void scrollToElementView() {
        js.executeScript("arguments[0].scrollIntoView(true);", MyDriver.getDriver().findElement(howCanWeImproveOurSite));
        //MyDriver.pause(5);
    }

    public void verifyTextIsDisplayed() {
        boolean textIsDisplayed = MyDriver.getDriver().findElement(howCanWeImproveOurSite).isDisplayed();
        Assert.assertTrue(textIsDisplayed, "text is not displayed");
    }

    public void verifyShareFeedbackBtnDisplayed() {
        //MyDriver.pause(5);
        boolean shareFeedbackBtnDisplayed = MyDriver.getDriver().findElement(shareFeedbackBtn).isDisplayed();
        Assert.assertTrue(shareFeedbackBtnDisplayed, "Shared feedback button not displayed");
    }

    public void verifyShareFeedbackBtnEnabled() {
        boolean shareFeedbackBtnEnabled = MyDriver.getDriver().findElement(shareFeedbackBtn).isEnabled();
        Assert.assertTrue(shareFeedbackBtnEnabled, "Shared feedback button not enabled");
    }

    public void clickSignUpBtn() {
        //MyDriver.pause(5);
        MyDriver.getDriver().findElement(signUp).click();
    }

    public void clickTermsAndConditionsLink() {
        MyDriver.getDriver().findElement(termsAndConditionsBtn).click();
        switchToCurrentWindow();
        String currentWindow = MyDriver.getDriver().getWindowHandle();
        System.out.println("currentWindow = " + currentWindow);
    }

    public void clickPrivacyStatementLink() {
        MyDriver.getDriver().findElement(privacyStatementBtn).click();
        switchToCurrentWindow();
        String currentWindow = MyDriver.getDriver().getWindowHandle();
        System.out.println("currentWindow = " + currentWindow);
    }

    public void verifyTermAndConditionsPage() {
        String pageHeading = MyDriver.getDriver().findElement(termsAndConditionsHeading).getText();
        System.out.println(pageHeading);
        Assert.assertEquals(pageHeading, "Terms and Conditions", "Incorrect page");
    }

    public void verifyPrivacyStatementsPage() {
        String pageHeading = MyDriver.getDriver().findElement(privacyStatementHeading).getText();
        System.out.println(pageHeading);
        Assert.assertEquals(pageHeading, "Privacy Statement", "Incorrect page");
    }

    public void clickSignInDD() {
       //MyDriver.pause(5);
        MyDriver.getDriver().findElement(signInDDBtn).click();
    }
    @Test
    public void emailBoxInput() {
        MyDriver.getDriver().findElement(emailBox).sendKeys("abcd@abcd.com");
    }
    public void passwordInput() {
        MyDriver.getDriver().findElement(passwordBox).sendKeys("abcd");
    }
    public void clickSignInDD2() {
        MyDriver.getDriver().findElement(signInBtnDD2).click();
    }public void verifyTryAgainTextIsDisplayed() {
        //MyDriver.pause(5);
        String tryAgainErrorText = MyDriver.getDriver().findElement(tryAgainErrorTextDD2).getText();
        System.out.println(tryAgainErrorText);
        Assert.assertEquals(tryAgainErrorText,"Email and password don't match. Try again.","Error text not displayed correctly");

    }





}

