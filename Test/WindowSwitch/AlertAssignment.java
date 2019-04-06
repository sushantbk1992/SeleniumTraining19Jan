package WindowSwitch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AlertAssignment {
	WebDriver driver;
  @Test
  public void NewAlert() throws InterruptedException {
	  try {	  
	 WebElement button = driver.findElement(By.xpath("\n" + "//button[@onclick=\"jsAlert()\"]"));
	  button.click();
	  String ParenetWindowHandle = driver.getWindowHandle();
	  }catch(NoSuchElementException e) {
		  System.out.println("Element not found");
	  }
	  try {
	  Alert alert = driver.switchTo().alert();
	  Thread.sleep(5000);
	  alert.accept();
	  }catch(NoAlertPresentException ex) {
		  System.out.println("Alert not found");
	  }
	  try {
		String Result =  driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		  System.out.println(Result);
	  }catch(NoSuchElementException e) {
		  System.out.println("Text Element Not found");
		  
	  }
  }
  
	@Test
	public void MultiAlert() throws InterruptedException {
		
		driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");
		try {
		driver.findElement(By.xpath("//input[@id=\"simple\"]")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//String s2 = driver.findElement(By.xpath("//p[1]")).getText();
		//assertEquals(s1,s2);
		
		System.out.println(alert.getText());
		System.out.println(" alert match ");
		}catch(NoAlertPresentException e) {
			System.out.println("First Alert not found");
		}
		
		
		
		try {
			driver.findElement(By.xpath("//button[@id=\"confirm\"]")).click();
			Alert alert1 = driver.switchTo().alert();
			//assertEquals(alert1.getText(),"Press a button!");
			alert1.accept();
			System.out.println(driver.findElement(By.xpath("//body//p[@id=\"demo\"]")).getText());
		} catch (NoAlertPresentException e) {
			System.out.println("Not Found Alert2");
		}
		
		
		try {
			driver.findElement(By.xpath("//button[@id=\"prompt\"]")).click();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert3 not found");
		}
			Alert alert3 = driver.switchTo().alert();
			//alert3.sendKeys("Jonh");
			alert3.accept();
			
			System.out.println(driver.findElement(By.xpath("//p[@id=\"prompt_demo\"]")).getText());
	}
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Test\\\\Test\\\\Resources\\\\Chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.close();
	  
  }

}
