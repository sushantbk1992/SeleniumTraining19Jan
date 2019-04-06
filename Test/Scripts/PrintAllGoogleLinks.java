package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class PrintAllGoogleLinks {
	WebDriver driver;

  @Test
  public void PrintAllGoogleL() {

	  List<WebElement> allGoogleLinks = driver.findElements(By.tagName("a"));
	  for(int i=0;i<allGoogleLinks.size(); i++) {
		  
		  System.out.println(allGoogleLinks.get(i).getText());
	  }
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  	  System.setProperty("webdriver.gecko.driver","C:\\Test\\Test\\Resources\\geckodriver-64bit.exe");
		//WebDriver driver = new FirefoxDriver();
		  System.setProperty("webdriver.chrome.driver","C:\\Test\\Test\\Resources\\Chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
