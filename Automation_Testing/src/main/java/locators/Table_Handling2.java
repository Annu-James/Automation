package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table_Handling2 extends Base_1{
	
	public void fullTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement page2=driver.findElement(By.xpath("//a[@data-dt-idx='2']"));
		page2.click();
		WebElement table2=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table2.getText());
	}
	
	public void selectRow2()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement page2=driver.findElement(By.xpath("//a[@data-dt-idx='2']"));
		page2.click();
		WebElement row2=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[6]"));
		System.out.println(row2.getText());
	}
	
	public void selectElement2()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement page2=driver.findElement(By.xpath("//a[@data-dt-idx='2']"));
		page2.click();
		WebElement particularElement2=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[7]/td[2]"));
		System.out.println(particularElement2.getText());
		
	}
	public void selectColumn2()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement page2=driver.findElement(By.xpath("//a[@data-dt-idx='2']"));
		page2.click();
		List<WebElement> column2=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement opt:column2)
		{
			System.out.println(opt.getText());
		}
	}
	public void searchElement2()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement page2=driver.findElement(By.xpath("//a[@data-dt-idx='2']"));
		page2.click();
		List<WebElement> tableSearch=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td"));
		String input2="Haley Kennedy";
		for(WebElement search2: tableSearch)
		{
			if(search2.getText().equals(input2))
			{
				System.out.println(search2.getText());
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table_Handling2 obj=new Table_Handling2();
		obj.initialiseBrowser();
		//obj.fullTable();
		//obj.selectRow2();
		//obj.selectElement2();
		//obj.selectColumn2();
		obj.searchElement2();
		
	}

}
