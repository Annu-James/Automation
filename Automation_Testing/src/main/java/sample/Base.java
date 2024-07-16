package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
public void initialiseBrowser()
{
	driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/index.php");
	driver.manage().window().maximize();
	
}
public void driverQuit()
{
driver.close();	
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base obj=new Base();
		obj.initialiseBrowser();
		//obj.driverQuit();
	}

}
