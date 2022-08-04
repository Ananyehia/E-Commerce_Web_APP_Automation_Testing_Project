package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {

 P03_homePage homePage = new P03_homePage();

 // Scenario 1
 @When("user choose first slider")
 public void userChooseFirstSlider() {
  homePage.firstSliderOption().click();
 }

 @And("user click on image of first Slider")
 public void userClickOnImageOfFirstSlider() throws InterruptedException {
  //wait for the first slider to show
  Thread.sleep(2000);
  homePage.sliderWindow().click();
 }

 @Then("user go to first Slider page")
 public void userGoToFirstSliderPage() {
  String actualUrl = Hooks.driver.getCurrentUrl();
  Assert.assertEquals(actualUrl,homePage.firstSliderExpectedUrl);
 }
// Scenario 2
 @When("user choose second slider")
 public void userChooseSecondSlider() {
  homePage.secondSliderOption().click();
 }

 @And("user click on image of second slider")
 public void userClickOnImageOfSecondSlider() throws InterruptedException {
  //wait for the second slider to show
  Thread.sleep(2000);
  homePage.sliderWindow().click();
 }

 @Then("user go to second Slider page")
 public void userGoToSecondSliderPage() {
  String actualUrl = Hooks.driver.getCurrentUrl();
  Assert.assertEquals(actualUrl,homePage.secondSliderExpectedUrl);
 }




}
