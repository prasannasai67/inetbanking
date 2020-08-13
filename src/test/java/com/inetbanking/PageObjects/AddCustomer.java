package com.inetbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	WebDriver ldriver;

	public AddCustomer(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

}
	@FindBy(how =How.XPATH, using="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(name="name")
	@CacheLookup
	WebElement customername;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	@CacheLookup
	WebElement male;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	@CacheLookup
	WebElement female;
	
	@FindBy(name="dob")
	@CacheLookup
	WebElement dateofbirth;
	
	@FindBy(name="addr")
	@CacheLookup
	WebElement address;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement city;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement state;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement pinn;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement telephone;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement emailid;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(name="sub")
	@CacheLookup
	WebElement submit;
	
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
	}
	public void custname(String cname) {
		customername.sendKeys(cname);
		
	}
	public void male(String cgenndermale) {
		male.click();
		
	}
	public void female(String cgenderfemale) {
		female.click();
		
	}
	public void custdob(String mm,String dd, String yy) {
	
	dateofbirth.sendKeys(mm);
	dateofbirth.sendKeys(dd);
	dateofbirth.sendKeys(yy);
		
	}
	public void custaddress(String addrs) {
		address.sendKeys(addrs);
		
	}
	
	public void custcity(String ccity) {
		city.sendKeys(ccity);
		
	}
	

	public void custstate(String cstate) {
		state.sendKeys(cstate);
		
	}
	
	public void custpin(String cpin) {
		pinn.sendKeys(String.valueOf(cpin));
		
	}
	
	public void custmobile(String cmobile) {
		telephone.sendKeys(cmobile);
		
	}
	
	public void custemail(String cemail) {
		emailid.sendKeys(cemail);
		
	}
	
	public void custpassword(String cpassword) {
		password.sendKeys(cpassword);
		
	}
	
	public void submit() {
		submit.click();
		
	}
	
}
