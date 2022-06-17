package StepDefinition.Hotels;

import Commands.Hotels;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TravelersSD {
    Hotels hhh = new Hotels();

    @Given("I am on Hotels landing page")
    public void openHotels() {
        hhh.launchHotelsPage();
    }
    @Then("I click on the travelers button")
    public void clickOnTravelersBtn() {
        hhh.clickOnTravelersBtn();
    }
    @And("I click add adult button 4 times")
    public void clickAddAdultBtn() {
        hhh.clickAddAdultNUmTimes();
    }
    @And("I click add children button 2 times")
    public void clickAddChildBtn() {
        hhh.clickAddChildNUmTimes();
    }
    @Then("I click child 1 age tab")
    public void clickChild1AgeTab() {
        //Misc.pause(5);
        hhh.clickChild1AgeTab();
    }
    @And("I select child 1 age from dropdown")
    public void selectChild1Age() {
        //Misc.pause(5);
        hhh.clickChild2Age2();
    }
    @Then("I click child 2 age tab")
    public void clickChild2AgeTab() {
        //Misc.pause(5);
        hhh.clickChild2AgeTab();
    }
    @And("I select child 2 age from dropdown")
    public void selectChild2Age() {
        //Misc.pause(5);
        hhh.clickChild2AgeUnder1();
    }
    @And("I click on done button")
    public void clickDoneBtn() {
        hhh.clickDoneBtn();
    }
}