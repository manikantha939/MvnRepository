package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.LoginPage;
import com.actitime.pom.Time_TrackPage;

public class BaseClass {
	public static WebDriver driver;
	FileLib fl=new FileLib();
	LoginPage lp;
	Time_TrackPage tp;
	
	@BeforeTest
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://localhost/login.do");
	}
	
	@BeforeMethod
	public void Login() throws IOException {
		lp=new LoginPage(driver);
		lp.getUsername().sendKeys("admin");
		lp.getPassword().sendKeys("manager");
		lp.getLogin().click();
	}
	
	@AfterMethod
	public void Logout() throws InterruptedException {
		tp=new Time_TrackPage(driver);
		tp.getLogout().click();
		Reporter.log("logged out from the application",true);
	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		driver.quit();
	}

}
