package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {

    public String expectedURL ="https://demo.nopcommerce.com/";
    public String expectedErrorMessage = "Login was unsuccessful.";
    public String expectedErrorMessageColor = "#e4434b";
    public WebElement goToLoginPage(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement EmailField(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement PasswordField(){
        return Hooks.driver.findElement(By.id("Password"));

    }
    public WebElement loginButton(){
        return Hooks.driver.findElement(By.xpath("//*[contains(text(),'Log in') and @class=\"button-1 login-button\"]"));
    }
    public WebElement myAccountTab(){
        return Hooks.driver.findElement(By.className("ico-account"));
    }
    public String actualErrorMessage(){
        return Hooks.driver.findElement(By.className("message-error")).getText();
    }
    public String actualErrorMessageColor(){
        return Hooks.driver.findElement(By.className("message-error")).getCssValue("color");
    }

}
