package com.mountSinai.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	     public static void initialize_driver() {
	         //WebDriverManager.chromedriver().setup(); //we will discuss it later someday
	    	 System.setProperty("webdriver.chrome.driver", "/src/test/resources/drivers/chromedriver.exe");
	         driver = new ChromeDriver();
	         driver.manage().deleteAllCookies();
	         driver.manage().window().maximize();
	         driver.get("https://www.mountsinai.org/");
	     
	}
	

}
