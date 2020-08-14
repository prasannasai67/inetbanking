package com.inetbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deposit {
	WebDriver ldriver;

	public deposit(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[9]/a")
	@CacheLookup
	WebElement withdrawl;
	
	@FindBy(name = "accountno")
	@CacheLookup
	WebElement accountno;
	
	@FindBy(name = "ammount")
	@CacheLookup
	WebElement amount;
	
	@FindBy(name = "desc")
	@CacheLookup
	WebElement description;

	
	public void withdrawl() {
		withdrawl.click();
	}
	public void AccountNo(String acctno) {
		accountno.sendKeys(acctno);	
		}
	
	public void Amount(String ammount) {
		amount.sendKeys(ammount);

	}
	public void Description(String descp) {
		description.sendKeys(descp);
		}
	
	
}
