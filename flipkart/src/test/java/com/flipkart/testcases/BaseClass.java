package com.flipkart.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	static String url = "https://www.flipkart.com/";
	static WebDriver d;
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		d = new ChromeDriver();	
		d.get(url);
		d.manage().window().maximize();	
	}
	
	@AfterSuite
	public void teardown() {
		d.close();
	}
}