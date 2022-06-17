package StepDefinition.Hotels;

import Commands.Hotels;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

    public class SearchStaysSD {
        Hotels hhh = new Hotels();

        public SearchStaysSD() {
        }

        @And("I click on going to box")
        public void clickGoingToBox() {
            this.hhh.clickGoingToBox();
        }

        @And("I enter Bora Bora in the going to box")
        public void enterLocationInGoingToBox() {
            this.hhh.whereAreYouGoingInput();
        }

        @And("I select Bora Bora, Leeward Islands, French Polynesia from auto suggestion")
        public void clickBoraBoraResult() {
            this.hhh.clickOnBoraBoraResult();
        }

        @Then("I click on check-in box")
        public void clickOnCheckInBox() {
            this.hhh.clickOnCheckInBox();
        }

        @And("I click on next month arrow icon")
        public void clickNextMonthArrow() {
            this.hhh.clickNextMonthArrowBnt();
        }

        @And("I click on August 1 2022 as check-in date")
        public void clickonAug1() {
            this.hhh.clickAug1();
        }

        @And("I click on August 10 2022 as check-out date")
        public void clickonAug10() {
            this.hhh.clickAug10();
        }

        @And("I click on done")
        public void clickDoneBtn2() {
            this.hhh.clickDoneBtn2();
        }

        @Then("I click on the search button")
        public void clickSearchBtn() {
            this.hhh.clickSearchBtn();
        }

        @Then("I scroll down to the end of search results")
        public void scrollTo() {
            this.hhh.scrollToElementView();
        }

        @Then("I verify text \"Tell us how we can improve our site\" is displayed")
        public void verifyTextIsDisplyed() {
            this.hhh.verifyTextIsDisplayed();
        }

        @Then("I verify Share feedback button is displayed")
        public void verifyShareFeedbackBtnDisplayed() {
            this.hhh.verifyShareFeedbackBtnDisplayed();
        }

        @Then("I verify Share feedback button is enabled")
        public void verifyShareFeedbackBtnEnabled() {
            this.hhh.verifyShareFeedbackBtnEnabled();
        }
    }


