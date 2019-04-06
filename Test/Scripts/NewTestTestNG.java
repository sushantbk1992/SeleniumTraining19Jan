package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTestTestNG {
	WebDriver driver;
  @Test
  public void SeleniumTestLogin() {
	  WebElement username = driver.findElement(By.id("loginname"));
		username.sendKeys("stc123");
		driver.findElement(By.id("loginpassword")).sendKeys("12345");
		driver.findElement(By.id("loginbutton")).click();
		String expectedTitle = "My account 1";
		String actualTitle = driver.getTitle();
		/*if(expectedTitle.equals(actualTitle))
			
			System.out.println("Test Case is Passed !");
		else
			System.out.println("Test case is failed ..!");*/
		assertEquals(actualTitle,expectedTitle,"Login Test Case Failed..!");
		driver.close();
  }
  @Test
  public void googleSearchTest() throws InterruptedException {
	  driver.get("https://www.google.com/");
	  driver.findElement(By.name("q")).sendKeys("Job Search");
	  Thread.sleep(5000);
	  
	  
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
		System.setProperty("webdriver.gecko.driver", "Test\\Resources\\geckodriver-64bit.exe");
		System.setProperty("webdriver.chrome.driver",  "Test\\Resources\\ChromeDriver.exe");
		//System.setProperty("webdriver.ie.driver",  "Test\\Resources\\IEDriver.exe");
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium-examples.nichethyself.com/");
  }

  @AfterMethod
  public void afterMethod() {
	 // driver.quit();
	  
  }

}
