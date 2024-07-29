package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBox extends Base_Class{
  @Test
  public void checkbox() 
  {
	  driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	  WebElement single=driver.findElement(By.xpath("//input[@id='gridCheck']"));
	  single.click();
	  System.out.println(single.isSelected());
	  
	  List<WebElement> checkBox=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		 for(WebElement cB:checkBox)
		 {
			 cB.click();
		 }
  }
  
}
