package demo.step_definitions;

import demo.utilities.Driver;
import io.cucumber.java.en.Given;

public class HomePageStepDefs {

    @Given("go to the home page")
    public void go_to_the_home_page() {

        Driver.get().get("https:www.youtube.com");

    }


}
