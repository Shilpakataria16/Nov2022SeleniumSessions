package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//find total number of links on amazon using XPath
public class Assignment1_Xpath {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List<WebElement> totalLinks=driver.findElements(By.xpath("//a"));
		System.out.println("total links on amazon page "+totalLinks.size());
		
		List<WebElement> totalImages=driver.findElements(By.xpath("//img"));
		System.out.println("total Images on amazon page "+totalImages.size());
		
		List<WebElement> totalInput=driver.findElements(By.xpath("//input"));
		System.out.println("total Inputs on amazon page "+totalInput.size());
		
		
		
	}

}
