package com.mountSiani.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mountSinai.qa.pages.HomePage;

public class HomePageTest extends HomePage{
	
	HomePage homePage;
	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	
	public void setUp() {
		initialize_driver();
		homePage = new HomePage();
	}
	
	@Test()
	public void validateHomePageTitleTest() {
		String homePageTitle = homePage.validateHomePageTitle();
		Assert.assertEquals(homePageTitle, "Mount Sinai Health System - New York City |  Mount Sinai - New York", "Home Page Title doesn't match");
	    System.out.println("HomePage title is: "+homePageTitle);
	}
	@Test()
	public void validateMountSinaiLogoTest() {
		boolean flag = homePage.validateMountSinaiLogo();
		Assert.assertTrue(flag);	
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
