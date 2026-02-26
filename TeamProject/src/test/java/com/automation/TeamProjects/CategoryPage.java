package com.automation.TeamProjects;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryPage {
	
	 WebDriver driver;
	 WebDriverWait wait;
	    public CategoryPage(WebDriver driver) {
	        this.driver = driver;
	    }
	    public void verifyFishcategory() {
	    	
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.findElement(By.linkText("Fish")).click();
	        driver.findElement(By.linkText("FI-SW-01")).click();
	        driver.findElement(By.linkText("Add to Cart")).click();		        
	        WebElement quantity = driver.findElement(By.name("EST-1"));
	        quantity.clear();// Old value remove
	        quantity.sendKeys("5");	
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement Proceedbtn = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Proceed to Checkout")));
	        // Scroll into view
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView({block:'center'});", Proceedbtn);
	        // Safe click
	        js.executeScript("arguments[0].click();", Proceedbtn );
	    }
	    public void verifyDogcategory() {
	    	
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.findElement(By.linkText("Dogs")).click();
		    driver.findElement(By.linkText("K9-BD-01")).click();
		    driver.findElement(By.xpath("//a[@href=\"/cart/addItemToCart?itemId=EST-7\"]")).click();		        
		    WebElement quantity = driver.findElement(By.name("EST-7"));
		    quantity.clear();// Old value remove
		    quantity.sendKeys("3");	
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement Proceedbtn = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Proceed to Checkout")));
			// Scroll into view
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView({block:'center'});", Proceedbtn);
		    // Safe click
		    js.executeScript("arguments[0].click();", Proceedbtn );
	    }
	    public void verifyReptilescategory() {
    		
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.findElement(By.linkText("Reptiles")).click();
	        driver.findElement(By.linkText("RP-SN-01")).click();
	        driver.findElement(By.xpath("//a[@href=\"/cart/addItemToCart?itemId=EST-12\"]")).click();		        
	        WebElement quantity = driver.findElement(By.name("EST-12"));
	        quantity.clear();// Old value remove
	        quantity.sendKeys("2");	
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement Proceedbtn = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Proceed to Checkout")));
	        // Scroll into view
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView({block:'center'});", Proceedbtn);
	        // Safe click
	        js.executeScript("arguments[0].click();", Proceedbtn );
    	}
	    public void verifyCatcategory() {
	    	
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    	WebElement categories = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Categories")));
//	    	categories.click();
	    	driver.findElement(By.linkText("Cats")).click();
	        driver.findElement(By.linkText("FL-DLH-02")).click();
	        driver.findElement(By.xpath("//a[@href=\"/cart/addItemToCart?itemId=EST-16\"]")).click();		        
	        WebElement quantity = driver.findElement(By.name("EST-16"));
	        quantity.clear();// Old value remove
	        quantity.sendKeys("6");	
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement Proceedbtn = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Proceed to Checkout")));
	        // Scroll into view
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView({block:'center'});", Proceedbtn);
	        // Safe click
	        js.executeScript("arguments[0].click();", Proceedbtn );
    	}
	    public void verifyBirdscategory() {
    		
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.findElement(By.linkText("Birds")).click();
	        driver.findElement(By.linkText("AV-SB-02")).click();
	        driver.findElement(By.xpath("//a[@href=\"/cart/addItemToCart?itemId=EST-19\"]")).click();		        
	        WebElement quantity = driver.findElement(By.name("EST-19"));
	        quantity.clear();// Old value remove
	        quantity.sendKeys("6");	
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement Proceedbtn = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Proceed to Checkout")));
	        // Scroll into view
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView({block:'center'});", Proceedbtn);
	        // Safe click
	        js.executeScript("arguments[0].click();", Proceedbtn );
    	}
	    
	}    