package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {
		String browserName = "chrome";
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver(browserName);
		brUtil.launchURL("https://amazon.com");
		String actualTitle = brUtil.getPageTitle();
		if(actualTitle.contains("Amazon")) {
			System.out.println("title -- pass");
		}
		else
			System.out.println("title -- fail");
		
		String actualUrl = brUtil.getPageURL();
		if(actualUrl.contains("Amazon")) {
			System.out.println("url -- pass");
		}
		else
			System.out.println("url -- fail");
		
		brUtil.quitBrowser();
		
	}

}
