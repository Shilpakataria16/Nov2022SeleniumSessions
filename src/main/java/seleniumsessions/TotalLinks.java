package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

		//find all links on the page
		//print the total links count
		//print the text of each link
		
		
		static WebDriver driver;

		public static void main(String[] args) {
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com");
			List<WebElement> linksList = driver.findElements(By.tagName("a"));
			int linksCount =linksList.size();
			System.out.println("total links:" + linksCount );
			
			//print the text of each link
			//and avoid the blank text
//			for(int i=0;i<linksCount;i++) {
//				String text = linksList.get(i).getText();
//				if(text.length()>0) {
//					System.out.println(i+":"+text);
//				}
//			}
			
			//get total blank links count --assignment
			//for each:
			int count =1;
			for(WebElement e: linksList) {
				String text = e.getText();
				if(text.length()>0) {
					System.out.println(count+":"+text);
				}
				count++;
			}
	}

}
