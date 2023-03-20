package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//top casting WebDriver driver = new ChromeDriver()
		//first 3 steps: automation
		//1. open browser: chrome,ff
		//ChromeDriver driver = new ChromeDriver();
		String browser = "chrome";
		WebDriver driver = null;
		
		//cross browser logic
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		} 
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("plz pass the right browser");
		}
		
		//2. enter url
		driver.get("https://www.google.com");
		
		//3. get the title
		String actualTitle = driver.getTitle();
		System.out.println("page title: "+actualTitle);

		//validation point/checkpoint:
		if(actualTitle.equals("Google")) {
			System.out.println("PASS");
		}
		else
			System.out.println("FAIL");
		
		//Automation steps + validation/assertions = Automation Testing
		
		driver.quit();
	}

}
