package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");   //DOM version-1
		
		WebElement fn = driver.findElement(By.id("input-email")); //version v1
		fn.sendKeys("gh@gmail.com");   //v1
		
		driver.navigate().refresh();   //DOM version-2
		//DOM is updated
//		fn.sendKeys("asd@gmail.com");  //StaleElementException   //version -1 
		
		fn = driver.findElement(By.id("input-email"));
		fn.sendKeys("asd@gmail.com");  //StaleElementException
		
		
	}

}
