package Commands;

import Helper.Misc;
import io.cucumber.java.en.Given;


public class Facebook {

    @Given("I am on facebook landing page")
    public void launchFacebook () {
        Misc.launchUrlOnNewWindow("https://facebook.com/");


    }
}
