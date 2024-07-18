package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table_Handling extends Base_1{

	public void fullTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
		
	}
	public void selectRow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
		System.out.println(row.getText());
	}
	
	public void selectParticularElement()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement selectData=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]/td[2]"));
		System.out.println(selectData.getText());
	}
	
	public void searchElement()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String inputData="Software Engineer";
		List<WebElement> searchEle=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement element:searchEle)
		{
			if(element.getText().equals(inputData))
			{
				
				System.out.println(element.getText());
			}
		}
		
	}
	
	public void selectColumn()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement option:column)
		{
			System.out.println(option.getText());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table_Handling obj=new Table_Handling();
		obj.initialiseBrowser();
		obj.fullTable();
		System.out.println("--------------");
		obj.selectRow();
		System.out.println("--------------");
		obj.selectParticularElement();
		System.out.println("--------------");
		obj.searchElement();
		System.out.println("--------------");
		obj.selectColumn();
	}

}
