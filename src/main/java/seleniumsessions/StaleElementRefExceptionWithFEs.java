package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionWithFEs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.freshworks.com/");
//		List<WebElement> footerList = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1]//a"));
//		
//		for(WebElement e:footerList) {
//			e.click();
//			footerList = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1]//a"));
//		}
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> linksList = driver.findElements(By.xpath("//footer//a"));//v1
		
		for(int i=0; i<linksList.size(); i++) {
			linksList.get(i).click();//v1 
			driver.navigate().back();
			Thread.sleep(2000);
			linksList = driver.findElements(By.xpath("//footer//a"));
			
		}
	}

}
