package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D05_HoverCategoriesStepDef {
    P03_homePage homePage = new P03_homePage();
    Actions action = new Actions(Hooks.driver);
    String SubCategoryName = null;
    @When("user hover on one of the three main Categories")
    public void step2() throws InterruptedException {
        action.moveToElement(homePage.ComputerMainCat()).build().perform();
        Thread.sleep(1000);
    }

    @And("user select one of the three sub-Categories and get the text of it")
    public void step3(){
       SubCategoryName = homePage.DesktopSubCat().getText();
      // System.out.println(SubCategoryName);
       action.moveToElement(homePage.DesktopSubCat()).click().perform();
    }

    @Then("the sub-Category page is opened")
    public void step4() {
        String actualPageTitle= homePage.PageTitle().getText();
        //System.out.println(actualPageTitle);
        actualPageTitle = actualPageTitle.toLowerCase();
        //System.out.println(actualPageTitle);
        //System.out.println(SubCategoryName.toLowerCase());
        Assert.assertEquals(actualPageTitle,SubCategoryName.toLowerCase().trim());

    }
}
