package testScript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority = 3)
  public void sample() 
  {
	  System.out.println("Hello");
 }
  @Test(priority = 1)
  public void number()
  {
	  System.out.println("123");
  }
  @Test(priority = 2)
  public void colour()
  {
	  System.out.println("Yellow");
  }
 /* @BeforeMethod
  public void before()
  {
	  System.out.println("Before Method");
  }
  @AfterMethod
  public void after()
  {
	  System.out.println("After Method");
  }*/
}
