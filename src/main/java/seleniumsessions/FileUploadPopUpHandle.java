package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUpHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\shilp\\Downloads\\100-chart-tracing-printable_349213.png");
		// <tag type="file">  -- this is mandatory attribute for above solution
		
		//autoIT(works only in windows)/Sikuli/Robot  (not recommended)
		
		
		
	}

}
