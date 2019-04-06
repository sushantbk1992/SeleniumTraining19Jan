package WindowSwitch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTabAssignment {
	WebDriver driver;
  @Test
  public void TabOpen() {
	 
	  String ParentWindowHandle = driver.getWindowHandle();
	  try {
	  driver.findElement(By.id("helpbutton")).click();
	  driver.switchTo().window("HelpWindow");
	  System.out.println(driver.getTitle());
	  driver.switchTo().window(ParentWindowHandle);
	  }catch(NoSuchWindowException e) {
		  System.out.println("First Window not found ");
	  }
	  driver.findElement(By.id("chatbutton"));
	  Set<String> Handles = driver.getWindowHandles();
	 for(String i : Handles) {
	  driver.switchTo().window(i);
	  System.out.println(driver.getTitle());
	 }
	  System.out.println(driver.getTitle());
	  driver.switchTo().window(ParentWindowHandle);
	  try {
	  driver.findElement(By.id("visitbutton")).click();
	  driver.switchTo().window("VisitUsWindow");
	  driver.switchTo().window(ParentWindowHandle);
	  System.out.println(driver.getTitle());
	  driver.switchTo().window(ParentWindowHandle);
	  }catch(NoSuchWindowException e) {
		  System.out.println("Third Window not found");
	  }
	  
	  
		  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Test\\\\Test\\\\Resources\\\\Chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://cookbook.seleniumacademy.com/Config.html");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
