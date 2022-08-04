package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class D08_WishlistStepDef {
    P03_homePage homePage = new P03_homePage();
    SoftAssert soft = new SoftAssert();
//  Scenario 1
    @When("user click on wishlist button of a product")
    public void userClickOnWishlistButtonOfAProduct() {
        homePage.MobileAddToWishlistButton().click();
       // Hooks.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Then("success message appears")
    public void successMessageAppears() {

       // System.out.println("\"" +homePage.barNotification().getText()+ "\"");
        String actualMessage = homePage.barNotification().getText();
        String actualMessageColor = homePage.barNotification().getCssValue("background-color");
       // System.out.println(actualMessageColor);
        soft.assertEquals(actualMessage,homePage.expectedSuccessMessage);
        soft.assertEquals(Color.fromString(actualMessageColor).asHex(),homePage.expectedSuccessMessageColor);
        soft.assertAll();
    }

    //  Scenario 2
    @And("user wait until success message disappear")
    public void userWaitUntilSuccessMessageDisappear() throws InterruptedException {
        // using explicit wait
        WebDriverWait wait = new WebDriverWait(Hooks.driver,5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[contains(@class,'success')]")));
        System.out.println("done");
    }

    @And("user click on Wishlist Tab")
    public void userClickOnWishlistTab() {
        homePage.wishlistTab().click();
        //will give time to load the wishlist page
       Hooks.driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
    }

    @Then("user check products quantity on his wishlist")
    public void userCheckProductsQuantityOnHisWishlist() {
        //Thread.sleep(2000);
        String qty= homePage.quantityValue().getAttribute("value");
        //System.out.println(qty +"  " + Integer.parseInt(qty));
        //Assert.assertNotEquals(Integer.parseInt(qty),0);
        Assert.assertNotEquals(qty,"0");

    }
}
