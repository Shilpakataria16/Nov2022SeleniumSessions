package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
		Thread.sleep(4000);
		
		selectUser("deepti gupta");
		String companyName1 = getUserCompanyName("deepti gupta");
		System.out.println(companyName1);
		String userPhone1=getUserPhone("deepti gupta");
		System.out.println(userPhone1);
		
		selectUser("Ali khan");
		String companyName2 = getUserCompanyName("Ali khan");
		System.out.println(companyName2);
		String userPhone2 = getUserPhone("Ali khan");
		System.out.println(userPhone2);
		
		
		
	}

	//driver.findElement(By.xpath("//a[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	//a[text()='Ali khan']/parent::td/following-sibling::td/a[@context='company']
	public static String getUserCompanyName(String userName) {
		return driver.findElement(By.xpath("//a[text()='"+ userName +"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}
	
	// (//a[text()='Ali khan']/parent::td/following-sibling::td)[2]/span[@context='phone']
	public static String getUserPhone(String username) {
		return driver.findElement(By.xpath("(//a[text()='"+ username +"']/parent::td/following-sibling::td)[2]/span[@context='phone']")).getText();
	}

	


}
