package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Base_1{
	
	public void dropdown()
	{
		WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputForm.click();
		WebElement select=driver.findElement(By.xpath("//a[@href='select-input.php']"));
		select.click();
		WebElement drop=driver.findElement(By.id("single-input-field"));
		Select select1=new Select(drop);
		//select1.selectByVisibleText("Yellow");
		//select1.selectByIndex(2);
		select1.selectByValue("Red");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dropdown obj=new Dropdown();
		obj.initialiseBrowser();
		obj.dropdown();
	}

}
