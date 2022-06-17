package StepDefinition.Facebook;

import io.cucumber.java.en.Given;

public class LoginSD {

    Facebook fff = new Facebook();

    @Given("I am on facebook landing page")
    public void launchFacebook() {
        fff.launchFacebook();
    }
}
