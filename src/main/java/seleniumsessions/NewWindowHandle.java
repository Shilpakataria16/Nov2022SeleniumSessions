package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindowId = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);//sel 4.x
		
		driver.get("https://www.google.com");
		System.out.println("child window title "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title "+ driver.getTitle());
		
		//random pop ups: can not be handled
		//QA/Stage/Test environment - block these pop ups
	}

}
