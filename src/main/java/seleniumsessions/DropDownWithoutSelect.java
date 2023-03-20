package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial#free-trial-info-menu");
		
		//By country = By.id("Form_getForm_Country");
		By options =By.xpath("//select[@id='Form_getForm_Country']/option");
		List<WebElement> optionsList = driver.findElements(options);
		
		System.out.println(optionsList.size());
		
		//select[@id='Form_getForm_Country']/option
		for(WebElement e:optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("India")) {
				e.click();
				break;
			}
		}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void selectDropDownValue_WithoutSelect(By locator,String expValue) {
		List<WebElement> optionsList =getElements(locator);
		for(WebElement e:optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(expValue)) {
				e.click();
				break;
			}
		}
	}

}
