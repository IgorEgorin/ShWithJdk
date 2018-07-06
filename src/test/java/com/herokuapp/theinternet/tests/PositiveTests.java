package com.herokuapp.theinternet.tests;

import com.herokuapp.theinternet.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PositiveTests extends BaseTest {

	@Test
	public void logInTest() {
		log.info("Page is opened.");

		// enter username
		WebElement button = driver.findElement(By.xpath("//a[@class=\"gatrack btn-interior i2 type_box \"]"));
		button.click();


	}
}
