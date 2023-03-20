package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromPageSection {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");	
		
//		List<WebElement> panelLinksList= driver.findElements(By.xpath("//aside[@id='column-right']//a"));
//		System.out.println(panelLinksList.size());
//		for(WebElement e:panelLinksList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		By rightPanelLinks=By.xpath("//aside[@id='column-right']//a");
		
		//assignment for footer links
		List<String> rightElementsList = getElementsTextList(rightPanelLinks);
		System.out.println(rightElementsList.contains("Login"));
		System.out.println(rightElementsList.contains("Wish List"));
		System.out.println(rightElementsList.contains("Newsletter"));
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static List<String> getElementsTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for(WebElement e: eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}

}
