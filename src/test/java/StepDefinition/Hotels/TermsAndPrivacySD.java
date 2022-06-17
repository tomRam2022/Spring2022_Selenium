package StepDefinition.Hotels;

import Commands.Hotels;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TermsAndPrivacySD {
    Hotels hhh = new Hotels();

    @Then("I click on the sign up button")
    public void clickSignUpBtn() {
        hhh.clickSignUpBtn();
    }
    @Then("I click on the Terms and Conditions link")
    public void clickTermsAndConditions() {
        hhh.clickTermsAndConditionsLink();
    }
    @Then("I click on the Privacy and Statements link")
    public void clickPrivacyStatement() {
        hhh.clickPrivacyStatementLink();
    }
    @Then("I verify Terms and Conditions page opens in new tab")
    public void verifyTermsAndConditionsPage() {
        hhh.verifyTermAndConditionsPage();
    }
    @Then("I verify Privacy Statements page opens in new tab")
    public void verifyPrivacyStatementPage() {
        hhh.verifyPrivacyStatementsPage();

    }



}
