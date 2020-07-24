package com.bitrix24.step_definitions;

import com.bitrix24.pages.LoginPage;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    LoginPage loginPage=new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page()  {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
      loginPage.enterUsername();
      loginPage.enterPassword();
    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
       loginPage.clickLogin();
    }

}
