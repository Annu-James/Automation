package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window_Handling {

	WebDriver driver;
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
	
	WebElement contact=driver.findElement(By.xpath("//a[@id='contact-us']"));
	contact.click();
	
	WebElement login=driver.findElement(By.xpath("//a[@id='login-portal']"));
	login.click();
	
	String parentName=driver.getWindowHandle();
	System.out.println(parentName);
	
	Set<String> allWindow=driver.getWindowHandles();
	String title="";
	for(String temp:allWindow)
	{
		if(!temp.equals(parentName))
		{
		System.out.println("All Windows "+ temp);
		driver.switchTo().window(temp);
		//System.out.println(driver.getTitle());
		title=driver.getTitle();
		}
		if(title.equals("WebDriver | Contact Us"))
		{
			WebElement contactFirstName=driver.findElement(By.xpath("//input[@name='first_name']"));
			contactFirstName.sendKeys("Abcd");
			WebElement lastName=driver.findElement(By.xpath("//input[@name='last_name']"));
			lastName.sendKeys("Xyz");
			WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
			email.sendKeys("abc@example.com");
			
		}
		if(title.equals("WebDriver | Login Portal"))
		{
			WebElement user=driver.findElement(By.xpath("//input[@id='text']"));
			user.sendKeys("Abcde");
			WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys("123abc");
			WebElement login1=driver.findElement(By.xpath("//button[@id='login-button']"));
			login1.click();
		}
		driver.switchTo().window(parentName);
	}
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_Window_Handling obj=new Multiple_Window_Handling();
		obj.launch();
	}

}
