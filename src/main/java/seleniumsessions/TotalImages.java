package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		System.out.println(imagesList.size());
		
		//registeration page how many text fields
		
		//FE vs FEs
		//Returns WebElement  List<WebElement>
		//NoSuchEle Execption      empty list -- size=0
		//any action        no action
		
		//assignments
		//https://classic.crmpro.com/
		//find all the paragraphs
		//capture text and print all
	}

}
