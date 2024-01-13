package basic;

import static org.junit.Assert.assertEquals;

import java.util.List;

//import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingOnLinks {
	static WebDriver driver ;
	@BeforeClass
	public static void setUp()
	{
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
	}
	  @Test
	  public void Gamil() {		  
		  driver.findElement(By.linkText("Gmail")).click();		  
		  String actTitle = driver.getTitle();
		  assertEquals("Gmail: Private and secure email at no cost | Google Workspace", actTitle);		  
	  }
	  
	  @Test
	  public void images()
	  {  
		  driver.findElement(By.linkText("Images")).click();
		  String actTitle = driver.getTitle();
		  assertEquals("Google Images", actTitle);
	  }
	  public void navigateBack()
	  {
		  driver.navigate().back();
	  }
	  
	  @Test
	  public void verifyAllLinks()
	  {
		  List<WebElement> links = driver.findElements(By.tagName("a"));
		  for (WebElement link : links)
		  {
			 System.out.println(link.getText());
		  }
	  }
	  
	  @Test
	  public void tearDown()
	  {
		  driver.close();
	  }
}
