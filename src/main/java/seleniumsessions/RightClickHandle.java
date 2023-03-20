package seleniumsessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		//right click is also called context click
		act.contextClick(rightClickBtn).build().perform();
		
		List<WebElement> rightClickEles=driver.findElements(By.cssSelector("ul.context-menu-list span"));
		
		System.out.println(rightClickEles.size());
		
		
		for(WebElement e: rightClickEles) {
			String eleTxt = e.getText();
			System.out.println(eleTxt);
			if(eleTxt.equals("Copy")) {
				e.click();
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
				break;
			}
		}
		
		
	}

}
