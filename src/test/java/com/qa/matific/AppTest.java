package com.qa.matific;

//import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.qa.pages.home;


public class AppTest extends base {
   
	
	
	@Test
	public void TestLoginButton() throws Exception {
		home objHome = new home(driver);
		objHome.SetValues("afteacher","123");
		
	}
	
	public void TestUserName() {
		
	}
	
	
	//@AfterTest
	public void endTest() {
		//driver.close();
	}
    
}
