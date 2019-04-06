package WindowSwitch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class ExplicitWaitMethod {
	WebDriver driver;
  @Test
  public void ExplicitMenthod() throws InterruptedException {
		driver.get("http://www.gmail.com");

		WebElement fname = driver.findElement(By.id("identifierId"));
		sendkeys(driver, fname, 10, "sushantbkadlag@gmail.com");

		try {
			WebElement next = driver.findElement(By.id("identifierNext"));
			next.click();
		} catch (NoSuchElementException e) {
			System.out.println("Next Buttond not found");
		}
try {
		WebElement passwd = driver.findElement(By.name("password"));
	//	passwd.click();
		Thread.sleep(5000);
		passwd.sendKeys("83080910727");
}catch(NoSuchElementException e) {
	System.out.println("Password Element not found");
}
		WebElement PassNext = driver.findElement(By.id("passwordNext"));
		PassNext.click();
	 
	  
	  
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Test\\\\Test\\\\Resources\\\\Chromedriver.exe");
	  driver = new ChromeDriver();
	 	 // driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  
	    }
  
  public static void sendkeys(WebDriver driver, WebElement element, int timeout, String value) {
	  new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
	  element.sendKeys(value);	  
	  
  }

}
