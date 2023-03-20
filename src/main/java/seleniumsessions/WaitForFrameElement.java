package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrameElement {
		static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		waitForFrameAndSwitchToItByIDOrName(10,"mainpanel");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainpanel"));
		
		
//		waitForFrameAndSwitchToItByFrameElement(10,driver.findElement(By.name("mainpanel")));
		
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		
		driver.switchTo().defaultContent();
	}

	public static void waitForFrameAndSwitchToItByIDOrName(int timeOut,String idOrName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}
	
	public static void waitForFrameAndSwitchToItByIndex(int timeOut,String frameIndex) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	public static void waitForFrameAndSwitchToItByFrameElement(int timeOut,WebElement frameElement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	public static void waitForFrameAndSwitchToItByFrameLocator(int timeOut,By frameLocator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
}
