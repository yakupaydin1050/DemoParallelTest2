package demo.step_definitions;

import demo.utilities.Driver;
import io.cucumber.java.en.Given;

public class GoogleHomePage {

    @Given("go to the google home page")
    public void goToTheGoogleHomePage() {
        Driver.get().get("https://www.google.com");
    }


}
