package org.example.StepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Iterator;
import java.util.Set;

public class D07_followUsStepDef {
    P03_homePage homePage= new P03_homePage();
    SoftAssert soft = new SoftAssert();

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        homePage.twitterIcon().click();
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        homePage.rssIcon().click();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        homePage.youtubeIcon().click();
    }

    @When("user opens facebook link")
    public void userOpensFacebookLink() {
        homePage.facebookIcon().click();
    }

    @Then("^\"(.*)\" is opened in new tab$")
    public void isOpenedInNewTab(String tabUrl) throws InterruptedException {
        Thread.sleep(3000);
        int countWindows = 0; // i made count because some icons doesnot open new tab
        String mainWindowHandle = homePage.MainWindowHandle();
        Set<String> windowHandles = homePage.WindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        // i check that if there is more than window and iterate to the second window to get the url of it
        while (iterator.hasNext()) {
            String secondWindow = iterator.next();
             countWindows++; // here is count for windows opened
            if (!mainWindowHandle.equalsIgnoreCase(secondWindow)) {
                //  Hooks.driver.switchTo().window(secondWindow);
                String actualURl = Hooks.driver.switchTo().window(secondWindow).getCurrentUrl();
                System.out.println(actualURl);
                Assert.assertEquals(actualURl, tabUrl);
                Hooks.driver.close();
            }
            System.out.println(countWindows);

        }
        // if count window is smaller than 2 that means that icon i clicked doesnot open new tab and that is a bug
        // so i checked on no. of open windows
        if(countWindows<2){
            String actualURL = Hooks.driver.getCurrentUrl();
            soft.assertEquals(countWindows,2, "this icon doesn't open new tab");
            soft.assertEquals(actualURL, tabUrl);
            System.out.println(actualURL);
            soft.assertAll();
        }
    }

}
