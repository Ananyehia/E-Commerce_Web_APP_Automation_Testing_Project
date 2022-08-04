package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_Register;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_RegisterStepDef {
    P01_Register register = new P01_Register();
    @Given("user go to register page")
    public void step1(){
        register.RegisterOrder().click();
    }
    @When("user select gender type")
    public void step2(){
        register.GenderFemale().click();
    }
    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void step3(String FirstName, String LastName){
        register.FirstName().sendKeys(FirstName);
        register.LastName().sendKeys(LastName);
    }
    @And("user enter date of birth")
    public void step4(){
        register.DateOfBirthDay().click();
        register.DateOfBirthMonth().click();
        register.DateOfBirthYear().click();
    }
    @And("^user enter email \"(.*)\" field$")
    public void step5(String email){
        register.Email().sendKeys(email);
    }
    @And("^user fills Password fields \"(.*)\" \"(.*)\"$")
    public void step6(String password, String confirmedPassword){
        register.password().sendKeys(password);
        register.confirmedPassword().sendKeys(confirmedPassword);

    }
    @And("user clicks on register button")
    public void step7(){
        register.registerButton().click();
    }
    @Then("success message is displayed")
    public void step8(){
        SoftAssert soft = new SoftAssert();
        soft.assertEquals( register.successMessage() ,register.expectedResult);
        soft.assertEquals(register.successMessageColor(),register.expectedResultColor);
        soft.assertAll();
//        System.out.println(register.successMessage());//there is no background-color in this message
//        System.out.println(register.successMessageColor());
    }
}
//ANAN
//yehia
//ANAN@example.com
//anan5656