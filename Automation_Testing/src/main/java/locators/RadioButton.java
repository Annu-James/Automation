package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	WebDriver driver;
	public void initial()
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
	}
	
	public void radioButton()
	{
		WebElement box=driver.findElement(By.xpath("//input[@value='green']"));
		//System.out.println(box.isSelected());
		//System.out.println(box.isEnabled());
		System.out.println(box.isDisplayed());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton obj=new RadioButton();
		obj.initial();
		obj.radioButton();
	}

}
