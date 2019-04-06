package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class GmailLogin1 {
	
	WebDriver driver;
	
	 /*@Test
	  public class PrintAllGoogleLinks {
			WebDriver driver;
		  
		  public void PrintAllGoogleL() {
			  List<WebElement> allGoogleLinks= driver.findElements(By.tagName("a"));
			  for(int i=0;i<allGoogleLinks.size(); i++) {
				  
				  System.out.println(allGoogleLinks.get(i).getAttribute("href"));
			  }
			  
		  }*/
	
  //@Test
  public void GmailLoginTest() throws Exception {
	  
	  WebElement identifier = driver.findElement(By.id("identifierId"));
	  identifier.sendKeys("sushantbkadlag@gmail.com");
	  driver.findElement(By.id("identifierNext")).click();
	  Thread.sleep(5000);
	  	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("83080910727");
	  	 	driver.findElement(By.id("passwordNext")).click();
	   }
  
  @Test
public void HelloWorld() throws Exception {
	  	  
	  driver.findElement(By.xpath("//button")).click();
	  Thread.sleep(5000);
	  String ExpectedValue= driver.findElement(By.id("finish")).getText();
	  String ActualValue = "hello world!";
	 assertEquals(ExpectedValue,ActualValue);
	  	  
	   }
  
 
  @BeforeMethod
  public void beforeMethod() {
	// System.setProperty("webdriver.gecko.driver", "Test\\Resources\\geckodriver-64bit.exe");
	  System.setProperty("webdriver.chrome.driver","C:\\Test\\Test\\Resources\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
  }

  }


