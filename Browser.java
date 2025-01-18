package week2;
public class Browser {

	public  String Browser(String browserName) 
	{
		// TODO Auto-generated method stub
		System.out.println("Browser launch is success");
		return browserName;

	}
	
	void loadUrl()
	{
		System.out.println("App URL loaded success");
		
	}
	
	public static void main(String args[])
	{
	Browser b1=new Browser();
	b1.Browser("browserName");

	b1.loadUrl();
	}
}


