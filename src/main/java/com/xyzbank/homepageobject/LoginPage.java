package com.xyzbank.homepageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyzbank.actiondriver.Action;

public class LoginPage {
	
	public WebDriver driver;
	Action action=new Action();
	
	@FindBy(xpath = "//body[@class='ng-scope']/div[@class='ng-scope']/div[@class='container-fluid ng-scope']/div[@class='ng-scope']//button[.='Customer Login']")
	private WebElement usernameField;
			
			
	@FindBy(name = "pswrd")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@onclick='check(this.form)']")
	private WebElement loginButton;

	    
	public LoginPage(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}	
			
			
	public void login(String name, String pasw) throws InterruptedException {
		Thread.sleep(3000);
		action.typestring(usernameField, name);
		Thread.sleep(3000);
		action.typestring(passwordField, pasw);
		action.click(driver, loginButton);
		action.AlertAccept(driver);
		Thread.sleep(4000);
		
		}
			
	
	
			
			
			

}