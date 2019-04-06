package Scripts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstWebDriverTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Test\\Test\\Resources\\geckodriver-64bit.exe");
		//WebDriver driver = new FirefoxDriver();
		  System.setProperty("webdriver.chrome.driver","C:\\Test\\Test\\Resources\\Chromedriver.exe");
		  driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://www.gmail.com");
		/*
		WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("sushantbkadlag@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("83080910727");
		driver.findElement(By.id("passwordNext")).click();*/
		System.out.println("******************************");
		//System.out.println(driver.getPageSource());
		/*System.out.println("******************************");
		
		System.out.println("**********getCurrentUrl********************");
		System.out.println(driver.getCurrentUrl());
		System.out.println("******************************");
		driver.manage().window().setSize(new Dimension(20, 20));
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement s1 = driver.findElement(By.id("identifierId"));
		
		if(s1.isDisplayed()) {
			
			System.out.println(" Visible ");
		}
		else {
			
			System.out.println(" Not Visible");
		}
		if(s1.isEnabled()) {
			
			System.out.println(" Enabled ");
		}
		else {
			System.out.println(" Not Enable ");
		}
		
		if(s1.isSelected()) {
			System.out.println(" Selected ");
		}
		else {
			
			System.out.println(" Not Selected ");
		}*/
		
		
	//	driver.quit();
		/*System.setProperty("webdriver.chrome.driver","C:\\Test\\Test\\Resources\\Chromedriver.exe");
		driver.get("http://www.flipkart.com");
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		for(WebElement a:Links) {
			
			System.out.println(a.getText() + " - " + a.getAttribute("href"));*/
			
			System.setProperty("webdriver.chrome.driver","C:\\Test\\Test\\Resources\\Chromedriver.exe");
			driver.get("http://toolsqa.com/automation-practice-form/");
			driver.findElement(By.name("firstname")).sendKeys("Sushant");
             driver.findElement(By.name("lastname")).sendKeys("Kadlag");
             Thread.sleep(1000);
					driver.findElement(By.id("sex-0")).click();
					driver.findElement(By.id("exp-5")).click();
					driver.findElement(By.id("datepicker")).sendKeys("25/02/2001");
					driver.findElement(By.id("photo")).click();
					
			
			
		}
			
		
		
		
	}


