package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(5000);
	
		//browser -> page -> shadowDOM element -> input element
	
		//document.querySelector("#userName").shadowRoot.querySelector("#app2")
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement pizza =(WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
		pizza.sendKeys("pineapple pizza");
		
		//shadow root should be open
		
	}

}
