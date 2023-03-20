package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		String ph = driver.findElement(By.name("firstname")).getAttribute("placeholder");
//		System.out.println(ph);
//		
//		String srcValue= driver.findElement(By.className("img-responsive")).getAttribute("src");
//		String titleValue= driver.findElement(By.className("img-responsive")).getAttribute("title");
//		
		By fn=By.name("firstname");
		By logo = By.className("img-responsive");
		
		String ph = getElementAttribute(fn,"placeholder");
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String getElementAttribute(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
}
