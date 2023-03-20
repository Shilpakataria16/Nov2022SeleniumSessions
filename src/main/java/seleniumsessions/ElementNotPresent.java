package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementNotPresent {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logoImage = By.className("img-responsive");
		By search = By.name("search");
		
		//WebElement + action
		boolean flagImg = driver.findElement(By.className("img-responsive")).isDisplayed();
		if(flagImg)
			System.out.println("PASS");
		//FindElement will throw NoSuchElementException
		
	}

}
