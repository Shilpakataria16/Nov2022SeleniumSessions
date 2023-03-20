package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElements {

	public static void main(String[] args) throws InterruptedException {
		//SVG - scaler vector graphs
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		String svgXPath ="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		List<WebElement> statesList = driver.findElements(By.xpath(svgXPath));
		System.out.println(statesList.size());
		
		for(WebElement e:statesList) {
			 String stateName = e.getAttribute("name");
			System.out.println(stateName);
			
			if(stateName.equals("Kansas")) {
				e.click();
				break;
			}
		}
		
		String countiesXPath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='subregion']//*[name()='path']";
		List<WebElement> countiesList = driver.findElements(By.xpath(countiesXPath));
		System.out.println(countiesList.size());
		
		for(WebElement e: countiesList) {
			System.out.println(e.getAttribute("name"));
		}
		
	}
	//assignments: after clicking state find number of regions
	
	//*[local-name()='svg']//*[name()='g' and @fill-rule='evenodd']

	//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='missouri']//*[name()='g' and @class='subregion']//*[name()='path']
}
