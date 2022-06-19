package StepDefinition.Hotels;


import Pages.Commands;
import Pages.Hotels.SignInPages;
import Pages.Hotels.SignIn_FeedbackPage;
import io.cucumber.java.en.Then;

public class SignIn_FeedbackSD extends Commands {
    SignInPages signIn = new SignInPages();
    SignIn_FeedbackPage sFeedback = new SignIn_FeedbackPage();

    @Then("I click on the sign in button")
    public void clickSignInBtn() {
        signIn.clickSignInBtn();
    }
    @Then("I click on the feedback button")
    public void ClickFeedBackBtn() {
        sFeedback.clickFeedBackBtn();
    }
    @Then("I click on the submit button")
    public void clickSubmitBtn() {
        sFeedback.clickSubmitBtn();}
    @Then("I verify error text is displayed2")
    public void verifyErrorTextDisplayed() {
        sFeedback.verifyErrorTextDisplayed();
    }
    @Then("I verify Page Rating is red dotted")
    public void VerifyPageRatingIsDotted() {
        sFeedback.verifyPageRatingIsDotted();
    }


}
