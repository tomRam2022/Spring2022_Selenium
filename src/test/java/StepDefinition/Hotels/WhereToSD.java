package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Commands;
import Pages.Hotels.LandingPage;
import Pages.Hotels.WhereTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WhereToSD extends Commands {
    WhereTo whereTo = new WhereTo();


    @Given("I am on Hotels landing page")
    public void openHotels() {
        launchHotelsPage();
    }
    @Then("I click on the travelers button")
    public void clickOnTravelersBtn() {
        whereTo.clickOnTravelersBtn();
    }
    @And("I click add adult button 4 times")
    public void clickAddAdultBtn() {
        whereTo.clickAddAdultNUmTimes();
    }
    @And("I click add children button 2 times")
    public void clickAddChildBtn() {
        whereTo.clickAddChildNUmTimes();
    }
    @Then("I click child 1 age tab")
    public void clickChild1AgeTab() {
        whereTo.clickChild1AgeTab();
    }
    @And("I select child 1 age from dropdown")
    public void selectChild1Age() {
        whereTo.clickChild2Age2();
    }
    @Then("I click child 2 age tab")
    public void clickChild2AgeTab() {
        whereTo.clickChild2AgeTab();
    }
    @And("I select child 2 age from dropdown")
    public void selectChild2Age() {
        whereTo.clickChild2AgeUnder1();
    }
    @And("I click on done button")
    public void clickDoneBtn() {
        whereTo.clickDoneBtn();
    }

    @And("I click on going to box")
    public void clickGoingToBox() {
        whereTo.clickGoingToBox();
    }

    @And("I enter Bora Bora in the going to box")
    public void enterLocationInGoingToBox() {
        whereTo.whereAreYouGoingInput();
    }

    @And("I select Bora Bora, Leeward Islands, French Polynesia from auto suggestion")
    public void clickBoraBoraResult() {
        whereTo.clickOnBoraBoraResult();
    }

    @Then("I click on check-in box")
    public void clickOnCheckInBox() {
        whereTo.clickOnCheckInBox();
    }

    @And("I click on next month arrow icon")
    public void clickNextMonthArrow() {
        whereTo.clickNextMonthArrowBnt();
    }

    @And("I click on August 1 2022 as check-in date")
    public void clickonAug1() {
        whereTo.clickAug1();
    }

    @And("I click on August 10 2022 as check-out date")
    public void clickonAug10() {
        whereTo.clickAug10();
    }

    @And("I click on done")
    public void clickDoneBtn2() {
        whereTo.clickDoneBtn2();
    }

    @Then("I click on the search button")
    public void clickSearchBtn() {
        whereTo.clickSearchBtn();
    }

    @Then("I scroll down to the end of search results")
    public void scrollTo() {
        Misc.scrollToElementView();
    }

    @Then("I verify text \"Tell us how we can improve our site\" is displayed")
    public void verifyTextIsDisplyed() {
        whereTo.verifyTextIsDisplayed();
    }

    @Then("I verify Share feedback button is displayed")
    public void verifyShareFeedbackBtnDisplayed() {
        whereTo.verifyShareFeedbackBtnDisplayed();
    }

    @Then("I verify Share feedback button is enabled")
    public void verifyShareFeedbackBtnEnabled() {
        whereTo.verifyShareFeedbackBtnEnabled();
    }
    @Then("I verify total number of guest is displayed correctly")
    public void verifyNumTravelersIsCorrect() {
        whereTo.verifyNumOfTravelersIsCorrect();
    }

}

