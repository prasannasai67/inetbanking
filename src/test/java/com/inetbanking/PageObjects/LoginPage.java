package com.inetbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(name = "uid")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txtPassWord;

	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement btnlogin;

	@FindBy(xpath = "/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnklogout;

	public void setUsername(String uname) {
		txtUserName.sendKeys(uname);

	}

	public void setPassWord(String pwd) {
		txtPassWord.sendKeys(pwd);

	}

	public void clicksubmit() {
		btnlogin.click();

	}

	public void clickLogout() {
		lnklogout.click();
	}

}
