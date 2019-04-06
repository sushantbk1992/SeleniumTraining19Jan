package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class GetValueAssignment5 {
	WebDriver driver;
	Alert myalert;
  @Test
  public void TestingForm() throws InterruptedException {
	  
	  driver.manage().window().maximize();
	WebElement Name = driver.findElement(By.name("firstname"));
			Name.sendKeys("Sushant");
			String Value1 = driver.findElement(By.name("firstname")).getAttribute("value");
			System.out.println(Value1);
			
      driver.findElement(By.name("lastname")).sendKeys("Kadlag");
      String Value2 =  driver.findElement(By.name("lastname")).getAttribute("value");
      System.out.println(Value2);
      Thread.sleep(1000);
	 driver.findElement(By.id("sex-0")).click();
	 String Text1 = driver.findElement(By.id("sex-0")).getAttribute("value");
	 System.out.println(Text1);
	  driver.findElement(By.id("exp-5")).click();
	  String Text2 =  driver.findElement(By.id("exp-5")).getAttribute("value");
	  System.out.println(Text2);
	  driver.findElement(By.id("datepicker")).sendKeys("25/02/2001");
	  String Text5 = driver.findElement(By.id("datepicker")).getAttribute("value");
	  System.out.println(Text5);
	  WebElement P1 = driver.findElement(By.id("photo"));
			  	  P1.click();
	  P1.sendKeys("C:\\personaluse\\Sushant");
	  driver.findElement(By.xpath("//input[@value=\"QTP\"]")).click();
	  String Text3 = driver.findElement(By.xpath("//input[@value=\"QTP\"]")).getAttribute("value");
	  System.out.println(Text3);
	  driver.findElement(By.xpath("//input[@value=\"Selenium IDE\"]")).click();
	  driver.findElement(By.xpath("//input[@value=\"Selenium Webdriver\"]")).click();
	  System.out.println(driver.findElement(By.xpath("//span[@class=\"bcd\"][1]")).getText());
	 
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Test\\\\Test\\\\Resources\\\\Chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://toolsqa.com/automation-practice-form/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	 // driver.close();
  }

}
