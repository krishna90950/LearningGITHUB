package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.test.Basetest;

public class Loginpage {
	
	@FindBy(name = "username")
	WebElement UserNme;
	
	@FindBy(name = "password")
	WebElement Passwd;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement LoginBtn;
	
	@FindBy(xpath = "//img[@alt='profile picture']")
	WebElement imge;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logout;
	
	
	
	public Loginpage() {
		PageFactory.initElements(Basetest.driver, this);
	}
	public void logintoapp(String username, String password){
		
		UserNme.sendKeys(username);
		Passwd.sendKeys(password);
		LoginBtn.click();
		imge.click();
		logout.click();
		
	}

}
