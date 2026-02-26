package com.automation.TeamProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	    WebDriver driver;

	    public SignInPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(name = "username")
	    public WebElement usernameInput;

	    @FindBy(name = "password")
	    public WebElement passwordInput;

	    @FindBy(name = "signon")
	    public WebElement signInBtn;

	    public void login(String user, String pass) {
	        usernameInput.sendKeys(user);
	        passwordInput.sendKeys(pass);
	        signInBtn.click();
	    }
	}


