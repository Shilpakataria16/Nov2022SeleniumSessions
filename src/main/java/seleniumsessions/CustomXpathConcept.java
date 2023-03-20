package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//xpath: address of the element in html dom
		//1. absolute xpath: starting from the top
		///html/body/header/div/div/div[2]/div/input
		//2. relative xpath: custom xpath
		
		//tag[@attribute='value']
		//input[@name='email']
		//input[@placeholder='E-Mail Address']
		
		/* xpath with 2 attributes*/
		//tag[@attribute1='value1' and @attribute2=value2]
		//input[@name='email' and @type ='text']
		
		
		//tag
		//input
		//a --81
		//assignment total no of links
		//total no of images
		
		/*xpath with or*/
		//input[@type='text' or @type ='email']
		
		//xpath with text()
		//text is not an attribute its the text content of the element
		//dont use @text ..we use text() method
		//tag[text()='value']
		//h2[text()='Returning Customer']
		
		By returningCust = By.xpath("h2[text()='Returning Customer']");
		
		//check my account link is present on the page -- 2lines
		By myAcc = By.xpath("//a[text()='My Account']");
		int myAccCount = driver.findElements(myAcc).size();
		if(myAccCount==2) {
			System.out.println("Pass");
		}
		//forgotten password
		
		//freshworks.com
		
		//text() with attribute
		//tag[@attribute='value' and text()='value']
		//h1[@class='h0-80' and text()='Love your software']   (freshworks.com)
		//tag[@class='list-group-item' and text()='Register']
		//a[text()='Login' and @class='list-group-item']
		
		//tag[@attr1='value' and attr2='value' and text()='value']
		//a[text()='Register' and @class='list-group-item' and @href]
		
		//find all the links with url value
		//a[@href]
		
		//contains() with attribute:
		//tag[contains(@attr,'value')]
		
		//input[contains(@placeholder,'E-Mail')]
		//input[contains(@placeholder,'Address')]
		
		
		//contains with 1 attribute and use another without contains
		//tag[contains(@attr1,'value') and @attr2='value']
		//input[contains(@placeholder,'E-Mail') and @name='email']
		
		//input[contains(@placeholder,'E-Mail') and @name='email' and @type='text']
		
		//dynamic id/attribute:
		//<input id=firstname_123>
		//<input id=firstname_456>
		//<input id=firstname_789>
		
		//By.id("firstname_123"); will not work
		//input[contains(@id,'firstname_')] --right
		
		//contains() with text():
		//tag[contains(text(),'value')]
		//freshworks site
		//p[contains(text(),'marketing, sales, support')]
		
		//h2[conatins(text(),'50000 comapnies')]
		
		//on amazon site get all the links which contains amazon
		//a[contains(text(),'Amazon')]
		
		//contains with text() and attr
		//tag[contains(text(),'value') and contains(@attr,'value')]
		//a[contains(text(),'Science') and contains(@href,'amazon.science')]
		
		//contains with text() and attr without contains
		//tag[contains(text(),'value') and @attr='value']
		//a[contains(text(),'Science' and @class='nav_a')]
		
		//starts-with():
		//tag[starts-with(text(),'value')]
		//a[starts-with(text(),'Amazon')]
		
		//Assignment : fetch paragraph starting with
		//classic.crmpro.com
		
		//small[starts-with(text(),'Free CRM has powerful')]
		
		//ends-with() in xpath??   --NA
		
		//hubspot site
		//input[starts-with(@aria,'')]
		
		
		//position/index based xpath
		//(//input[@class='form-control'])[1]
		// () in above - capture group
		By.xpath("(//input[@class='form-control'])[1]");
		
		//  (//input[@class='form-control'])[position()=1]
		By.xpath("(//input[@class='form-control'])[position()=1]");
		
		//   (//input[@class='form-control'])[last()]
		By.xpath("(//input[@class='form-control'])[last()]");
		
		//xpath for amazon footer links - help
		//  ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]
		
		driver.findElement(By.xpath("((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]")).getText();
		
		
		//----HubSpot application
		// class in locator: className,xPath and css
		//input[@class='form-control private-form__control login-email']
		//input[@class='login-email'] //not valid
		By.xpath("//input[contains(@class,'login-email')]");  //--valid
		
		By.className("form-control private-form__control login-email"); //not valid
		By.className("login-email");
		
		
		//siblings
		//1. Preceding sibling
		//2. following sibling
		
		//parent to child:
		
		//  parent/child  --> direct 
		//  parent//child --> direct+indirect
		
		
		//child to parent
		//*** backward traversing in DOM using xpath
		//input[@id='input-email']/../../../../../../../../../..
		//** immediate parent
		//input[@id='input-email']/..
	
		//** from 1 sibling to another sibling
		//preceding sibling
		//input[@id='input-email']/preceding-sibling::label
		driver.findElement(By.xpath("//input[@id='input-email']/preceding-sibling::label")).getText();
		
		//following sibling
		//label[@for='input-email']/following-sibling::input[@name='email']
		
	
		//a[text()='Romi singh']/parent::td/preceding-sibling::td/input[@type='checkbox']

		// (//a[text()='deepti gupta']/parent::td/following-sibling/td)[position()=1]/a
	
		//a[text()='deepti gupta']/parent::td/following-sibling/td/span
		
		//crickinfo example : grandparent
		//span[text()='Jordan Hermann']/../../../following-sibling::td//span
		//span[text()='Jordan Hermann']/ancestor::td//following-sibling::td//span
		//   (//span[text()='Jordan Hermann']/ancestor::td//following-sibling::td//span)[2]
		
		//click on 6th checkbox
		//   (//input[@name='contact_id'])[6]

		//*[@id='input-firstname']  --> 100 elements search
		//input[@id='input-firstname'] --> 100 elements --> 10 inputs search
	}

}
