package WindowSwitch.FrameAssignment;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ActionClassAssignment {
	WebDriver driver;
	
 /* @Test
  public void Actions() {
	  driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
	  Alert myalert;
	  Actions builder = new Actions(driver);
	 driver.findElement(By.xpath("//div//button[@ondblclick=\"myFunction()\"]")).click();
	  builder.doubleClick().build().perform();
	  
	myalert =  driver.switchTo().alert();
			myalert.accept();
	  
  }*/
  
   /*@Test
   public void MoveToElement() {
	   driver.get("http://annauniv.edu/");
	   driver.findElement(By.xpath("//tbody//tr//td[5]//div//a")).click();
	   WebElement Source = driver.findElement(By.name("link13"));
	   Actions builder = new Actions(driver);
	   builder.moveToElement(Source).perform();
	   builder.contextClick(Source).build().perform();
	    }*/
  
	@Test
	public void ImpTest() {
		Alert myalert;
		driver.get("http://www.triphobo.com");
		myalert = driver.switchTo().alert();
		myalert.dismiss();
		driver.findElement(By.id("spl-autocomplete-search")).sendKeys("London");
		driver.findElement(By.xpath("//*[@id=\"js-suggestions\"]/ul/li[1]")).click();
		
		//*[@id="js-suggestions"]/ul/li[3]
	}
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Test\\\\Test\\\\Resources\\\\Chromedriver.exe");
	  driver = new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//  driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
  }

}
