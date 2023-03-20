package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.linkText("Forgotten Password")).click();
		System.out.println(driver.getTitle());

		String title = waitForTitleContainsAndFetch(10,"Password?");
		if(title.contains("Forgot your password?")) {
			System.out.println("Pass");
		}
		
		driver.navigate().to("https://amazon.com");
		driver.findElement(By.linkText("Mobiles")).click();
		if(waitForURLContainsAndFetch(10, "mobile-phones")) {
			System.out.println("Url is correct");
		}
		else
			System.out.println("Url is incorrect");
	}

	public static String waitForTitleContainsAndFetch(int timeOut,String titleFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleContains(titleFractionValue));
		return driver.getTitle();
	}
	public static String waitForTitleIsAndFetch(int timeOut,String titleFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleIs(titleFractionValue));
		return driver.getTitle();
	}
	
	public static Boolean waitForURLContainsAndFetch(int timeOut,String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.urlContains(urlFractionValue));
	}
	
	public static Boolean waitForURLIsAndFetch(int timeOut,String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.urlToBe(urlValue));
	}
	
}
