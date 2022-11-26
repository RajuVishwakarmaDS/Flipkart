package com.flipkart.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.flipkart.testdata.TestData;

import junit.framework.Assert;

public class FlipkartHomepageTC2 extends BaseClass{
		@Test
		public static void homepageNav() {
			String actual = d.getTitle();
			Assert.assertEquals(actual, TestData.homeTitle);
			d.findElement(By.xpath("//button[text()='✕']")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
}