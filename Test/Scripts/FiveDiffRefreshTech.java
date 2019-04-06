package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FiveDiffRefreshTech {
	WebDriver driver;
  @Test
  public void Refresh() throws InterruptedException {
	   driver.navigate().refresh();
	   Thread.sleep(5000);
	   driver.get("https://www.toolsqa.com");
	   Thread.sleep(5000);
	   driver.findElement(By.id("s")).sendKeys(Keys.F5);
	   Thread.sleep(5000);
	   driver.get(driver.getCurrentUrl());
	   Thread.sleep(5000);
	   driver.findElement(By.name("s")).sendKeys("\\uE035");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Test\\\\Test\\\\Resources\\\\Chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.gmail.com");
	  
	  
	   }

  @AfterMethod
  public void afterMethod() {
	//  driver.close();
  }

}
