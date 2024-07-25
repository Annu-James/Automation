package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {
WebDriver driver;
public void fileLaunch()
{
driver=new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/upload");
driver.manage().window().maximize();

WebElement file=driver.findElement(By.id("file-upload"));

file.sendKeys("C:\\Users\\jeffk\\OneDrive\\Desktop\\Jeff\\Car RC Book.pdf");

WebElement upload=driver.findElement(By.xpath("//input[@id='file-submit']"));
upload.click();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File_Upload obj=new File_Upload();
		obj.fileLaunch();
	}

}
