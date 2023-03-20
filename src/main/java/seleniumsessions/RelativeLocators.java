package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		// Sel 4.x
		//above near left right below
		
		//   . is base element
		
//				above
//			near	
//		left     .      right
//				below
//		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");

		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.linkText("Kent,Canada"));
		
		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndex);
		
		
		String leftIndex = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftIndex);
		
		
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		String nearCity= driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearCity);
		
		//assignment: naveen app
		//label above txtbox and returning cust near
		
	}

}
