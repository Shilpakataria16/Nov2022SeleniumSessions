package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String pgSrc=driver.getPageSource();
		System.out.println(pgSrc);
		if(pgSrc.contains("")) {
			System.out.println("PASS");
		}
		
	}

}
