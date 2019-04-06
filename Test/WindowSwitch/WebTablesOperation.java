package WindowSwitch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WebTablesOperation {
	WebDriver driver;
	
  @Test
  public void WebTables() {
	  WebElement Table = driver.findElement(By.xpath("//table//tbody//tr//td[6]//a[2]"));
	  Table.click();
	System.out.println(driver.getCurrentUrl());
	driver.get("http://toolsqa.com/automation-practice-table/");
	WebElement TableDetails = driver.findElement(By.xpath("//tbody//tr[3]//td[6]//a"));  
	TableDetails.click();
	
	System.out.println(driver.findElement(By.xpath("//tbody//tr")).getText());
	WebElement element;
	WebElement T = driver.findElement(By.tagName("tr"));
	WebElement TD = driver.findElement(By.tagName("td"));
	  	  System.out.println(T.getSize());
	  	  System.out.println(TD.getText());
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Test\\\\Test\\\\Resources\\\\Chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://the-internet.herokuapp.com/tables");
	  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
