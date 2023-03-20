package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //sele3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //sel 4.x
		
		//global wait: 10 sec
		//it will be applied for all elements by default
		//FindElement - implicit wait will be applied automatically
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("asdb@gmail.com"); //10-5=5
		driver.findElement(By.id("input-password")).sendKeys("asdd7676");//10-2=8
		driver.findElement(By.xpath("//input[@type='submit']")).click();//10-6=4
		//ele4 -- 10 sec
		//ele5 --10 sec
		
		
		//home page: 20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		//global wait: 20 secs
		//ele6 ele7 ele8 -- 20 secs
		
		
		//login page: 20 secs- 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//register: 5 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//login:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//forgotpwd: 0 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		
		//only for webelement: svg,iframe,WEs
		//it does not support non web elements: title,url,alert-js
		
		
	}

}
