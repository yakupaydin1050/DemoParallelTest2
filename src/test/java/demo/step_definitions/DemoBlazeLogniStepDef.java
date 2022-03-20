package demo.step_definitions;

import demo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoBlazeLogniStepDef {

    @Given("go to demo blaze home page")
    public void goToDemoBlazeHomePage() {

        Driver.get().get("https://www.demoblaze.com/index.html");
    }


    @And("login the demo blaze home page {string} {string}")
    public void loginTheDemoBlazeHomePage(String username, String password) {

        WebElement loginButton = Driver.get().findElement(By.id("login2"));
        loginButton.click();
        WebElement usernameField = Driver.get().findElement(By.id("loginusername"));
        usernameField.sendKeys(username);
        WebElement passwordField = Driver.get().findElement(By.id("loginpassword"));
        WebElement login = Driver.get().findElement(By.xpath("//button[contains(text(),'Log in')]"));
        login.click();

    }
}
