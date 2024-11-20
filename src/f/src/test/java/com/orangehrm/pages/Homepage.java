package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.test.Basetest;

public class Homepage {
	
	
	@FindBy(xpath = "//span[text() = 'Admin']")
	WebElement Adminlink;
	
	@FindBy(xpath = "//img[@alt = 'profile picture']")
	WebElement Imglink;
	
	@FindBy(linkText = "Logout")
	WebElement Lgout;
	
	public Homepage() {
		PageFactory.initElements(Basetest.driver, this);
	}
	
	public void clickAdmin() {
		Adminlink.click();
		
	}
	public void logoutfromorange() {
		Imglink.click();
		Lgout.click();
	}

}
