package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_1 {
	public WebDriver driver;
	public void initialiseBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base_1 obj=new Base_1();
		obj.initialiseBrowser();
	}

}
