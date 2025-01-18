package week2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		
		
		String d1=d.getCurrentUrl();
		System.out.println(d1);
		//d.close()
	}

}
