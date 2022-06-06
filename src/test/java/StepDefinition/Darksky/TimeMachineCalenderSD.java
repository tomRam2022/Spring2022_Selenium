package StepDefinition.Darksky;

import Commands.DarkSky;
import Helper.Misc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TimeMachineCalenderSD {

    DarkSky dsp = new DarkSky();


    @Given("I am on darksky landing page")
    public void openDarksky() {
       dsp.launchDark();
    }
    @When("I scroll down the landing page")
    public void scrollDown() {
        dsp.scrollDown();
    }
    @And("I click on time machine button")
    public void clickONTimeMachineButton() {
        dsp.clickOnTimeMachineButton();
    }
    @Then("I verify current date is selected on calender by default")
    public void VerifyCurrentDateIsSelectedByDefault() {
        Assert.assertTrue(dsp.verifyCurrentDateIsSelectedByDefault(),"current date Not selected by default");
    }


}
