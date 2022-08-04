package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class P03_homePage {
    public void goToHomePage(){

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }
    //Currency Change Feature Methods
    public WebElement EuroCurrency(){

        return Hooks.driver.findElement(By.xpath("//*[contains(text(),'Euro')]"));
    }
    public List<WebElement> PriceElements(){

        return Hooks.driver.findElements(By.className("price"));
    }
    // End of Currency Change Feature Methods

    //Search Feature Methods
    public WebElement searchField(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchButton(){
        return Hooks.driver.findElement(By.xpath("//button[@type=\"submit\"]"));
    }
    public List<WebElement> searchResults(){
        return Hooks.driver.findElements(By.xpath("//div[@class=\"product-item\"]//h2[@class=\"product-title\"]"));
    }
    public WebElement skuSearchResult(){
        return Hooks.driver.findElement(By.className("product-item"));
    }
    public WebElement skuLabel(){
        return Hooks.driver.findElement(By.xpath("//*[contains(@id,'sku')]"));
    }
    //End of Search Feature Methods

    // Hover Categories Feature Methods
    public WebElement ComputerMainCat(){
        return Hooks.driver.findElement(By.partialLinkText("Computers"));
    }
    public WebElement ElectronicsMainCat(){
        return Hooks.driver.findElement(By.partialLinkText("Electronics"));
    }
    public WebElement ApparelMainCat(){
        return Hooks.driver.findElement(By.partialLinkText("Apparel"));
    }
    public WebElement DesktopSubCat(){
        return Hooks.driver.findElement(By.partialLinkText("Desktop"));
    }
    public WebElement CellSubCat(){
        return Hooks.driver.findElement(By.partialLinkText("Cell phones"));
    }
    public WebElement AccessSubCat(){
        return Hooks.driver.findElement(By.partialLinkText("Accessories"));
    }
    public WebElement PageTitle(){
        return Hooks.driver.findElement(By.className("page-title"));
    }
    // ***** End of Hover Categories Feature Methods *******

    // ********** Home Sliders Feature Methods ***********
    public String firstSliderExpectedUrl =" https://demo.nopcommerce.com/nokia-lumia-1020";
    public String secondSliderExpectedUrl ="https://demo.nopcommerce.com/iphone-6";
    public WebElement firstSliderOption(){
        return Hooks.driver.findElement(By.xpath("//*[contains(@class,'nivo-control') and (@rel='0')]"));
    }
    public WebElement secondSliderOption(){
        return Hooks.driver.findElement(By.xpath("//*[contains(@class,'nivo-control') and (@rel='1')]"));
    }
    public WebElement sliderWindow(){
        return Hooks.driver.findElement(By.id("nivo-slider"));
    }
    // ********** End of Home Sliders Feature Methods ***********

    // ********** Wishlist Feature Methods ***********
    public String expectedSuccessMessage = "The product has been added to your wishlist";
    public String expectedSuccessMessageColor = "#4bb07a";
    public WebElement MobileAddToWishlistButton(){
        return Hooks.driver.findElement(By.xpath("//div[@data-productid=\"18\"]//button[@title=\"Add to wishlist\"]"));
    }
    public WebElement barNotification(){
        return Hooks.driver.findElement(By.xpath("//*[contains(@class,'success')]"));
    }

    public WebElement wishlistTab(){
        return Hooks.driver.findElement(By.className("wishlist-label"));
    }
    public WebElement quantityValue(){
        return Hooks.driver.findElement(By.xpath("//input[@class=\"qty-input\"]"));
    }
    // ********** End of Wishlist Feature Methods ***********


    // ********** Follow us Feature Methods ***********

    public WebElement facebookIcon(){
        return Hooks.driver.findElement(By.className("facebook"));
    }
    public WebElement twitterIcon(){
        return Hooks.driver.findElement(By.className("twitter"));
    }
    public WebElement rssIcon(){
        return Hooks.driver.findElement(By.className("rss"));
    }
    public WebElement youtubeIcon(){
        return Hooks.driver.findElement(By.className("youtube"));
    }
    public String MainWindowHandle(){
        return Hooks.driver.getWindowHandle();
    }
    public Set<String> WindowHandles(){
        return Hooks.driver.getWindowHandles();
    }
//    public WebElement (){
//        return Hooks.driver.findElement(By.);
//    }


}