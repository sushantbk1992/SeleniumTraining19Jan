package Scripts.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGConfig {
  @Test
  public void Test1() {
	  System.out.println("Indider test1 of TestNGConfig1");
  }
  @Test
  public void Test2() {
	  System.out.println("Indider test2 of TestNGConfig1");
  }
  @Test
  public void Test3() {
	  System.out.println("Indider test3 of TestNGConfig1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Indider beforeMethod of TestNGConfig1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Indider afterMethod of TestNGConfig1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Indider beforeClass of TestNGConfig1");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Indider afterClass of TestNGConfig1");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Indider beforeTest of TestNGConfig1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Indider afterTest of TestNGConfig1");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Indider beforeSuite of TestNGConfig1");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Indider afterSuite of TestNGConfig1");
  }

}
