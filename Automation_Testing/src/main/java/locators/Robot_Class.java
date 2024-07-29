package locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class {
WebDriver driver;
public void robotLaunch() throws AWTException
{
driver=new ChromeDriver();
driver.get("https://www.ilovepdf.com/pdf_to_word");
driver.manage().window().maximize();

WebElement choose=driver.findElement(By.xpath("//span[text()='Select PDF file']"));

StringSelection s = new StringSelection("C:\\Users\\jeffk\\OneDrive\\Documents\\annu travel.pdf");
// Clipboard copy
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null); //cpaste to clipboard
//choose.click();

//Robot object creation
Robot r = new Robot();
//pressing enter
 r.delay(250);
r.keyPress(KeyEvent.VK_ENTER);

//releasing enter
r.keyRelease(KeyEvent.VK_ENTER);

//pressing ctrl+v
r.keyPress(KeyEvent.VK_CONTROL);//two commands for pate
r.keyPress(KeyEvent.VK_V);//two

//releasing ctrl+v
r.keyRelease(KeyEvent.VK_CONTROL);//release command
r.keyRelease(KeyEvent.VK_V);
	     
//pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      
	      //releasing enter
	      r.delay(90);
	      r.keyRelease(KeyEvent.VK_ENTER);
}
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		Robot_Class obj=new Robot_Class();
		obj.robotLaunch();
	}

}
