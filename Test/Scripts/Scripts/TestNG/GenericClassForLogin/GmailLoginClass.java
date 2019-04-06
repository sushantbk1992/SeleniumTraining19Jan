package Scripts.Scripts.TestNG.GenericClassForLogin;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLoginClass extends LoadableComponent<LoginClass> {
	
	@FindBy (id = "identifierId")
	private WebElement LoginName;
	
	@FindBy (id = "identifierNext")
	private WebElement IdNext;
	
	@FindBy (xpath = "//div//input[@name=\"password\"]")
	private WebElement Pass;

	@FindBy (id = "passwordNext")
	private WebElement passNext;
	
    private String ExpectedValue = "Gmail"; 
	
	private WebDriver driver;
	
	public GmailLoginClass(String str) {
		System.setProperty("webdriver.gecko.driver", "test\\resources\\geckodriver-64bit.exe");
		driver = new FirefoxDriver();
		PageFactory.initElements(driver, this);
		driver.get(str);
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	} 
	
	public SendMail Login(String Id, String pass) throws InterruptedException {
		
		LoginName.sendKeys(Id);
		IdNext.click();
		//Thread.sleep(5000);
//		Pass.sendKeys(pass);
		sendkeys1(driver,Pass,10,pass);
		passNext.click();		
		SendMail MyMail = new SendMail(driver);
		return MyMail;
		
	}
	public static void sendkeys1(WebDriver driver, WebElement element, int timeout, String value) {
		  new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		  element.sendKeys(value);	 
		  System.out.println(driver.getTitle());
		  
	  }
	
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		try {
		assertEquals(driver.getTitle(), ExpectedValue);
		
		}catch(Exception e) {
			System.out.println(" Page is Load succesfully");
		}
	}
		

	
}
