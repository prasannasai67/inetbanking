package com.inetbanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.AddCustomer;
import com.inetbanking.PageObjects.LoginPage;
import com.inetbanking.PageObjects.deposit;

public class TC_Deposit_004 extends BaseClass {

	@Test
	public void deposit()throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		logger.info("username entered");
		lp.setPassWord(password);
		logger.info("password entered");
		lp.clicksubmit();
		Thread.sleep(3000);
		

		deposit dep = new deposit(driver);
		dep.withdrawl();
		dep.AccountNo(acctno);
		dep.Amount(ammount);
		dep.Description(descp);

		boolean res = driver.getPageSource().contains("Transaction details of Withdrawal for Account 82109");
		try {
			if (res == true) {
				logger.info("testcase passed....");
				Assert.assertTrue(true);
			} else {
				captureScreen(driver, "withdrawl");
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
