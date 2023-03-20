package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSwitchCase {

	public static void main(String[] args) {
		String browser = "chrome";
		WebDriver driver = null;
		switch(browser){
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			default:
				System.out.println("plz pass the right browser");
			
		}
		
		driver.get("https://amazon.com");
		
		//3. get the title
		String actualTitle = driver.getTitle();
		System.out.println("page title: "+actualTitle);

		//validation point/checkpoint:
		if(actualTitle.equals("Amazon")) {
			System.out.println("PASS");
		}
		else
			System.out.println("FAIL");
		
		driver.quit();
				

	

	}

}
