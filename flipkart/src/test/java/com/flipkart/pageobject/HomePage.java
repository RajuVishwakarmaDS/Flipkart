package com.flipkart.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testcases.BaseClass;
import com.flipkart.testdata.TestData;

public class HomePage extends BaseClass{
	@FindBy(xpath="//button[@type=\"submit\"]")
	static
	WebElement submit;	
	
	@FindBy(xpath="//input[@type=\"text\"]")
	static
	WebElement input_field;

	WebDriver driver;	
	
	public HomePage (WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }
	
	public void clickSubmit() {
		submit.click();
	}
	
	public void searchProduct() {
		input_field.sendKeys(TestData.searchParam);
	}
}