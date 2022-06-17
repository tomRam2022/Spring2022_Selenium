package StepDefinition.Hotels;

import Commands.Hotels;
import io.cucumber.java.en.Then;

public class FeedbackSD {
    Hotels hhh = new Hotels();

    @Then("I click on the sign in button")
    public void clickSignInBtn() {
        hhh.clickSignInBtn();
    }
    @Then("I click on the feedback button")
    public void ClickFeedBackBtn() {
        hhh.clickFeedBackBtn();
    }
    @Then("I click on the submit button")
    public void clickSubmitBtn() {
        hhh.clickSubmitBtn();}

}
