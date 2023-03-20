package seleniumsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Assignment_RelativeLocators {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement email = driver.findElement(By.id("input-email"));
		
		WebElement emailLabel = driver.findElement(with(By.tagName("label")).above(email));
		String emailLabelTxt= driver.findElement(with(By.tagName("label")).above(email)).getText();
		System.out.println(emailLabelTxt);
		
		String pwdLabelTxt = driver.findElement(with(By.tagName("label")).below(email)).getText();
		System.out.println(pwdLabelTxt);
		
		String returnCust = driver.findElement(with(By.tagName("h2")).near(emailLabel)).getText();
		System.out.println("h2 text "+returnCust);
		if(returnCust.equals("Returning Customer")) {
			System.out.println("Returning Customer header is present");
		}
		else
			System.out.println("Error: Returning Customer header is not present");
	}
}
