package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		
		driver.switchTo().defaultContent();
		
		//a[@title='Contacts']
		
//		driver.get("https://demoqa.com/frames");
//
//		int totalFrames = driver.findElements(By.xpath("//iframe")).size();
////		driver.switchTo().frame(0);
////		driver.switchTo().frame("frame1");
//		driver.switchTo().frame(driver.findElement(By.id("frame1")));
//		String header = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
//		
//		System.out.println(header);
//		
//		driver.switchTo().defaultContent();
		
		//frame
		//iframe  -security of the web element
		
	}

}
