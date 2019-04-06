package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WikipediaAssignment {
	WebDriver driver;
  @Test
  public void Wiki() {
	  driver.findElement(By.xpath("//a[@href =\"//en.wikipedia.org/\"]")).click();
	  WebElement Search = driver.findElement(By.name("search"));
	  Search.sendKeys("SELENIUM");
	  driver.findElement(By.name("go"));
	  String H1 = driver.findElement(By.xpath("//h1[@id=\"firstHeading\"]")).getText();
	 System.out.println(H1);
	 String H2 = "Selenium";
	 System.out.println(H2);
	 assertEquals(driver.findElement(By.xpath("//h1[@id=\"firstHeading\"]")).getText(),H2);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Test\\\\Test\\\\Resources\\\\Chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.wikipedia.org/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  
  }

}
