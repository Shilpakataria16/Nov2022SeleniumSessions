package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment_RegisterationPage {
	static WebDriver driver;
	
	public static void main(String[] args) {
		//Initializing browser driver and launching URL
		String browserName = "chrome";
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.initDriver(browserName);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		//By locators
		By firstName = By.id("input-firstname");
		By lastName = By.name("lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By subscribeRadioBtn = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By privacyPolicyCheckBox = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
		By submitBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By accCreationHeader = By.tagName("h1");
		
		//performing actions on locators
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Jerry3");
		eleUtil.doSendKeys(lastName, "Jia3");
		eleUtil.doSendKeys(email, "JerryJia3@gmail.com");
		eleUtil.doSendKeys(telephone, "9891278999");
		eleUtil.doSendKeys(password, "Jerry@123");
		eleUtil.doSendKeys(confirmPassword, "Jerry@123");
		eleUtil.doClick(subscribeRadioBtn);
		eleUtil.doClick(privacyPolicyCheckBox);
		eleUtil.doClick(submitBtn);
		
		//Verifying account is created successfully
		String accCreationHeaderTxt = eleUtil.getElement(accCreationHeader).getText();
		if(accCreationHeaderTxt.equals("Your Account Has Been Created!")) {
			System.out.println("Account has been created successfully");
		}
		else
			System.out.println("Account creation unsuccessfull");

	}

}
