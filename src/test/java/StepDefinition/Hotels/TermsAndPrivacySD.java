package StepDefinition.Hotels;


import Pages.Commands;
import Pages.Hotels.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TermsAndPrivacySD extends Commands {
    SignUpPage signUp = new SignUpPage();

    @Then("I click on the sign up button")
    public void clickSignUpBtn() {
        signUp.clickSignUpBtn();
    }
    @Then("I click on the Terms and Conditions link")
    public void clickTermsAndConditions() {
        signUp.clickTermsAndConditionsLink();
    }
    @Then("I click on the Privacy and Statements link")
    public void clickPrivacyStatement() {
        signUp.clickPrivacyStatementLink();
    }
    @Then("I verify Terms and Conditions page opens in new tab")
    public void verifyTermsAndConditionsPage() {
        signUp.verifyTermAndConditionsPage();
    }
    @Then("I verify Privacy Statements page opens in new tab")
    public void verifyPrivacyStatementPage() {
        signUp.verifyPrivacyStatementsPage();

    }



}
