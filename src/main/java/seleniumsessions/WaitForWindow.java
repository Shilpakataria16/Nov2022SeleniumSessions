package seleniumsessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		By twitterEle = By.xpath("//a[contains(@href,'twitter')]");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickWhenReady(10, twitterEle);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		//get the window ids
		Set<String> handles =driver.getWindowHandles();
		Iterator<String> it= handles.iterator(); //point to just before parent
		String parentWindowId = it.next();
		System.out.println("parent windiow id is "+ parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child windiow id is "+ childWindowId);
		
		//switch to window
		driver.switchTo().window(childWindowId);
		System.out.println("child window url: "+ driver.getCurrentUrl());
		
		driver.close();//close the child window
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url: "+ driver.getCurrentUrl());
		
		driver.quit();
				
	}

}
