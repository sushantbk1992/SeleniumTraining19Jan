package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NevigationMethods {
	WebDriver driver;
  @Test
  public void NevigateMethods1() {
	 String a =  driver.getPageSource();
	  System.out.println(a);
	  System.out.println(driver.getPageSource());
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  System.out.println("*********"+ driver.getWindowHandle());
	  System.out.println(driver.getClass());
	  driver.manage().window().
	  maximize();
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
