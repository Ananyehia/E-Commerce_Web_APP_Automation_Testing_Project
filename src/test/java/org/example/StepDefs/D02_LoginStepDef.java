package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_LoginStepDef {
    P02_Login login = new P02_Login();

    @Given("user go to login page")
    public void Step1(){
        login.goToLoginPage().click();
    }
    @When("^user login with \"(.*)\" \"(.*)\" and \"(.*)\"$")
    public void step2(String type, String email, String password){
        login.EmailField().sendKeys(email);
        login.PasswordField().sendKeys(password);
        System.out.println("user login with " + type +" Data");
        System.out.println(email);
        System.out.println(password);
    }
    @And("user press on login button")
    public void step3(){
        login.loginButton().click();
    }
    @Then("user login to the system successfully")
    public void step_4_valid(){
        SoftAssert soft = new SoftAssert();
        String actualCurrentURL = Hooks.driver.getCurrentUrl();
        soft.assertEquals(actualCurrentURL,login.expectedURL);
        soft.assertTrue(login.myAccountTab().isDisplayed());
        soft.assertAll();
    }
    @Then("user could not login to the system")
    public void step_4_invalid(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(login.actualErrorMessage().contains(login.expectedErrorMessage));
        System.out.println(login.actualErrorMessageColor());
        System.out.println( Color.fromString(login.actualErrorMessageColor()).asHex());
        String actualErrorMessageColor = Color.fromString(login.actualErrorMessageColor()).asHex();
        soft.assertEquals(actualErrorMessageColor, login.expectedErrorMessageColor);
        soft.assertAll();
    }

}
