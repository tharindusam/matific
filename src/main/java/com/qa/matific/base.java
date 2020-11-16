package com.qa.matific;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class base {
	
	public WebDriver driver;
	public String URL = "https://dev5.matific.com/au/en-au/home/";
	public String driverPath = "D:\\ChromeDriver/chromedriver.exe";
	
@BeforeMethod 
public void setUp() {
    
    System.setProperty("webdriver.chrome.driver",driverPath);
	driver = new ChromeDriver();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.manage().window().maximize();
//	return driver;
	}
}
