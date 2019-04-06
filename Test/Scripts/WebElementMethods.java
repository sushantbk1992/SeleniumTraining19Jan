package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebElement;

public class WebElementMethods {
	WebDriver driver;
  @Test
  public void WebElementM() throws InterruptedException {
	  WebElement e1 = driver.findElement(By.id("identifierId"));
	  System.out.println(" Is Displayed " + e1.isDisplayed());
	  e1.sendKeys("Sushant");
	   System.out.println(" Get Text " + e1.getText());
	  System.out.println(" Get String " + e1.toString());
	  System.out.println("Is Enable "+e1.isEnabled());
	  System.out.println(" Get Tag Name " + e1.getTagName());
	  System.out.println(" Get Location " + e1.getLocation());
	  Thread.sleep(5000);
	  driver.manage().window().setSize(new Dimension(60,70));
	  Thread.sleep(2000);
	  driver.manage().window().fullscreen();
	  System.out.println(" Get Size " + e1.getSize());
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Test\\\\Test\\\\Resources\\\\Chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.gmail.com");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
