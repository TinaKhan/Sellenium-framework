package com.mountSinai.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mountSinai.qa.base.TestBase;

public class HomePage extends TestBase {
    //WebElement
	
	@FindBy(xpath = "//img[@alt='Mount Sinai']")
	WebElement logo;

	// Initializing the page object:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions:

	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public boolean validateMountSinaiLogo() {
		return logo.isDisplayed();
	}

}
