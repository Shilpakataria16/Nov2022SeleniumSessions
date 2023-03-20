package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropdownHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial#free-trial-info-menu");
		
		//WebElement country_ele=driver.findElement(By.id("Form_getForm_Country"));
		
		//dropdown -- html tag --> <select>
		//use Select class in selenium
		
//		Select select = new Select(country_ele);
//		
//		select.selectByIndex(5);
//		select.selectByValue("Belgium");
//		select.selectByVisibleText("India");
		By country = By.id("Form_getForm_Country");
		doSelectDropDownByIndex(country, 5);
		Thread.sleep(2000);
		doSelectDropDownByValue(country, "Belgium");
		Thread.sleep(2000);
		doSelectDropDownByText(country, "India");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectDropDownByValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void doSelectDropDownByText(By locator,String text) {
		Select select = new Select(getElement(locator));
		select.selectByValue(text);
	}
	
}
