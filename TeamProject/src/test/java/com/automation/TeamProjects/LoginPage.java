package com.automation.TeamProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;

	public void login(String user, String pass) {
//    	username.clear();
//      username.sendKeys("Abcd");
//      password.clear();
//      password.sendKeys("Abc@123");
//      loginBtn.click();

		username.clear();
		username.sendKeys(user);

		password.clear();
		password.sendKeys(pass);

		loginBtn.click();
	}
}
