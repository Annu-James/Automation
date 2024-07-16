package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
WebDriver driver;
	public void initial()
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
	}
	public void checkbox()
	{
		WebElement option=driver.findElement(By.xpath("//input[@value='option-1']"));
		option.click();
		System.out.println(option.isSelected());
		WebElement option1=driver.findElement(By.xpath("//input[@value='option-4']"));
		System.out.println(option1.isSelected());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox obj=new CheckBox();
		obj.initial();
		obj.checkbox();
	}

}
