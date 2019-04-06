package MultipleWindowAssignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class MultipleWindow {
	WebDriver driver;
  @Test
  public void MultipleWind() throws InterruptedException {
	  
	  String Parentwindowhandle = driver.getWindowHandle();
		WebElement loginUserName = driver.findElement(By.id("loginname"));

		loginUserName.sendKeys("stc123");

		driver.findElement(By.id("loginpassword")).sendKeys("12345");

		driver.findElement(By.id("loginbutton")).click();

		driver.findElement(By.className("link")).click();
		String W1 = driver.getWindowHandle();
		try {

			driver.switchTo().window("Contact");

		} catch (NoSuchWindowException e) {

		System.out.println("Element not found");

		}
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//a//span[@class=\"glyphicon glyphicon-search\"]")).click();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			fail("Element not found");
		}
		try {
		Alert alert =	driver.switchTo().alert();
		//Thread.sleep(5000);
		try {
			try {
		alert.sendKeys("London");
		System.out.println("Sent value to alert");
			}catch(Exception e) {
				System.out.println("value not send to alert");
			}
			
		alert.accept();
		}catch(Exception e) {
			System.out.println("Text not send");
		}
		//Thread.sleep(5000);
		
		}catch(NoAlertPresentException e){
			System.out.println("Alert not Occure");
		}
		driver.close();
	   driver.switchTo().window(Parentwindowhandle);
	   driver.findElement(By.className("glyphicon-user"));
		
		

  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Test\\\\Test\\\\Resources\\\\Chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://selenium-examples.nichethyself.com/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
