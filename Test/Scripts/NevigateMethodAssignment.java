package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NevigateMethodAssignment {
	
	public WebDriver driver;

	@Test
	public boolean NavigateMethod() throws InterruptedException {

		boolean bNavigationStatus = false;
		try {
			WebElement Interface = driver.findElement(By.id("identifierId"));
			Interface.sendKeys("sushantbkadlag@gmail.com");
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys("83080910727");
			driver.findElement(By.id("passwordNext")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class=\"T-I J-J5-Ji T-I-KE L3\"]")).click();
			Thread.sleep(15000);
			// driver.manage().window().maximize();
			// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//textarea[@name='to']")).click();
			driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("ketan@paratussystems.com");
			driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(Keys.ENTER);

			Thread.sleep(2000);
			driver.findElement(By.name("subjectbox")).click();
			WebElement sub = driver.findElement(By.name("subjectbox"));
			sub.sendKeys("Hi Ketan, I am Sushant");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@role='textbox']")).click();
			WebElement Message = driver.findElement(By.xpath("//div[@role='textbox']"));
			Message.sendKeys("I have done my assignment");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class=\"T-I J-J5-Ji aoO T-I-atl L3\"]")).click();
			driver.findElement(By.xpath("//div[@class=\"T-I J-J5-Ji aoO T-I-atl L3\"]")).click();

			bNavigationStatus = true;
		} catch (Exception ex) {
			System.out.println(ex.toString());
		} finally {

			if (driver != null) {
				driver.close();
			}

		}
		return bNavigationStatus;
	}

	@BeforeMethod
	public void BeforeMethod() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Test\\Test\\Resources\\Chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.gmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		} catch (NoSuchElementException ex) {
			System.out.println(ex.toString());
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}

	}

	@AfterMethod
	public void afterMethod() {
		try {
			if (driver != null) {
				driver.close();
			}
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}

	}

}
