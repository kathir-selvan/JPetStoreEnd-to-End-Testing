package com.automation.TeamProjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterDetails {

	WebDriver driver;
	WebDriverWait wait;

	public RegisterDetails(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	@FindBy(partialLinkText = "Register Now!")
	public WebElement register;

	@FindBy(name = "username")
	public WebElement userId;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(name = "repeatedPassword")
	public WebElement confirmPassword;

	@FindBy(name = "firstName")
	public WebElement firstname;

	@FindBy(name = "lastName")
	public WebElement lastname;

	@FindBy(name = "email")
	public WebElement Email;

	@FindBy(name = "phone")
	public WebElement Phone;

	@FindBy(name = "address1")
	public WebElement Address;

	@FindBy(name = "address2")
	public WebElement Address2;

	@FindBy(name = "city")
	public WebElement City;

	@FindBy(name = "state")
	public WebElement State;

	@FindBy(name = "zip")
	public WebElement Zip;

	@FindBy(name = "country")
	public WebElement Country;

	@FindBy(name = "languagePreference")
	private WebElement LanguagePreference;

	@FindBy(name = "favouriteCategoryId")
	private WebElement FavouriteCategory;

	@FindBy(name = "listOption")
	private WebElement enableMyList;

	@FindBy(name = "bannerOption")
	private WebElement enableMyBanner;

	public void profileInfoTest() {
		PageFactory.initElements(driver, this);

		Select lang = new Select(LanguagePreference);
		lang.selectByVisibleText("German");

		Select cat = new Select(FavouriteCategory);
		cat.selectByVisibleText("Cats");

		if (!enableMyList.isSelected()) {
			enableMyList.click(); // enable
		}

		if (!enableMyBanner.isSelected()) {
			enableMyBanner.click();
		} // enable
	}

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submit;

	public void registerUser() {
		userId.sendKeys("Team123");
		password.sendKeys("Abc@123");
		confirmPassword.sendKeys("Abc@123");

		firstname.sendKeys("Team");
		lastname.sendKeys("Z");
		Email.sendKeys("abhacW@gmail.com");
		Phone.sendKeys("9876543210");
		Address.sendKeys("xyz");
		Address2.sendKeys("zxy");
		City.sendKeys("yzx");
		State.sendKeys("ABC");
		Zip.sendKeys("600001");
		Country.sendKeys("TVK");

		// submit.click();
	}

	public void clickSubmit() {
		submit.click();
	}

}