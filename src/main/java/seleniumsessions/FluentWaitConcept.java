package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
		static WebDriver driver;
	public static void main(String[] args) {
		//WebDriverWait--> FluentWait --> Wait
		//Default polling time is 500 milliseconds
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com");
		By freeTrial = By.xpath("//a[@title='FREE TRIALS']");
		
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				.ignoring(NoSuchElementException.class)
//				.ignoring(StaleElementReferenceException.class)
//				.pollingEvery(Duration.ofSeconds(2))
//				.withMessage("Element is not found on tha page");
//		
//		WebElement freeTrialEle = wait.until(ExpectedConditions.presenceOfElementLocated(freeTrial));
		WebElement freeTrialEle =waitForElementPresenceWithFluentWait(10,2,freeTrial);
		freeTrialEle.click();
	
	}

	public static WebElement waitForElementPresenceWithFluentWait(int timeOut,int pollingTime,By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.withMessage("Element is not found on tha page");
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static void waitForAlertWithFluentWait(int timeOut,int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.ignoring(NoAlertPresentException.class)
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.withMessage("Alert is not found on tha page");
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
}
