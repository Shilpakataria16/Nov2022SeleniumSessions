package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegPageTest {
	static WebDriver driver;
	public static void main(String[] args) {
		String browserName = "chrome";
//		String browserName = "edge";
		
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.initDriver(browserName);
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String title = brUtil.getPageTitle();
		System.out.println(title);
		
		//1st type
//		driver.findElement(By.id("input-firstname")).sendKeys("Jerry");
//		driver.findElement(By.id("input-lastname")).sendKeys("Jia");
//		driver.findElement(By.id("input-email")).sendKeys("JerryJia@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("9897678999");
//		driver.findElement(By.id("input-password")).sendKeys("Jerry@123");
//		driver.findElement(By.id("input-confirm")).sendKeys("Jerry@123");
		
		//2nd type
//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		WebElement lastName = driver.findElement(By.id("input-lastname"));
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement telephone = driver.findElement(By.id("input-telephone"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		WebElement confirmPassword = driver.findElement(By.id("input-confirm"));
//		
//		firstName.sendKeys("Jerry");
//		lastName.sendKeys("Jia");
//		email.sendKeys("JerryJia@gmail.com");
//		telephone.sendKeys("9897678999");
//		password.sendKeys("Jerry@123");
//		confirmPassword.sendKeys("Jerry@123");
		
		//3rd type
//		By firstNameBy = By.id("input-firstname");
//		By lastNameBy = By.id("input-lastname");
//		By emailBy = By.id("input-email");
//		By telephoneBy = By.id("input-telephone");
//		By passwordBy = By.id("input-password");
//		By confirmPasswordBy = By.id("input-confirm");
//		
//		WebElement firstName = driver.findElement(firstNameBy);
//		WebElement lastName = driver.findElement(lastNameBy);
//		WebElement email = driver.findElement(emailBy);
//		WebElement telephone = driver.findElement(telephoneBy);
//		WebElement password = driver.findElement(passwordBy);
//		WebElement confirmPassword = driver.findElement(confirmPasswordBy);
//		
//		firstName.sendKeys("Jerry");
//		lastName.sendKeys("Jia");
//		email.sendKeys("JerryJia@gmail.com");
//		telephone.sendKeys("9897678999");
//		password.sendKeys("Jerry@123");
//		confirmPassword.sendKeys("Jerry@123");
//		
		//4th type: By locator + generic method for WebElement
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By email = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By confirmPassword = By.id("input-confirm");
//		
//		getElement(firstName).sendKeys("Jerry");
//		getElement(lastName).sendKeys("Jia");
//		getElement(email).sendKeys("JerryJia@gmail.com");
//		getElement(telephone).sendKeys("9897678999");
//		getElement(password).sendKeys("Jerry@123");
//		getElement(confirmPassword).sendKeys("Jerry@123");
//		
		//5th type: By locator + generic method for WebElement and actions
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		doSendKeys(firstName,"Jerry");
		doSendKeys(lastName, "Jia");
		doSendKeys(email, "JerryJia@gmail.com");
		doSendKeys(telephone, "9897678999");
		doSendKeys(password, "Jerry@123");
		doSendKeys(confirmPassword, "Jerry@123");
		
		//by locators:
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By email = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By confirmPassword = By.id("input-confirm");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(firstName, "Jerry");
//		eleUtil.doSendKeys(lastName, "Jia");
//		eleUtil.doSendKeys(email, "JerryJia@gmail.com");
//		eleUtil.doSendKeys(telephone, "9897678999");
//		eleUtil.doSendKeys(password, "Jerry@123");
//		eleUtil.doSendKeys(confirmPassword, "Jerry@123");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
}
