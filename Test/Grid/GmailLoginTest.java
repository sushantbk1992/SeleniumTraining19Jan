package Grid;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class GmailLoginTest {
	GmailLoginClass MyLogin;
	SendMail MyMail;
	RemoteWebDriver driver;
	
  @Test
  public void GmailLogin() throws InterruptedException {
	 MyLogin.Login("sushantbkadlag@gmail.com", "83080910727").ComposeMail();
	 MyMail.SignOut();
  }
  @BeforeMethod
  public void beforeMethod() {
	  MyLogin = new GmailLoginClass("http://www.gmail.com");
	 MyLogin.get();
  
	 /* 
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setBrowserName("firefox");
	  try {
	  driver = new RemoteWebDriver(new URL("http://192.168.0.123:4444/wd/hub"),capabilities);
	  
	  }catch(MalformedURLException e) {
		  e.printStackTrace();
	  }
	  driver.get("http://www.google.com");*/
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
