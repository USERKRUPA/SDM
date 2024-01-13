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
		um.selectRadio(driver, By.cssSelector("input[name='radiooptions']"), "FeMale");
		
		//select menu from dropdownlist
		driver.findElement(By.id("msdd")).click();
		um.selectLanguage(driver, By.cssSelector("a.ui-corner-all"), "Dutch");
		
		//select#country
		//select country by option value
		um.selectDDByValue(driver, By.id("country"), "India");
		
		//select year for date of birth
		um.selectDDByText(driver, By.id("yearbox"),"1991");
		
		//click on submit button
		um.
		
	}
}
