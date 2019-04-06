package Scripts.Scripts.TestNG.GenericClassForLogin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;

public class GmailLoginTest {
	GmailLoginClass MyLogin;
	SendMail MyMail;
	
	
  @Test
  public void GmailLogin() throws InterruptedException {
	 MyMail =  MyLogin.Login("sushantbkadlag@gmail.com", "83080910727");
	 MyMail.ComposeMail();
  }
  @BeforeMethod
  public void beforeMethod() {
	  MyLogin = new GmailLoginClass("http://www.gmail.com");
	 MyLogin.get();
  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
