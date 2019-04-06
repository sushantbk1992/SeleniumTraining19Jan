package Scripts.Scripts.TestNG.GenericClassForLogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class LoginClass extends LoadableComponent<LoginClass>{
	
	@FindBy(xpath = "//input[@id=\"email\"]")
	@CacheLookup
	private WebElement username;

	@FindBy(xpath = "//input[@id=\"pass\"]")
	@CacheLookup
	private WebElement password;
	
	@FindBy (xpath = "//label[@id=\"loginbutton\"]")
	@CacheLookup
	private WebElement Loginbutton;
	
	@FindBy (linkText= "//div//a[@class=\"jewelButton _3eoa\"]")
	private WebElement Friendreq;

	@FindBy (xpath = "//div[@class=\"actions\"]//button[1]")
	private WebElement ReqAcc;
	
	private WebDriver driver;
	private String expectedTitle = "Facebook – log in or sign up";

	public LoginClass() {
		System.setProperty("webdriver.gecko.driver", "test\\resources\\geckodriver-64bit.exe");
		driver = new FirefoxDriver();
		PageFactory.initElements(driver, this);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());

	}
	
	public void login(String user, String pas) {
		
		username.sendKeys(user);
		password.sendKeys(pas);
		Loginbutton.click();
		Friendreq.click();
		ReqAcc.click();
		
		
	}
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		driver.get("https://www.facebook.com/");
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		assertEquals(driver.getTitle(),expectedTitle );
	}
	
	public void Alert1() {
		driver.switchTo().alert().accept();
					
	}

	//*[@id="js_e5"]/div
	//div//a//div[1][@class]
	

}
