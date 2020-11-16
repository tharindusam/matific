package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class home {
	
	private WebDriver driver = null;
	
	public home(WebDriver driver) {
		this.driver = driver;
	}
	
	By btnLogin = By.xpath("//*[contains(@href,'/au/en-au/login-page/')]");
	By txtUserName = By.xpath("/html/body/div[2]/div/div[1]/form/input[2]");
	By btnNext = By.xpath("//*[contains(@id,'login-button')]");
	By txtPassword = By.xpath("//*[@id=\"password-input\"]");
	By btnLogin2 = By.xpath("//*[@id=\"login-text\"]");
//	By tabClassManagement = By.xpath("//*[contains(@class,'ng-tns-c14-0 selected')]");
	By tabClassManagement = By.xpath("/html/body/div[1]/mt-app/div[1]/mt-site-header/div[1]/div[2]/mt-nav-bar/div[1]/nav[1]/ul/li[2]/a");
	By tabManageClass = By.xpath("/html/body/div[1]/mt-app/div[1]/mt-site-header/div[1]/div[2]/mt-nav-bar/div[1]/nav[2]/ul/li[1]/a");
	
	
	public void login() {
		
		driver.findElement(btnLogin).click();
	}
	
	
	public void EnterUserName(String userName) {
	
	driver.findElement(txtUserName).click();	
	driver.findElement(txtUserName).sendKeys(userName);
	driver.findElement(btnNext).click();	
	}
	
	
	public void EnterPassword(String passWord) {
		
		driver.findElement(txtPassword).sendKeys(passWord);
		driver.findElement(btnLogin2).click();
	}
	
	public void ClickonClassMgt() {
		
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(tabClassManagement));
		driver.findElement(tabClassManagement).click();
		
		
	//	driver.findElement(tabManageClass).click();
	}
	

	public void SetValues(String userName,String passWord) {
		this.login();
		this.EnterUserName(userName);
		this.EnterPassword(passWord);
		this.ClickonClassMgt();
	}
	
	
	

}
