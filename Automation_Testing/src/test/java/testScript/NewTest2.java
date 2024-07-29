package testScript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest2 {
  @Test
  public void sample1() {
	  System.out.println("Hello");
  }
  
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }
  @Test
public void sample2()
{
System.out.println("123");	
}
}
