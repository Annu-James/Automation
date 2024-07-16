package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElement_Commands extends Base_1{

	public void webElement()
	{
	WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
	inputForm.click();
	WebElement message=driver.findElement(By.id("single-input-field"));
	message.sendKeys("Hello");
	WebElement input=driver.findElement(By.id("button-one"));
	input.click();
	System.out.println(input.getText());
	}
	
	public void webCommands()
	{
		WebElement valA=driver.findElement(By.id("value-a"));
		valA.sendKeys("25");
		WebElement valB=driver.findElement(By.id("value-b"));
		valB.sendKeys("60");
		WebElement input1=driver.findElement(By.id("button-two"));
		input1.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement_Commands obj=new WebElement_Commands();
		obj.initialiseBrowser();
		obj.webElement();
		obj.webCommands();
		
		
	}

}
