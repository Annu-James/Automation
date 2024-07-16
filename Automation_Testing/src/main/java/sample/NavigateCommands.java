package sample;

public class NavigateCommands extends Base {

	public void navigateCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigateCommands nav=new NavigateCommands();
		nav.initialiseBrowser();
		nav.navigateCommands();
	}

}
