package com.xyzbank.homepagetest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xyzbank.base.Base;
import com.xyzbank.homepageobject.LoginPage;

public class LoginTest extends Base {
	
	private LoginPage loginPage;
	public WebDriver driver;
		
	@BeforeClass
	public void OpenPage() throws IOException, InterruptedException {
	driver = intializEDriver();
	driver.get(prop.getProperty("url"));
	}
	
	@AfterClass
	public void Clouser() {
	driver.quit();
	}
	
	 @Test()
	 public void loginTest() throws InterruptedException {
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 loginPage = new LoginPage(driver);
	 loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	 }
	 
	
	
	
}