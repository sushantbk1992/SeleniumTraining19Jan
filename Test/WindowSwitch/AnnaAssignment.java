package WindowSwitch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class AnnaAssignment {
	WebDriver driver;
	WebDriverWait wait;
	
 /* @Test
  public void AnnaAssignment() {
	 driver.get("http://annauniv.edu/");
     driver.findElement(By.xpath("//tr//td[5]//div//a[1]")).click();
     WebElement element = driver.findElement(By.xpath("//div//a[@name=\"link13\"]//strong"));
     Actions action = new Actions(driver);
     action.moveToElement(element).build().perform();
     action.moveToElement(driver.findElement(By.xpath("//div//div[@id='menuItem41']"))).click().build().perform();
  
    }*/
  
  @Test 
  public void triphobocom() throws InterruptedException {
	  driver.get("https://www.triphobo.com/");
	  try {
	  driver.findElement(By.xpath("//div//div//button[@class=\"btn btn-default later-btn mod-btn\"]")).click();
	  }catch(Exception e) {
		  System.out.println("Later button not found");
	  }
	  
	  driver.findElement(By.id("spl-autocomplete-search")).sendKeys("London");
	  driver.findElement(By.xpath("//div[@id=\"js-suggestions\"]//ul//li[3]")).click();
	  driver.findElement(By.id("plan-my-trip")).click();
	  driver.findElement(By.xpath("//div[@class=\"step-1-action-button\"]//button[1]")).click();
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  wait = new WebDriverWait(driver, 30);
	  
  }
  @BeforeMethod
  public void beforeMethod() {	  
	  //System.setProperty("webdriver.chrome.driver", "C:\\\\Test\\\\Test\\\\Resources\\\\Chromedriver.exe");
	  //driver = new ChromeDriver();
	  System.setProperty("webdriver.gecko.driver","C:\\Test\\Test\\Resources\\geckodriver-64bit.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
