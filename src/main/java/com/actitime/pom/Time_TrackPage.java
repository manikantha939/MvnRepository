package com.actitime.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseClass;

public class Time_TrackPage extends BaseClass{

	@FindBy(xpath="//div[text()='TIME-TRACK']")
	private WebElement TimeTrack;
	
	@FindBy(xpath="//span[@class='task']")
	private List<WebElement> tasks;
	
	@FindBy(className="selectedStatusContainer")
	private WebElement selectedStatus;
	
	@FindBy(xpath="//a[text()='Completed']")
	private WebElement TaskStatus;
	
	@FindBy(id="editTaskPopup_commitBtn")
	private WebElement confirmBtn;

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement Logout;

	public WebElement getTaskNameElement(String taskName) {
	    return driver.findElement(By.xpath("//span[text()='" + taskName + "']"));
	}
	
	public WebElement getTimeTrack() {
		return TimeTrack;
	}

	public List<WebElement> getTasks() {
		return tasks;
	}

	public WebElement getSelectedStatus() {
		return selectedStatus;
	}

	public WebElement getTaskStatus() {
		return TaskStatus;
	}

	public WebElement getConfirmBtn() {
		return confirmBtn;
	}

	public WebElement getLogout() {
		return Logout;
	}
	
	public Time_TrackPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
}
