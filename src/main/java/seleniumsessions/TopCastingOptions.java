package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		//1.browser specific: can not be used for cross browser
		ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver1= new FirefoxDriver();
		
		//2.
		//WD = new CD -- valid top casting - recommended
		WebDriver driver2 = new ChromeDriver();
		
		//3. SC = new CD
		//SC had only 2 methods. valid but not recommended
		SearchContext driver3=new ChromeDriver();
		
		//4. RemoteWD = new CD --valid top casting - recommended -local
		RemoteWebDriver driver4=new ChromeDriver();
		
		//5. WD = new RWD --valid top casting - recommended - GRID - used for remote execution
		WebDriver driver5=new RemoteWebDriver(null);
		
		//6.SC = new RWD --valid but not recommended
		SearchContext driver6=new RemoteWebDriver(null);
		
	}

}
