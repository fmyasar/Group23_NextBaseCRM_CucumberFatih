package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.Logout;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDef {

    LoginPage loginPage= new LoginPage();
    Logout logout= new Logout();

    @Given("The user is on the homepage")
    public void the_user_is_on_the_homepage() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.login("hr1@cybertekschool.com","UserUser");
        BrowserUtils.waitFor(2);
    }

    @When("The user clicks the profile")

    public void the_user_clicks_the_profile() {
        logout.userBlock.click();
        BrowserUtils.waitFor(2);
    }
    @When("The user clicks the Logout button")
    public void the_user_clicks_the_Logout_button() {

        logout.logoutButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("The user lands in login page")
    public void the_user_lands_in_login_page() {
        Assert.assertTrue(Driver.get().getTitle().contains("Authorization"));
    }

}
