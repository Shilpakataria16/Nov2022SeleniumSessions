package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {
	static WebDriver driver;

	public static void main(String[] args) {
		//8 locators:
		//id,name,classname, xpath,css selector,linktext,partial link text, tag name
		
		
		
		
		//create a webelement + perform action(click, sendkeys, gettext, isDisplayed..)
		
		//create a webelement: need a locator
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//1. id:
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
		//2. name:
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
//	
//		By emailId = By.name("email");
//		
		//3. class name: can be duplicate most of the time - not recommended
		//use class name only if its unique
		//driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
		
		//4. xpath: its not an attribute. Its the address of the lement in HTML DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
//		By emailId = By.xpath("//*[@id=\\\"input-email\\\"]");
//		By password = By.xpath("//*[@id=\"input-password\"]");
//		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		doSendKeys(emailId,"naveen@gmail.com");
//		doSendKeys(password,"naveen@123");
//		doClick(loginBtn);
		
		//5. css selector: not an attribute
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
//		
		
		//6. linkText:only for links --> htmltag = a
		//: not an attribute --its the text of the link
		//linkText can be duplicate
		//driver.findElement(By.linkText("Register")).click();
//		By registerationLink = By.linkText("Register");
//		doClick(registerationLink);
		
		//7. partialLinkText: only for links
//		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		//8. tagName:htmlTag
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		//getText:links,headers,paragraph,footer
		By payment = By.linkText("Recurring payments");
		String val = doElementGetText(payment);
		System.out.println(val);
	
		
		//click: button,checkboxes,radiobutton,images,link
		//sendkeys:textbox/textfield,dropdown,fileupload
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static String doElementGetText(By locator) {
		return getElement(locator).getText();
		
	}
	
	//Assignment: fill registration form, click continue,next page capture text n verify
	//click on order history
}
