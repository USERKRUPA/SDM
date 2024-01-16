package tester;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PracticeLoginScenario {
	@Test
	public void testLogin() {
		//Launch browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		//maximize the browser window
		driver.manage().window().maximize();
		
		//print current url and title
		System.out.println("URL: "+driver.getCurrentUrl());
		System.out.println("Title: "+driver.getTitle());
		
		//get username textbox element
		WebElement uname = driver.findElement(By.id("login1"));
		uname.sendKeys("Krupa");
		
		//get password textbox element
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("krupa");
		
		//click signin buttton
		WebElement btnSignin = driver.findElement(By.name("proceed"));
		btnSignin.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		String errmsg = "Wrong username and password combination.";
		WebElement err = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.div_login_error>b")));
		assertEquals(errmsg, err.getText());
	}
}
