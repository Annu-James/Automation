package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_Window2 {
	WebDriver driver;
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		
		String parent1=driver.getWindowHandle();
		System.out.println(parent1);
		
		WebElement action=driver.findElement(By.xpath("//a[@href='Actions/index.html']"));
		action.click();
		
		WebElement toDo=driver.findElement(By.xpath("//a[@href='To-Do-List/index.html']"));
		toDo.click();

		WebElement button=driver.findElement(By.xpath("//a[@id='button-clicks']"));
		button.click();
		
		Set<String> child=driver.getWindowHandles();
		String title="";
		for(String ch:child)
		{
			if(!ch.equals(parent1))
			{
				driver.switchTo().window(ch);
				System.out.println(ch);
				System.out.println(driver.getTitle());
				title=driver.getTitle();
			}
			if(title.equals("WebDriver | To Do List"))
			{
				WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
				text.sendKeys("Frames");
				
			}
			if(title.equals("WebDriver | Actions"))
			{
				WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
				WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
				Actions dragNDrop=new Actions(driver);
				dragNDrop.dragAndDrop(drag, drop).perform();
			} 
			if(title.equals("WebDriver | Button Clicks"))
			{
				WebElement elementClick=driver.findElement(By.xpath("//span[@id='button1']"));
				elementClick.click();
				driver.switchTo().alert().dismiss();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_Window2 obj=new Multiple_Window2();
		obj.launch();
	}

}
