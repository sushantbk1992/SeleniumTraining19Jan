package WindowSwitch.FrameAssignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FrameHandling {
	WebDriver driver;
  @Test
  public void Frame1() {
	  try {
	 driver.switchTo().frame("iframe1");
	// WebElement Element = driver.findElement(By.)
	  }catch(NoSuchFrameException e) {
		  System.out.println(" Frame was expected but not found ");
	  }
	  System.out.println(driver.getTitle());
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Test\\\\Test\\\\Resources\\\\Chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.toolsqa.com/iframe-practice-page/");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
