package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class UtilMethods {
	
	public WebDriver LaunchBrowser(String url)
	{
		WebDriver driver;
		//to set up the driver of chrome
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		//to maximize the chrome browser window
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		return driver;
	}	
	
	public void setTextBox(WebDriver driver, By locator, String value) {
		WebElement txtFirstName = driver.findElement(locator);
		txtFirstName.sendKeys(value);
	}
	
	public void selectCheckBox(WebDriver driver, By locator, String value)
	{
		List<WebElement> chkboxes = driver.findElements(locator);
		for (WebElement ch : chkboxes)
		{
			if(ch.getAttribute("value").equalsIgnoreCase(value))
			{
				if(!ch.isSelected())
				{
					ch.click();
					break;
				}
			}
		}
	}
	
	public void selectRadio(WebDriver driver, By locator, String value)
	{
		List<WebElement> radios = driver.findElements(locator);
		for (WebElement rb : radios)
		{
			if(rb.getAttribute("value").equalsIgnoreCase(value))
			{
				rb.click();
				break;
			}
		}
	}
	
	public void selectLanguage(WebDriver driver, By locator, String value)
	{
		List<WebElement> options = driver.findElements(locator);
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase(value)) {
				option.click();
				break;
			}
		}
	}
	
	public void selectDDByValue(WebDriver driver, By locator, String value)
	{
		WebElement dd = driver.findElement(locator);
		 Select dditems = new Select(dd);
		 List<WebElement> options = dditems.getOptions();
		 for(WebElement op : options)
		 {
			 if(op.getAttribute("value").equalsIgnoreCase(value))
			 {
				 dditems.selectByValue(value);
				 break;
			 }
		 }
	}
	
	public void selectDDByText(WebDriver driver, By locator, String text)
	{
		WebElement dd = driver.findElement(locator);
		 Select dditems = new Select(dd);
		 List<WebElement> options = dditems.getOptions();
		 for(WebElement op : options)
		 {
			 if(op.getText().equalsIgnoreCase(text))
			 {
				 dditems.selectByVisibleText(text);
				 break;
			 }
		 }
	}
	
}
