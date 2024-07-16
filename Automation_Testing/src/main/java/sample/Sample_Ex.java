package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample_Ex {
	WebDriver driver;//WebDriver is an interface
public void web()
{
	driver =new ChromeDriver();
	//driver =new EdgeDriver();
	//driver=new FirefoxDriver();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample_Ex obj=new Sample_Ex();
obj.web();
	}

}
