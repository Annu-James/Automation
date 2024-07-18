package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert_Handling extends Base_1{
	
	public void alert()
	{
	WebElement alert1=driver.findElement(By.id("alert-modal"));
	alert1.click();
	WebElement javaSc=driver.findElement(By.xpath("//a[text()='Javascript Alert']"));
	javaSc.click();
	/*WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	button.click();
	driver.switchTo().alert().accept();*/
		
	/*WebElement button2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	button2.click();
	driver.switchTo().alert().dismiss();*/
	
	WebElement button3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	button3.click();
	driver.switchTo().alert().sendKeys("Hello");
	driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alert_Handling obj=new Alert_Handling();
		obj.initialiseBrowser();
		obj.alert();
	}

}
