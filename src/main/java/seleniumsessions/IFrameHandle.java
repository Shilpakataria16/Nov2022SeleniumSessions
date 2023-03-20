package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("2019");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Honda");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("H-90");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Black");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("900");
		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("NASH-8989");
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Honda Civic");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("6778 Test drive");
		driver.findElement(By.id("RESULT_TextField-11")).sendKeys("Denver");
		
		Select stateSelect = new Select(driver.findElement(By.id("RESULT_RadioButton-12")));
		stateSelect.selectByVisibleText("Alaska");
		
		
		driver.findElement(By.id("RESULT_TextField-13")).sendKeys("567845");
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("9989779657");
		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("testuser@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().defaultContent();
	}

}
