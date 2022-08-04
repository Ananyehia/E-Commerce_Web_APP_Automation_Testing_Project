package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_homePage homePage = new P03_homePage();
    SoftAssert soft = new SoftAssert();
    //step1 is already written in currencyStepDef Class
    @When("^user write (.*) in search field$")
    public void step2(String productName){
        homePage.searchField().sendKeys(productName);
    }

    @And("user click search button")
    public void step3() {
        homePage.searchButton().click();
    }

    @Then("user go to search results page")
    public void step4() {
        String expectedUrl ="https://demo.nopcommerce.com/search";
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains(expectedUrl));
        soft.assertAll();
    }
    @And("^user find that the search shows relevant results to the (.*)$")
    //  String[] priceVariables= new String[4];
    public void step5(String productName) {
        int countSearchResults = 0;
        for (int i =0; i<homePage.searchResults().size();i++) {
            System.out.println(homePage.searchResults().get(i).getText());
            System.out.println(homePage.searchResults().get(i).getText().toLowerCase());

            soft.assertTrue(homePage.searchResults().get(i).getText().toLowerCase().contains(productName));
            countSearchResults++;

        }
        System.out.println("Search Result Count: " + countSearchResults);
        soft.assertAll();
    }
    @When("^user search for Products by (.*)$")
    public void step_2(String sku){
        homePage.searchField().sendKeys(sku);

    }
    @Then("user find the searched product and open it")
    public void step_4() {
        homePage.skuSearchResult().click();
    }

    @And("^user find that the sku in the product page contains the (.*) that was used in search$")
    public void step_5(String sku) {
        Assert.assertTrue(homePage.skuLabel().getText().contains(sku));
    }
}
