package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		String uName = "admin";
		String pwd = "admin";
		
		driver.get("https://"+uName+":" + pwd + "@the-internet.herokuapp.com/basic_auth");
		
		
	}

}
