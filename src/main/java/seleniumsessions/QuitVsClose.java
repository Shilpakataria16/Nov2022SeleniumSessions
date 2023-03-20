package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		//SID - session id
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		System.out.println(driver.getTitle()); //NoSuchSessionException. Session ID is null
		
		driver.close();
		System.out.println(driver.getTitle()); //NoSuchSessionException. Invalid session id
	}

}
