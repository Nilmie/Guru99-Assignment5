package Assignment;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class Assignment 
{

	@Test
	
	public void testSearch()
	{
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		
		//Login
		driver.findElement(By.name("uid")).sendKeys("mngr155951");
		driver.findElement(By.name("password")).sendKeys("rUgYpEz");
		driver.findElement(By.name("btnLogin")).click();
		
		
		driver.findElement(By.linkText("Fund Transfer")).click();
		
		driver.findElement(By.name("payersaccount")).sendKeys("49732");
		driver.findElement(By.name("payeeaccount")).sendKeys("49734");
		driver.findElement(By.name("ammount")).sendKeys("100");
		driver.findElement(By.name("desc")).sendKeys("Description");
		driver.findElement(By.name("AccSubmit")).click();

		
		
		//driver.close();
		//driver.quit();
	}
}
