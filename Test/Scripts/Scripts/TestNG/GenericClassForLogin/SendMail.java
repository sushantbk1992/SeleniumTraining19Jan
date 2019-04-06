package Scripts.Scripts.TestNG.GenericClassForLogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class SendMail extends LoadableComponent<SendMail> {
	
	
	@FindBy (xpath = "//div[@class=\"T-I J-J5-Ji T-I-KE L3\"]")
	@CacheLookup
	private WebElement Compose;
	
	@FindBy (xpath = "//textarea[@name='to']")
    @CacheLookup
    private WebElement To;
	
	@FindBy (name = "subjectbox")
    @CacheLookup
    private WebElement Subject;
	
	@FindBy (name = "//div[@role='textbox']")
    @CacheLookup
    private WebElement MailText;
	
	private WebDriver driver;
	
	private String ExpectetTitle = "Inbox (597) - sushantbkadlag@gmail.com - Gmail";
	

	public SendMail(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void ComposeMail() {
		Compose.click();
		To.sendKeys("sushantbkadlag@gmail.com");
		Subject.sendKeys("hello");
		MailText.sendKeys("Generic class");
	}
	
	
	
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		//Not required.
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
		assertEquals(driver.getTitle(), ExpectetTitle);
		
		
	}
	
	/*
	
	
	
	public SendMail(WebDriver driver) {
		driver = this.driver;
		PageFactory.initElements(driver, this);	
		
	}
	
	public void SendMail(String email, String Sub, String Text) {
		
		Compose.click();
		To.sendKeys(email);
		Subject.sendKeys(Sub);
		MailText.sendKeys(Text);
	}*/
}
