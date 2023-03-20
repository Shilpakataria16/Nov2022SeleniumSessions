package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	//global pre conditions
	//pre conditions
	//test cases --> test steps --> actual vs expected result -- Assertions
	//post steps
	//post global steps
	
//	Output:
//	BS - startDBConnection
//	BT - createUser
//	BC - launchBrowser
	
//	BM - loginToApp
//	homePageSearchTest    -- test1
//	AM - logOut
	
//	BM - loginToApp
//	homePageTitleTest      --test2
//	AM - logOut
//	
//	BM - loginToApp
//	homePageURLTest     --test3
//	AM - logOut
//	
//	AC - closeBrowser
//	AT - deleteUser
//	AS - disconnectWithDB
	
	@BeforeSuite
	public void startDBConnection() {
		System.out.println("BS - startDBConnection");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT - createUser");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC - launchBrowser");
	}
	
	@BeforeMethod
	public void loginToApp(){
		System.out.println("BM - loginToApp");
	}
	
	@Test
	public void homePageURLTest() {
		System.out.println("homePageURLTest");
	}
	
	@Test
	public void homePageSearchTest() {
		System.out.println("homePageSearchTest");
	}
	
	@Test
	public void homePageTitleTest() {
		System.out.println("homePageTitleTest");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("AM - logOut");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC - closeBrowser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT - deleteUser");
	}
	
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS - disconnectWithDB");
	}
}
