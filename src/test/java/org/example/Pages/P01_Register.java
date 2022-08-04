package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_Register {

    public String expectedResult = "Your registration completed";
    public String expectedResultColor = "rgba(76, 177, 124, 1)";

    public WebElement RegisterOrder(){
  //      By RegisterButton = By.className("ico-register");
        return  Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement GenderMale(){
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement GenderFemale(){
        return Hooks.driver.findElement(By.id("gender-female"));
    }
    public WebElement FirstName(){
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement LastName(){
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement Email(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement DateOfBirthDay(){
        return Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]/option[@value=\"1\"]"));
    }
    public WebElement DateOfBirthMonth(){
        return Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]/option[@value=\"1\"]"));
    }
    public WebElement DateOfBirthYear(){
        return Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]/option[@value=\"1997\"]"));
    }
    public WebElement password(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmedPassword(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerButton(){
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public String successMessage(){
        return Hooks.driver.findElement(By.className("result")).getText();
    }
    public String successMessageColor(){
        return Hooks.driver.findElement(By.className("result")).getCssValue("color");
    }

}
