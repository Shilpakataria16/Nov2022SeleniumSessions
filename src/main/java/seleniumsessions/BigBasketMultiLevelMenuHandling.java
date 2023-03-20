package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://bigbasket.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement shopParentEle = driver.findElement(By.cssSelector("a.meganav-shop"));
		
		Actions act = new Actions(driver);
		act.moveToElement(shopParentEle).build().perform();
		
		Thread.sleep(2000);
		
		By L1Cat = By.cssSelector("a.meganav-shop");
		selectProductLevel4Handling(L1Cat,"Beverages","Tea","Tea Bags");
//		WebElement L2Ele = driver.findElement(By.linkText("Beverages"));
//		act.moveToElement(L2Ele).build().perform();
//		Thread.sleep(2000);
//		
//		WebElement L3Ele = driver.findElement(By.linkText("Tea"));
//		act.moveToElement(L3Ele).build().perform();
//		Thread.sleep(2000);
//		
//		WebElement L4Ele = driver.findElement(By.linkText("Tea Bags"));
//		L4Ele.click();
//		
	}

	public static void selectProductLevel4Handling(By l1Bylocator,String l2,String l3, String l4) throws InterruptedException {
		WebElement shopParentEle = driver.findElement(l1Bylocator);
		
		Actions act = new Actions(driver);
		act.moveToElement(shopParentEle).build().perform();
		
		Thread.sleep(2000);
		
		WebElement L2Ele = driver.findElement(By.linkText(l2));
		act.moveToElement(L2Ele).build().perform();
		Thread.sleep(2000);
		
		WebElement L3Ele = driver.findElement(By.linkText(l3));
		act.moveToElement(L3Ele).build().perform();
		Thread.sleep(2000);
		
		WebElement L4Ele = driver.findElement(By.linkText(l4));
		L4Ele.click();
		
	}
}
