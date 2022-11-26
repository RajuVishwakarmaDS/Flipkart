package com.flipkart.testcases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.flipkart.pageobject.HomePage;
import com.flipkart.testdata.TestData;

public class ProductSearch extends BaseClass{
	HomePage p;
	@Test
	public void searchProduct() throws Exception{
		FlipkartHomepageTC1.homepageNav();
		
		// enter search parameter
		p = new HomePage(d);
		p.searchProduct();

		// click on search web element
		p.clickSubmit();
		
		// synchronize
		WebDriverWait result = new WebDriverWait(d, Duration.ofSeconds(10));
		result.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='mobiles']")));
		
		// validate 
		String actual = d.findElement(By.xpath("//span[text()='mobiles']")).getText();	
		System.out.println(actual);
		String expected = TestData.searchParam;
		Assert.assertEquals(actual, expected);
	}
}