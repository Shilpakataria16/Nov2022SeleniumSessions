package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableHandle {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	
		int headerCount = getTableHeaderCount();
		System.out.println(headerCount);
		
		int rowCount = getRowCount();
		System.out.println(rowCount);
		
		//table[@id="customers"]/tbody/tr[2]/td[1]
		
		String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int i=2;i<=7;i++) {
			String xPath = beforeXpath + i + afterXpath;
			String companyValue = driver.findElement(By.xpath(xPath)).getText();
			System.out.println(companyValue);
		}
	}

	public static int getTableHeaderCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}
	
	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
	}
}
