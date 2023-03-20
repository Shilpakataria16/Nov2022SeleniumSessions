package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
		static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By pwd = By.id("input-password");
		By loginBtn = By.xpath("//input[@type='submit']");
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement email_ele =wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		email_ele.sendKeys("test@gmail.com");
		
		waitForElementPresence(emailId,10).sendKeys("test@gmail.com");
		getElement(pwd).sendKeys("test@123");
		getElement(loginBtn).click();
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	/*
	 * An expectation for checking that an element is present on the DOM of a page. This does notnecessarily mean that the element is visible.
	 */
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/*
	 * An expectation for checking that an element is present on the DOM of a page and visible.Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.
	 */
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
