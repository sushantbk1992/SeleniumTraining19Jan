package WindowSwitch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertEquals;
import java.beans.Visibility;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class WaitMethodTest {
	WebDriver driver;
	
  @Test
  public void Wait22() {
	  
	  
	WebElement Text1 = driver.findElement(By.xpath("//div[@id=\"start\"]//button"));
	System.out.println(Text1.getText());
	WaitExp(driver, Text1, 10);
	try {
	Text1.click();
	System.out.println("Element Found");
	}catch(Exception e) {
		
		System.out.println("Element not found");
	}
	
	  WebElement Text22 = driver.findElement(By.xpath("//div[@id=\"finish\"]//h4"));
	  System.out.println(Text22.getText() + " Text Element Found");
	
		System.out.println("Text Element not found");
	
	
		String expectedvalue = "Hello World!";	  
	  String actualValue = Text22.getText();
	  System.out.println(actualValue);
	 // WebElementwait
	//  System.out.println(actualValue);
	 // assertEquals(actualValue,expectedvalue);
  
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Test\\\\Test\\\\Resources\\\\Chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
	  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	  // Wait = new WebDriverWait(driver,30,250);
	  
	  
  }
  public void WaitExp(WebDriver driver, WebElement element, int timeout) {
	  new WebDriverWait(driver , timeout ).until(ExpectedConditions.visibilityOf(element));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
	  
  }

}
