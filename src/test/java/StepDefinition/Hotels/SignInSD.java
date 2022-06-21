package StepDefinition.Hotels;



import Pages.Hotels.LandingPage;
import Pages.Hotels.SignInPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;

public class SignInSD {

    SignInPages signIn = new SignInPages();

    @Then("I click on the sign in button DD")
    public void clickSignInBtnDD() {
        signIn.clickSignInDD();
    }
    @Then("I enter abcd@abcd.com as email")
    public void enterEmail() {
        signIn.emailBoxInput();
    }
    @Given("I enter .+ as password")
    public void enterPassword() {
        signIn.passwordInput();
    }
    @Then("I click on the sign in button from DD2")
    public void clickSignInDD2() {
        signIn.clickSignInDD2();
    }
    @Then("I verify error text is displayed")
    public void verifyErrorTextDisplayed() {
        signIn.verifyTryAgainTextIsDisplayed();
    }





}
