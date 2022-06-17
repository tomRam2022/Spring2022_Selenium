package StepDefinition.Hotels;

import Commands.Hotels;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;

public class SignInSD {
    Hotels hhh = new Hotels();
    @Then("I click on the sign in button DD")
    public void clickSignInBtnDD() {
        hhh.clickSignInDD();
    }

    @Then("I enter abcd@abcd.com as email address")
    public void enterEmail() {
        hhh.emailBoxInput();
    }
    @And("I enter abcd as password")
    public void enterPassword() {
        hhh.passwordInput();
    }
    @Then("I click on the sign in button from DD2")
    public void clickSignInDD2() {
        hhh.clickSignInDD2();
    }
    @Then("I verify error text is displayed")
    public void verifyErrorTextDisplayed() {
        hhh.verifyTryAgainTextIsDisplayed();
    }





}
