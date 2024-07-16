package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base_1{
public void idLocator()
{
	WebElement id=driver.findElement(By.id("single-input-field"));
	WebElement id1=driver.findElement(By.id("value-a"));
	WebElement id2=driver.findElement(By.id("message-one"));
	WebElement id3=driver.findElement(By.id("value-b"));
	WebElement id4=driver.findElement(By.id("message-two"));
	WebElement id5=driver.findElement(By.id("button-one"));
}
public void classLocator()
{

	WebElement class1=driver.findElement(By.className("clearfix"));
	WebElement class2=driver.findElement(By.className("card-body"));
	WebElement class3=driver.findElement(By.className("box2 col-md-6"));
	WebElement class4=driver.findElement(By.className("btn btn-success btn-block"));
	WebElement class5=driver.findElement(By.className("card-body"));
	WebElement class6=driver.findElement(By.className("mb-sec"));
	WebElement class7=driver.findElement(By.className("header-top"));
}
public void nameLocator()
{
	WebElement name=driver.findElement(By.name("viewport"));
	WebElement name1=driver.findElement(By.name("duallistbox_demo1[]_helper2"));
	WebElement name2=driver.findElement(By.name("duallistbox_demo1[]_helper1"));
	WebElement name3=driver.findElement(By.name("description"));
	WebElement name4=driver.findElement(By.name("keywords"));
	WebElement name5=driver.findElement(By.name("author"));
}
public void linkText()
{
	WebElement link=driver.	findElement(By.linkText("simple-form-demo.php"));
	WebElement link1=driver.findElement(By.linkText("select-input.php"));
	WebElement link2=driver.findElement(By.linkText("check-box-demo.php"));
	WebElement link3=driver.findElement(By.linkText("radio-button-demo.php"));
}
public void partialLinkText()
{
WebElement partial=driver.findElement(By.partialLinkText("simple-form"));
WebElement partial1=driver.findElement(By.partialLinkText("radio-button"));
WebElement partial2=driver.findElement(By.partialLinkText("select-input"));
WebElement partial3=driver.findElement(By.partialLinkText("jquery-select"));
}
public void cssSelector()
{
	//tag and id- tag#id
	WebElement css=driver.findElement(By.cssSelector("input#single-input-field"));
	WebElement css00=driver.findElement(By.cssSelector("a#progress-bars"));
	WebElement css000=driver.findElement(By.cssSelector("a#others"));
	
	//tag and class- tag.class
	WebElement css1=driver.findElement(By.cssSelector("div.card-header"));
	WebElement css10=driver.findElement(By.cssSelector("div.header-top"));
	WebElement css11=driver.findElement(By.cssSelector("button.navbar-toggler"));
	
	//tag and attribute- tag[attribute type=attritube value]
	WebElement css2=driver.findElement(By.cssSelector("input[placeholder=Message]"));
	WebElement css20=driver.findElement(By.cssSelector("a[id=alert-modal]"));
	WebElement css21=driver.findElement(By.cssSelector("div[class=header-top]"));
	
	//tag,class, attritube- tag.class[attribute type=attritube value]
	WebElement css3=driver.findElement(By.cssSelector("button.navbar-toggler[type=button]"));
	WebElement css30=driver.findElement(By.cssSelector("input.form-control[type=text]"));
	WebElement css31=driver.findElement(By.cssSelector("a.nav-link[id=alert-modal]"));
}
	
	public void xpath1()
	{

		//Relative Xpath
		//tag name[@attribute type = 'attribute value']
		WebElement relative1 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement relative2 = driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement relative3 =driver.findElement(By.xpath("//input[@placeholder='Message']"));
		WebElement relative4=driver.findElement(By.xpath("//button[@type='button']"));
		
		//absolute xpath
		WebElement absolute = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div[1]/input"));
		WebElement absolute2=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/nav/button"));
		
		//Dynamic xpath - contains
	    WebElement xpath1=driver.findElement(By.xpath("//a[contains(@id,'progress-bars')]"));
		WebElement xpath2=driver.findElement(By.xpath("//a[contains(@id,'alert-modal')]"));
		WebElement xpath3=driver.findElement(By.xpath("//button[contains(@class,'navbar-toggler')]"));
		
		//Dynamic text
		//tag name[text()='text message']
		
		WebElement text1=driver.findElement(By.xpath("//label[text()='Enter Message']"));
		WebElement text2 = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement text3 = driver.findElement(By.xpath("//button[text()='Show Message']"));
		
}
	public void child()
	{
		// tagname[@attritube type='attritube value']//child::tag[@attritube type='value']
		WebElement ch1=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//child::li[2]"));
	
	}
	public void parent()
	{
		WebElement parent1=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
		WebElement parent2=driver.findElement(By.xpath("//input[@type='text']//parent::div"));
	}
		public void following()
		{
		WebElement follow1=driver.findElement(By.xpath("//button[@class='navbar-toggler']//following::div[@id='collapsibleNavbar']"));
		
		}
	public void indexing()
	{
		WebElement index1=driver.findElement(By.xpath("(//form[@method='POST'])[1]"));
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
