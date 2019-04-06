package Grid;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.fail;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class MultipleWindow {
	RemoteWebDriver driver;
	//WebDriver driver;
  @Test
  public void MultipleWind() throws InterruptedException {
	  
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
		Thread.sleep(5000);
		try {
		alert.sendKeys("London");
		alert.accept();
		}catch(Exception e) {
			System.out.println("Text not send");
		}
		Thread.sleep(5000);
		
		}catch(NoAlertPresentException e){
			System.out.println("Alert not Occure");
		}
		
		

  }
  @BeforeMethod
  public void beforeMethod() {
	 /* System.setProperty("webdriver.chrome.driver", "C:\\\\Test\\\\Test\\\\Resources\\\\Chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://selenium-examples.nichethyself.com/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);*/
	  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setBrowserName("firefox");
	  try {
	  driver = new RemoteWebDriver(new URL("http://192.168.0.128:4444/wd/hub"),capabilities);
	  }catch(MalformedURLException e) {
		  e.printStackTrace();
	  }
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
