package Scripts.Scripts.TestNG.GenericClassForLogin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.AfterMethod;

public class FBLoginTest {
	LoginClass Mylogin;
	
	
  @Test
  public void FBlogin() {
	  Mylogin.login("8888989873", "Sushant!@1234");
	  try {
		  Mylogin.Alert1();
	  }catch(NoAlertPresentException e) {
		  System.out.println("Alert not found");
	  }
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  Mylogin = new LoginClass();
	 Mylogin.get();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

}
