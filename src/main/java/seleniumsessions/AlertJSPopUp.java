package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopUp {

	public static void main(String[] args) throws InterruptedException {
		//js alert - alert, prompt, confirm
		//auth pop up
		// browser window pop up/adv pop up
		//file upload pop up
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		Thread.sleep(3000);
//		
//		Alert alert =driver.switchTo().alert();
//		//NoAlertPresentException
//		String txt = alert.getText();
//		System.out.println(txt);
//		
//		alert.accept();  //click on OK button
//		//alert.dismiss();  (press Esc key from keyboard to cancel the alert)
//		
		
		//confirm alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		
//		Alert alert =driver.switchTo().alert();
//		//NoAlertPresentException
//		String txt = alert.getText();
//		System.out.println(txt);
//		
//		alert.accept();  //click on OK button
//		//alert.dismiss();  (press Esc key from keyboard to cancel the alert)
//		
		
		//prompt alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert =driver.switchTo().alert();
		alert.sendKeys("test");
		alert.accept();
		//alert.dismiss();
		
	}

}
