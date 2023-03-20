package seleniumsessions;

public class WaitsInSelenium {

	public static void main(String[] args) {
		//script -->app - fast/slow/very slow
		//sync between script and app
		
		
		//types of wait:
		//1. static wait: sleep(500) - pause 5 secs
		//2. dynamic wait: 10 secs --> element found within 2 secs-->8 secs will be ignored
		  //a. implicitly wait: global wait for all the elements
			//b. explicit wait: on a specific element + polling/interval time + non web element
				//i. WebDriverWait
				//ii. FluentWait
		
		//WebDriverWait(class) --> FluentWait(class) --> Wait(Interface) : Until(method);
									//until(){}
									//other methods{}
		
		
	}

}
