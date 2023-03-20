package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {
		static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By fName = By.id("input-firstname");
		By lName = By.id("input-lastname");
		By continueBtn = By.cssSelector("input[type='submit']");
		
		Actions act = new Actions(driver);
		
//		act.sendKeys(driver.findElement(fName), "fName1").build().perform();
//		act.sendKeys(driver.findElement(lName),"lName1").build().perform();
//		act.click(driver.findElement(continueBtn)).build().perform();
//		
		
		//ElementNotInteractableException
		//ElementNotInterceptedException
		
		doActionsSendKeys(fName, "fName1");
		doActionsSendKeys(lName, "lName1");
		doActionsClick(continueBtn);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}
}
