package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement accAndListEle = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions act = new Actions(driver);
		act.moveToElement(accAndListEle).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		
	}

}
