package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextForTextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement fn = driver.findElement(By.id("input-firstname"));
		fn.sendKeys("testing");
		String name = fn.getText();
		System.out.println(name);
		String nameValue = fn.getAttribute("value");
		System.out.println(nameValue);
		
		
		WebElement ln = driver.findElement(By.id("input-lastname"));
		ln.sendKeys(null);
		
	}

}
