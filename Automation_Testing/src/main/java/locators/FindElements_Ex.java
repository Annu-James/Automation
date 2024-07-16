package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements_Ex extends Base_1 {

	public void findElements()
	{
		WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputForm.click();
		List<WebElement> find=driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement option:find)
		{
			option.sendKeys("Hello");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElements_Ex obj=new FindElements_Ex();
		obj.initialiseBrowser();
		obj.findElements();
		
	}

}
