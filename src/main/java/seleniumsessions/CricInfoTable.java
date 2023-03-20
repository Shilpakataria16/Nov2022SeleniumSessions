package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/ranji-trophy-2022-23-1332913/gujarat-vs-railways-elite-group-d-1333322/full-scorecard");
		
		Thread.sleep(3000);
		
		String wicketTakerName1 = getWicketTakerName("Vivek Singh");
		System.out.println(wicketTakerName1);
	
		String wicketTakerName2 = getWicketTakerName("Karn Sharma");
		System.out.println(wicketTakerName2);
		
		List<String> karnSharmaScoreList=getScoreCardList("Karn Sharma");
		System.out.println(karnSharmaScoreList);
	
		//System.out.println(driver.findElement(By.xpath("(//span[text()='Vivek Singh']/ancestor::td/following-sibling::td)[1]")).getText()); 
		
		//(//span[text()='Vivek Singh']/ancestor::td/following-sibling::td)[1]
	}

	public static String getWicketTakerName(String batsmanName) {
		return driver.findElement(By.xpath("(//span[text()='"+ batsmanName +"']/ancestor::td/following-sibling::td)[1]")).getText();
	}
	
	//span[text()='Karn Sharma']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]
	public static List<String> getScoreCardList(String playerName){
		List<WebElement> scoreList = driver.findElements(By.xpath("//span[text()='"+ playerName +"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		
				List<String> playerScoreList = new ArrayList<String>();
			for(WebElement e: scoreList) {
				String text =e.getText();
				playerScoreList.add(text);
			}
			return playerScoreList;
	}
}
