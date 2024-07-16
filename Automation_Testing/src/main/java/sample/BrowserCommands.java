package sample;

public class BrowserCommands extends Base{
	public void browerCommand()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands bc=new BrowserCommands();
		bc.initialiseBrowser();
		bc.browerCommand();
		
	}

}
