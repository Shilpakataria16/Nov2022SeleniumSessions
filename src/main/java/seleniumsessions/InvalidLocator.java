package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//driver.findElement(By.xpath("////input[@@@id='name']")).sendKeys("te");   //InvalidSelectorException
		
		
		driver.findElement(By.xpath("//input[@id='teste']")).sendKeys("te");  //NoSuchElementException
		
		//NoAlertException
		
	}

}
