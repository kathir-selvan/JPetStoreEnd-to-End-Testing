package com.automation.TeamProjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
	WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);   
    }   
    @FindBy(partialLinkText = "Register Now!")
    private WebElement register;
    
    public void clickRegister() {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	
    	// Wait until Register link is clickable
    	WebElement registerLink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Register Now!")));
    	// Scroll into view
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView({block:'center'});", registerLink);
    	// Safe click
    	js.executeScript("arguments[0].click();", registerLink);
     }
}