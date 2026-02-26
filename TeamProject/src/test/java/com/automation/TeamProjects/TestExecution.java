package com.automation.TeamProjects;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExecution extends BaseClass {
	WebDriverWait wait;

	@DataProvider(name = "loginData")
	public Object[][] getLoginData() {
		return new Object[][] { { "Team123", "Abc@123" } };
	}

	@Test(priority = 1)
	public void registerUser() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Homepage home = new Homepage(driver);
		home.clickSignIn();

		RegisterPage rpage = new RegisterPage(driver);
		rpage.clickRegister();

		RegisterDetails rdpage = new RegisterDetails(driver, wait);
		rdpage.registerUser();
		rdpage.profileInfoTest();
		rdpage.clickSubmit();
	}

	// ---------------------- Login Test ----------------------
	@Test(priority = 2, dependsOnMethods = "registerUser", dataProvider = "loginData")
	public void loginUser(String user, String pass) {

		Homepage home = new Homepage(driver);
		home.clickSignIn();

		LoginPage log = new LoginPage(driver);
		log.login(user, pass);
	}

	// ---------------------- Place Order Test ----------------------
	@Test(priority = 3, dependsOnMethods = "loginUser")
	public void placeOrder() {

		CategoryPage categorypage = new CategoryPage(driver);
		CardPage cPage = new CardPage(driver);

		// Fish Category
		categorypage.verifyFishcategory();
		cPage.cardInfo();
		cPage.cardInfoDetails();
		cPage.enableShipping();
		cPage.clickContinue();
		cPage.ShipInfo();
		cPage.ShipAddressClick();
		cPage.confirmButton();

		categorypage.verifyDogcategory();

		cPage.cardInfo();
		cPage.cardInfoDetails();
		// cPage.enableShipping();
		cPage.clickContinue();
		cPage.confirmButton();

		categorypage.verifyReptilescategory();
		cPage.cardInfo();
		cPage.cardInfoDetails();
		// cPage.enableShipping();
		cPage.clickContinue();
		cPage.confirmButton();

		categorypage.verifyCatcategory();
		cPage.cardInfo();
		cPage.cardInfoDetails();
		cPage.enableShipping();
		cPage.clickContinue();
		cPage.ShipInfo();
		cPage.ShipAddressClick();
		cPage.confirmButton();

		categorypage.verifyBirdscategory();
		cPage.cardInfo();
		cPage.cardInfoDetails();
		cPage.enableShipping();
		cPage.clickContinue();
		cPage.ShipInfo();
		cPage.ShipAddressClick();
		cPage.confirmButton();

	}
}