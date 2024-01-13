package test_automationtesting_website;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basic.UtilMethods;

public class TestWebsite {
	@Test
		public void testRegForm() {
		UtilMethods um = new UtilMethods();
		WebDriver driver = um.LaunchBrowser("https://demo.automationtesting.in/Register.html");
		//set values in textboxes
		um.setTextBox(driver, By.cssSelector("input[ng-model='FirstName']"), "Krupa");
		um.setTextBox(driver, By.cssSelector("input[ng-model='LastName']"), "Thumar");
		um.setTextBox(driver, By.cssSelector("input[ng-model='EmailAdress']"), "kthumar17@gmail.com");
		
		//check all checkboxes
		um.selectCheckBox(driver,By.cssSelector("input[type='checkbox']"), "Cricket");
		um.selectCheckBox(driver,By.cssSelector("input[type='checkbox']"), "Movies");
		um.selectCheckBox(driver,By.cssSelector("input[type='checkbox']"), "Hockey");
		
		//select one radio button
		um.selectRadio(driver, By.cssSelector("input[type='radiooptions']"), "FeMale");
		
	}
}
