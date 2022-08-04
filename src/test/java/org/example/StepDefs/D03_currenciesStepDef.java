package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();
    @Given("user go to Home Page")
    public void step1(){
        homePage.goToHomePage();
    }
    @When("user select euro currency from the dropdown list on the top left of home page")
    public void step2(){
        homePage.EuroCurrency().click();
    }
    @Then("the products in home page is displayed in Euro Currency")
    public void step3(){
        String[] priceVariables= new String[4];
        for (int i =0; i<homePage.PriceElements().size();i++) {
            priceVariables[i] = homePage.PriceElements().get(i).getText();
            // i did hard assertion here because it is what written in the requirements
            Assert.assertTrue(priceVariables[i].contains("€"));
            System.out.println(priceVariables[i]);
        }
    }
}
