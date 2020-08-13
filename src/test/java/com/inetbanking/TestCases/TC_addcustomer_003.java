package com.inetbanking.TestCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.AddCustomer;
import com.inetbanking.PageObjects.LoginPage;

public class TC_addcustomer_003 extends BaseClass {
	@Test
	public void addnewcustomer() throws InterruptedException, IOException {
		LoginPage lp =new LoginPage(driver);
		lp.setUsername(username);
		logger.info("username entered");
		lp.setPassWord(password);
		logger.info("password entered");
		lp.clicksubmit();
		Thread.sleep(3000);
		
		AddCustomer addcust= new AddCustomer(driver);
		addcust.clickAddNewCustomer();
		logger.info("providing customer details");
		addcust.custname("laxmi");
		addcust.female("female");
		addcust.custdob("05", "29", "1992");
		addcust.custaddress("bangalore");
		addcust.custcity("Bangalore");
		addcust.custstate("karnataka");
		addcust.custmobile("8656777778");
		addcust.custemail(ramdomstring()+"@gmail.com");
		addcust.custpin("509209");
		addcust.custpassword("abc@2");
		logger.info("provided customer details");
		addcust.submit();
		Thread.sleep(5000);
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		try {
			if(res==true)
			{
				logger.info("testcase passed....");
				Assert.assertTrue(true);
			}
			else
			{
				captureScreen(driver, "addnewCustomer");
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	
}
