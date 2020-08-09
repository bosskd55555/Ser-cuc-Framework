package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import steps.LoginSteps;

public class LoginPageBDD {

    @Steps
    LoginSteps LoginSteps;

    @Given("^As a user should be able to launch the application$")
    public void user_opens_the_URL() throws Exception {

        LoginSteps.launchTheUrl();

    }

    @When("user entering the username and password")
    public void user_enters_username_and_password() throws Exception {

        LoginSteps.enteringTheCredentials();
    }

   

}
