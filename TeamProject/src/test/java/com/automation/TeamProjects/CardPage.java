package com.automation.TeamProjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CardPage {
	
	WebDriver driver;
	WebDriverWait wait;
    public CardPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    @FindBy(name = "cardType")
    public WebElement cardtype;
    
    @FindBy(name = "creditCard")
    public WebElement creditcard;
    
    @FindBy(name = "expiryDate")
    public WebElement exd;
    
    @FindBy(name="billToFirstName")
    public WebElement firstName;
    
    @FindBy(name="billToLastName")
    public WebElement lastName;
    
    @FindBy(name="billAddress1")
    public WebElement Address1;
    
    @FindBy(name="billAddress2")
    public WebElement Address2;
    
    @FindBy(name="billCity")
    public WebElement city;
    
    @FindBy(name="billState")
    public WebElement state;
    
    @FindBy(name="billZip")
    public WebElement zip;
    
    @FindBy(name="billCountry")
    public WebElement country;
    
    @FindBy(xpath = "//input[@type='checkbox' and contains(@name,'shipping')]")
    public WebElement shipAddEnable;
    
    public void cardInfo() {
        wait.until(ExpectedConditions.visibilityOf(cardtype));
    	Select card = new Select(cardtype);
        card.selectByVisibleText("American Express");
    }
    
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    public WebElement submit;
    
    public void cardInfoDetails() {
    	wait.until(ExpectedConditions.visibilityOf(creditcard));
    	creditcard.clear();
    	creditcard.sendKeys("9876543210");
    	exd.clear();
    	exd.sendKeys("12/2026");
    	firstName.clear();
    	firstName.sendKeys("Abcde");
    	lastName.clear();
    	lastName.sendKeys("Z");
    	Address1.clear();
    	Address1.sendKeys("Paramakudi");
    	Address2.clear();
    	Address2.sendKeys("Paramakudi");
    	city.clear();
    	city.sendKeys("Ramanathapuram");
    	state.clear();
    	state.sendKeys("TamilNadu");
      	zip.clear();
    	zip.sendKeys("623709");
    	country.clear();
    	country.sendKeys("India");
    	
    }
    public void enableShipping() {
    	if (!shipAddEnable.isSelected()) { 
        	shipAddEnable.click();// enable
        }
    }
    public void clickContinue() {
        wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
    }
    public void confirmButton() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement confirmBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Confirm')]"))
        );
        // Scroll into view
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", confirmBtn);

        // Safe click
        js.executeScript("arguments[0].click();", confirmBtn );
        
        driver.findElement(By.linkText("Return to Main Menu")).click();
    }
    
    @FindBy(name = "shipToFirstName")
    public WebElement shipFirstName;
    
    @FindBy(name = "shipToLastName")
    public WebElement shipLastName;
    
    @FindBy(name = "shipAddress1")
    public WebElement shipAdd1;
    
    @FindBy(name = "shipAddress2")
    public WebElement shipAdd2;
    
    @FindBy(name = "shipCity")
    public WebElement shipCity;
    
    @FindBy(name = "shipState")
    public WebElement shipstate;
    
    @FindBy(name = "shipZip")
    public WebElement shipZip;
    
    @FindBy(name = "shipCountry")
    public WebElement shipcountry;
    
    public void ShipInfo() {
    	shipFirstName.clear();
    	shipFirstName.sendKeys("Mohamed");
    	shipLastName.clear();
    	shipLastName.sendKeys("M");
    	shipAdd1.clear();
    	shipAdd1.sendKeys("Ramanathapuram");
    	shipAdd2.clear();
    	shipAdd2.sendKeys("Ramanathapuram");
    	shipCity.clear();
    	shipCity.sendKeys("Ramanathapuram");
    	shipstate.clear();
    	shipstate.sendKeys("TamilNadu");
    	shipZip.clear();
    	shipZip.sendKeys("623707");
    	shipcountry.clear();
    	shipcountry.sendKeys("India");
    }
    public void ShipAddressClick() {
    	WebElement btn = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'}); arguments[0].click();", btn);
    }
    
}
